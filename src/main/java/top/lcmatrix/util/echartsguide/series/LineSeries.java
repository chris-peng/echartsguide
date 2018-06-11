package top.lcmatrix.util.echartsguide.series;

import top.lcmatrix.util.echartsguide.common.CoordinateSystem;
import top.lcmatrix.util.echartsguide.encode.AbsEncode;
import top.lcmatrix.util.echartsguide.encode.GridEncode;
import top.lcmatrix.util.echartsguide.encode.PolarEncode;
import top.lcmatrix.util.echartsguide.option.AreaStyle;

public class LineSeries extends AbsSeries {

	public static final Double COMMON_SMOOTH = 0.5d;
	
	public static class Guide extends AbsSeries.Guide<Guide>{
		private LineSeries series = new LineSeries();
		
		public Guide gridEncode(String xField, String yField){
			GridEncode encode = new GridEncode(xField, yField);
			return encode(encode);
		}
		
		public Guide polarEncode(String radiusField, String angleField){
			PolarEncode encode = new PolarEncode(radiusField, angleField);
			return encode(encode);
		}
		
		public Guide encode(AbsEncode encode){
			series.encode = encode;
			return this;
		}
		
		public Guide smooth(boolean smooth){
			series.smooth = LineSeries.COMMON_SMOOTH;
			return this;
		}
		
		/**
		 * default(为null时): 'cartesian2d' 该系列使用的坐标系
		 * 'cartesian2d' 使用二维的直角坐标系（也称笛卡尔坐标系），通过 xAxisIndex, yAxisIndex指定相应的坐标轴组件。 
		 * 'polar' 使用极坐标系，通过 polarIndex 指定相应的极坐标组件
		 * @param coordinateSystem	见{@link CoordinateSystem}常量
		 * @return
		 */
		public Guide coordinateSystem(String coordinateSystem){
			series.coordinateSystem = coordinateSystem;
			return this;
		}
		
		public Guide xAxisIndex(int xAxisIndex){
			series.xAxisIndex = xAxisIndex;
			return this;
		}
		
		public Guide yAxisIndex(int yAxisIndex){
			series.yAxisIndex = yAxisIndex;
			return this;
		}
		
		public Guide polarIndex(int polarIndex){
			series.polarIndex = polarIndex;
			return this;
		}
		
		public Guide stack(String stack){
			series.stack = stack;
			return this;
		}
		
		/**
		 * 
		 * @param areaColor	颜色可以使用 RGB 表示，比如 'rgb(128, 128, 128)'，如果想要加上 alpha 通道表示不透明度，可以使用 RGBA，比如 'rgba(128, 128, 128, 0.5)'，也可以使用十六进制格式，比如 '#ccc'。
		 * 除了纯色之外颜色也支持渐变色和纹理填充(见echarts官方文档)
		 * @return
		 */
		public Guide areaColor(String areaColor){
			return areaStyle(new AreaStyle(areaColor));
		}
		
		public Guide areaStyle(AreaStyle areaStyle){
			series.areaStyle = areaStyle;
			return this;
		}

		/**
		 * 获得一个系列，默认值如下：					<br/>
		 * datasetIndex：0						<br/>
		 * coordinateSystem 坐标系：'cartesian2d' 直角坐标系	<br/>
		 * xAxisIndex：0							<br/>
		 * yAxisIndex：0							<br/>
		 * polarIndex：0							<br/>
		 * smooth：false							<br/>
		 * 
		 * @return
		 */
		@Override
		public LineSeries getSeries() {
			return series;
		}
	}

	private final String type = "line";
	/**
	 * default(为null时): 'cartesian2d' 该系列使用的坐标系'cartesian2d'
	 * 使用二维的直角坐标系（也称笛卡尔坐标系），通过 xAxisIndex, yAxisIndex指定相应的坐标轴组件。 'polar'
	 * 使用极坐标系，通过 polarIndex 指定相应的极坐标组件
	 */
	private String coordinateSystem;
	/**
	 * default(为null时): 0 使用的 x 轴的 index，在单个图表实例中存在多个 x 轴的时候有用
	 */
	private Integer xAxisIndex;
	/**
	 * default(为null时): 0 使用的 y 轴的 index，在单个图表实例中存在多个 y 轴的时候有用
	 */
	private Integer yAxisIndex;
	/**
	 * default(为null时): 0 使用的极坐标系的 index，在单个图表实例中存在多个极坐标系的时候有用
	 */
	private Integer polarIndex;
	/**
	 * default(为null时): true 是否显示 symbol, 如果 false 则只有在 tooltip hover 的时候显示
	 */
	private Boolean showSymbol;
	/**
	 * default(为null时): false 标志图形默认只有主轴显示（随主轴标签间隔隐藏策略），如需全部显示可把 showAllSymbol
	 * 设为 true
	 */
	private Boolean showAllSymbol;
	/**
	 * 数据堆叠，同个类目轴上系列配置相同的stack值后，后一个系列的值会在前一个系列的值上相加
	 */
	private String stack;
	/**
	 * default(为null时): 0 如果是 boolean 类型，则表示是否开启平滑处理。如果是 number 类型（取值范围 0 到
	 * 1），表示平滑程度，越小表示越接近折线段，反之则反。设为 true 时相当于设为 0.5
	 */
	private Double smooth;
	
	private AreaStyle areaStyle;

	public String getType() {
		return type;
	}

	public String getCoordinateSystem() {
		return coordinateSystem;
	}

	public void setCoordinateSystem(String coordinateSystem) {
		this.coordinateSystem = coordinateSystem;
	}

	public Integer getxAxisIndex() {
		return xAxisIndex;
	}

	public void setxAxisIndex(Integer xAxisIndex) {
		this.xAxisIndex = xAxisIndex;
	}

	public Integer getyAxisIndex() {
		return yAxisIndex;
	}

	public void setyAxisIndex(Integer yAxisIndex) {
		this.yAxisIndex = yAxisIndex;
	}

	public Integer getPolarIndex() {
		return polarIndex;
	}

	public void setPolarIndex(Integer polarIndex) {
		this.polarIndex = polarIndex;
	}

	public Boolean getShowSymbol() {
		return showSymbol;
	}

	public void setShowSymbol(Boolean showSymbol) {
		this.showSymbol = showSymbol;
	}

	public Boolean getShowAllSymbol() {
		return showAllSymbol;
	}

	public void setShowAllSymbol(Boolean showAllSymbol) {
		this.showAllSymbol = showAllSymbol;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}

	public Double getSmooth() {
		return smooth;
	}

	public void setSmooth(Double smooth) {
		this.smooth = smooth;
	}

	public AreaStyle getAreaStyle() {
		return areaStyle;
	}

	public void setAreaStyle(AreaStyle areaStyle) {
		this.areaStyle = areaStyle;
	}
}
