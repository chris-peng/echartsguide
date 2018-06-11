package top.lcmatrix.util.echartsguide.series;

import java.util.ArrayList;
import java.util.List;

import top.lcmatrix.util.echartsguide.encode.AbsEncode;
import top.lcmatrix.util.echartsguide.option.Label;
import top.lcmatrix.util.echartsguide.option.Tooltip;
import top.lcmatrix.util.echartsguide.series.mark.MarkArea;
import top.lcmatrix.util.echartsguide.series.mark.MarkLine;
import top.lcmatrix.util.echartsguide.series.mark.MarkPoint;
import top.lcmatrix.util.echartsguide.series.mark.Point;

public abstract class AbsSeries {
	
	@SuppressWarnings("unchecked")
	public static abstract class Guide<T extends Guide<T>>{
		
		public T name(String name){
			getSeries().name = name;
			return (T)this;
		}
		
		/**
		 * 设置标签内容格式器，支持字符串模板和回调函数两种形式，字符串模板与回调函数返回的字符串均支持用 \n 换行。
			<br/>字符串模板 模板变量有：
			<br/>{a}：系列名。
			<br/>{b}：数据名。
			<br/>{c}：数据值。
			<br/>{@xxx}：数据中名为'xxx'的维度的值，如{@product}表示名为'product'` 的维度的值。
			<br/>{@[n]}：数据中维度n的值，如{@[3]}` 表示维度 3 的值，从 0 开始计数。
		 * @param formatter
		 * @return
		 */
		public T labelFormatter(String formatter){
			AbsSeries series = getSeries();
			if(series.label == null){
				series.label = new Label();
			}
			getSeries().label.setFormatter(formatter);
			return (T)this;
		}
		
		public T label(Label label){
			getSeries().label = label;
			return (T)this;
		}
		
		public T datasetIndex(int datasetIndex){
			getSeries().datasetIndex = datasetIndex;
			return (T)this;
		}
		
		/**
		 * 仅在chart的tooltip.trigger为 'item' 时有效，提示框浮层内容格式器，支持字符串模板
		 * <br/>模板变量有 {a}, {b}，{c}，{d}，{e}，分别表示系列名，数据名，数据值等。 在 trigger 为 'axis' 的时候，会有多个系列的数据，此时可以通过 {a0}, {a1}, {a2} 这种后面加索引的方式表示系列的索引。 不同图表类型下的 {a}，{b}，{c}，{d} 含义不一样。 其中变量{a}, {b}, {c}, {d}在不同图表类型下代表数据含义为：
			<br/>模板变量将来还可能支持{@fieldname}形式（目前lable已经支持）
			<br/>
			<br/>折线（区域）图、柱状（条形）图、K线图 : {a}（系列名称），{b}（类目值），{c}（数值）, {d}（无）
			<br/>散点图（气泡）图 : {a}（系列名称），{b}（数据名称），{c}（数值数组）, {d}（无）
			<br/>地图 : {a}（系列名称），{b}（区域名称），{c}（合并数值）, {d}（无）
			<br/>饼图、仪表盘、漏斗图: {a}（系列名称），{b}（数据项名称），{c}（数值）, {d}（百分比）
		 * @param formatter
		 * @return
		 */
		public T tooltipFormatter(String formatter){
			AbsSeries series = getSeries();
			series.tooltip = new Tooltip();
			series.tooltip.setFormatter(formatter);
			return (T)this;
		}
		
		public T markPoint(MarkPoint markPoint){
			getSeries().markPoint = markPoint;
			return (T) this;
		}
		
		public T addMarkPoint(Point point){
			AbsSeries series = getSeries();
			if(series.markPoint == null){
				series.markPoint = new MarkPoint();
			}
			List<Point> points = series.markPoint.getData();
			if(points == null){
				points = new ArrayList<Point>();
				series.markPoint.setData(points);
			}
			points.add(point);
			return (T) this;
		}
		
		public T markLine(MarkLine markLine){
			getSeries().markLine = markLine;
			return (T) this;
		}
		
		/**
		 * 添加一条标记线
		 * @param startPoint		标记线起点
		 * @param endPoint			标记线终点，可为null，表示与轴平行的线
		 * @return
		 */
		public T addMarkLine(Point startPoint, Point endPoint){
			AbsSeries series = getSeries();
			if(series.markLine == null){
				series.markLine = new MarkLine();
			}
			List<Object> lines = series.markLine.getData();
			if(lines == null){
				lines = new ArrayList<Object>();
				series.markLine.setData(lines);
			}
			if(endPoint != null){
				lines.add(new Point[]{startPoint, endPoint});
			}else{
				lines.add(startPoint);
			}
			return (T) this;
		}
		
		public T markArea(MarkArea markArea){
			getSeries().markArea = markArea;
			return (T) this;
		}
		
		/**
		 * 添加一个标记区域
		 * @param leftTopPoint			区域左上角点
		 * @param rightBottomPoint		区域右下角点
		 * @return
		 */
		public T addMarkArea(Point leftTopPoint, Point rightBottomPoint){
			AbsSeries series = getSeries();
			if(series.markArea == null){
				series.markArea = new MarkArea();
			}
			List<Point[]> areas = series.markArea.getData();
			if(areas == null){
				areas = new ArrayList<Point[]>();
				series.markArea.setData(areas);
			}
			areas.add(new Point[]{leftTopPoint, rightBottomPoint});
			return (T) this;
		}
		
		/**
		 * 所有图形的 zlevel 值，默认为0
		 * zlevel用于 Canvas 分层，不同zlevel值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的zlevel。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃
		 * zlevel 大的 Canvas 会放在 zlevel 小的 Canvas 的上面
		 * @param zlevel
		 * @return
		 */
		public T zlevel(double zlevel){
			getSeries().zlevel = zlevel;
			return (T)this;
		}
		
		/**
		 * 组件的所有图形的z值。控制图形的前后顺序。默认为2
		 * z值小的图形会被z值大的图形覆盖，z相比zlevel优先级更低，而且不会创建新的 Canvas
		 * @param z
		 * @return
		 */
		public T z(double z){
			getSeries().z = z;
			return (T)this;
		}
		
		/**
		 * 坐标轴是否是静态无法交互，默认为false
		 * @param silent
		 * @return
		 */
		public T silent(boolean silent){
			getSeries().silent = silent;
			return (T)this;
		}
		
		public abstract AbsSeries getSeries();
	}
	
	protected String type;
	/**
	 * default(为null时)(为null时): 0
	 */
	protected Integer datasetIndex;
	protected AbsEncode encode;
	/**
	 * 系列名称，用于tooltip的显示，legend 的图例筛选，在 setOption 更新数据和配置项时用于指定对应的系列。
	 */
	protected String name;
	
	protected Label label;
	
	/**
	 * 仅在chart的tooltip.trigger为 'item' 时有效
	 */
	protected Tooltip tooltip;
	
	/**
	 * default(为null时)(为null时): 0
	 * 所有图形的 zlevel 值
	 * zlevel用于 Canvas 分层，不同zlevel值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的zlevel。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃
	 * zlevel 大的 Canvas 会放在 zlevel 小的 Canvas 的上面
	 */
	protected Double zlevel;
	/**
	 * default(为null时)(为null时): 2
	 * 组件的所有图形的z值。控制图形的前后顺序。z值小的图形会被z值大的图形覆盖
	 * z相比zlevel优先级更低，而且不会创建新的 Canvas
	 */
	protected Double z;
	/**
	 * default(为null时): false
	 * 坐标轴是否是静态无法交互
	 */
	protected Boolean silent;
	
	protected MarkPoint markPoint;
	protected MarkLine markLine;
	protected MarkArea markArea;

	public Integer getDatasetIndex() {
		return datasetIndex;
	}

	public void setDatasetIndex(Integer datasetIndex) {
		this.datasetIndex = datasetIndex;
	}

	public String getType() {
		return type;
	}

	public AbsEncode getEncode() {
		return encode;
	}

	public void setEncode(AbsEncode encode) {
		this.encode = encode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getZlevel() {
		return zlevel;
	}

	public void setZlevel(Double zlevel) {
		this.zlevel = zlevel;
	}

	public Double getZ() {
		return z;
	}

	public void setZ(Double z) {
		this.z = z;
	}

	public Boolean getSilent() {
		return silent;
	}

	public void setSilent(Boolean silent) {
		this.silent = silent;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public MarkPoint getMarkPoint() {
		return markPoint;
	}

	public void setMarkPoint(MarkPoint markPoint) {
		this.markPoint = markPoint;
	}

	public MarkLine getMarkLine() {
		return markLine;
	}

	public void setMarkLine(MarkLine markLine) {
		this.markLine = markLine;
	}

	public MarkArea getMarkArea() {
		return markArea;
	}

	public void setMarkArea(MarkArea markArea) {
		this.markArea = markArea;
	}
}
