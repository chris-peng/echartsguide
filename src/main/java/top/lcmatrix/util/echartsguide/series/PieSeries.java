package top.lcmatrix.util.echartsguide.series;

import top.lcmatrix.util.echartsguide.common.SelectedMode;
import top.lcmatrix.util.echartsguide.encode.PieEncode;

public class PieSeries extends AbsSeries {

	public static class Guide extends AbsSeries.Guide<Guide>{
		private PieSeries series = new PieSeries();
		
		public Guide encode(String itemName, String value){
			PieEncode encode = new PieEncode(itemName, value);
			return encode(encode);
		}
		
		public Guide encode(PieEncode encode){
			series.encode = encode;
			return this;
		}
		
		/**
		 * 设置是否显示成南丁格尔图
		 * @param roseType	是否显示成南丁格尔图
		 * @return
		 */
		public Guide roseType(boolean roseType){
			series.roseType = roseType;
			return this;
		}
		
		/**
		 * 设置饼图的中心位置
		 * @param centerX	饼图的中心（圆心）横坐标，支持百分数和数字
		 * @param centerY	饼图的中心（圆心）纵坐标，支持百分数和数字
		 * @return
		 */
		public Guide center(String centerX, String centerY){
			series.center = new String[]{centerX, centerY};
			return this;
		}
		
		/**
		 * 设置饼图的内径和外径
		 * @param innerRadius	饼图的内径，支持百分数和数字
		 * @param outerRadius	饼图的外径，支持百分数和数字
		 * @return
		 */
		public Guide radius(String innerRadius, String outerRadius){
			series.radius = new String[]{innerRadius, outerRadius};
			return this;
		}
		
		/**
		 * 设置是否多选
		 * @param multiSelectedMode
		 * @return
		 */
		public Guide selectedMode(boolean multiSelectedMode){
			if(multiSelectedMode){
				series.selectedMode = SelectedMode.MULTIPLE;
			}else{
				series.selectedMode = SelectedMode.SINGLE;
			}
			return this;
		}
		
		/**
		 * 设置起始角度，支持范围[0, 360]
		 * @param startAngle	起始角度，支持范围[0, 360]
		 * @return
		 */
		public Guide startAngle(int startAngle){
			series.startAngle = startAngle;
			return this;
		}
		
		/**
		 * 设置最小的扇区角度（0 ~ 360），用于防止某个值过小导致扇区太小影响交互
		 * @param startAngle	最小的扇区角度（0 ~ 360），用于防止某个值过小导致扇区太小影响交互
		 * @return
		 */
		public Guide minAngle(int minAngle){
			series.minAngle = minAngle;
			return this;
		}

		/**
		 * 获得一个系列，默认值如下：					<br/>
		 * datasetIndex：0						<br/>
		 * roseType 是否显示成南丁格尔图：false			<br/>
		 * center 饼图中心位置：['50%','50%']		<br/>
		 * radius 内外径大小：[0, '75%']			<br/>
		 * selectedMode：'single'				<br/>
		 * startAngle 起始角度：90					<br/>
		 * minAngle 最小扇区角度：0					<br/>
		 * @return
		 */
		@Override
		public PieSeries getSeries() {
			return series;
		}
	}

	private final String type = "pie";
	
	/**
	 * default(为null时): 'single'
	 * 选中模式，单选或多选，可选值见SELECTED_MODE_*常量
	 */
	private String selectedMode;
	
	/**
	 * default(为null时): 90
	 * 起始角度，支持范围[0, 360]
	 */
	private Integer startAngle;
	
	/**
	 * default(为null时): 0
	 * 最小的扇区角度（0 ~ 360），用于防止某个值过小导致扇区太小影响交互
	 */
	private Integer minAngle;
	
	/**
	 * default(为null时): false
	 * 是否展示成南丁格尔图，通过半径区分数据大小。支持radius和area两种模式，这里仅支持radius一种模式，用布尔值true表示
	 */
	private Boolean roseType;
	
	/**
	 * default(为null时): ['50%', '50%']
	 * 饼图的中心（圆心）坐标，数组的第一项是横坐标，第二项是纵坐标
	 * 支持设置成百分比，设置成百分比时第一项是相对于容器宽度，第二项是相对于容器高度
	 * 支持字符串类型的数字，表示像素数，如['500', '500']
	 */
	private String[] center;
	
	/**
	 * default(为null时): [0, '75%']
	 * 饼图的半径，数组的第一项是内半径，第二项是外半径
	 * 支持设置成百分比，相对于容器高宽中较小的一项的一半，支持字符串类型的数字，表示像素数，如['500', '500']
	 * 可以将内半径设大显示成圆环图（Donut chart）
	 */
	private String[] radius;

	public String getSelectedMode() {
		return selectedMode;
	}

	public void setSelectedMode(String selectedMode) {
		this.selectedMode = selectedMode;
	}

	public Integer getStartAngle() {
		return startAngle;
	}

	public void setStartAngle(Integer startAngle) {
		this.startAngle = startAngle;
	}

	public Integer getMinAngle() {
		return minAngle;
	}

	public void setMinAngle(Integer minAngle) {
		this.minAngle = minAngle;
	}

	public Boolean getRoseType() {
		return roseType;
	}

	public void setRoseType(Boolean roseType) {
		this.roseType = roseType;
	}

	public String[] getCenter() {
		return center;
	}

	public void setCenter(String[] center) {
		this.center = center;
	}

	public String[] getRadius() {
		return radius;
	}

	public void setRadius(String[] radius) {
		this.radius = radius;
	}

	public String getType() {
		return type;
	}
}
