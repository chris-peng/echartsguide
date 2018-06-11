package top.lcmatrix.util.echartsguide.series;

import top.lcmatrix.util.echartsguide.common.CoordinateSystem;
import top.lcmatrix.util.echartsguide.encode.AbsEncode;
import top.lcmatrix.util.echartsguide.encode.GridEncode;
import top.lcmatrix.util.echartsguide.encode.PolarEncode;

public class BarSeries extends AbsSeries {

	public static class Guide extends AbsSeries.Guide<Guide>{
		private BarSeries series = new BarSeries();
		
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
		 * 获得一个系列，默认值如下：					<br/>
		 * datasetIndex：0						<br/>
		 * coordinateSystem 坐标系：'cartesian2d' 直角坐标系	<br/>
		 * xAxisIndex：0							<br/>
		 * yAxisIndex：0							<br/>
		 * polarIndex：0							<br/>
		 * 
		 * @return
		 */
		@Override
		public BarSeries getSeries(){
			return series;
		}
	}

	private final String type = "bar";
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
	 * 数据堆叠，同个类目轴上系列配置相同的stack值后，后一个系列的值会在前一个系列的值上相加
	 */
	private String stack;
	
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

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}
}
