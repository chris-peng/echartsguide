package top.lcmatrix.util.echartsguide.series;

import top.lcmatrix.util.echartsguide.common.CoordinateSystem;
import top.lcmatrix.util.echartsguide.encode.AbsEncode;
import top.lcmatrix.util.echartsguide.encode.GeoEncode;
import top.lcmatrix.util.echartsguide.encode.GridEncode;
import top.lcmatrix.util.echartsguide.encode.PolarEncode;

public class EffectScatterSeries extends AbsSeries{
	
	/**
	 * 涟漪特效
	 */
	public static final String EFFECT_TYPE_RIPPLE = "ripple";
	
	/**
	 * 绘制完成后显示特效
	 */
	public static final String EFFECT_ON_RENDER = "render";
	/**
	 * 高亮（hover）的时候显示特效
	 */
	public static final String EFFECT_ON_EMPHASIS = "emphasis";
	
	public static class Guide extends AbsSeries.Guide<Guide>{
		
		private EffectScatterSeries series = new EffectScatterSeries();
		
		public Guide gridEncode(String xField, String yField){
			GridEncode encode = new GridEncode(xField, yField);
			return encode(encode);
		}
		
		public Guide polarEncode(String radiusField, String angleField){
			PolarEncode encode = new PolarEncode(radiusField, angleField);
			return encode(encode);
		}
		
		public Guide geoEncode(String lngField, String latField){
			GeoEncode encode = new GeoEncode(lngField, latField);
			return encode(encode);
		}
		
		public Guide encode(AbsEncode encode){
			series.encode = encode;
			return this;
		}
		
		/**
		 * 特效类型，默认为ripple
		 * @param effectType	见{@link EffectScatterSeries}的EFFECT_TYPE_*常量
		 * @return
		 */
		public Guide effectType(String effectType){
			series.effectType = effectType;
			return this;
		}
		
		/**
		 * 配置何时显示特效，默认为render
		 * @param showEffectOn		见{@link EffectScatterSeries}的EFFECT_ON_*常量
		 * @return
		 */
		public Guide showEffectOn(String showEffectOn){
			series.showEffectOn = showEffectOn;
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
		
		public Guide geoIndex(int geoIndex){
			series.geoIndex = geoIndex;
			return this;
		}
		
		/**
		 * 
		 * @param symbol	见{@link Symbol}常量
		 * @return
		 */
		public Guide symbol(String symbol){
			series.symbol = symbol;
			return this;
		}
		
		public Guide symbolSize(int symbolSize){
			series.symbolSize = symbolSize;
			return this;
		}
		
		/**
		 * 标记的旋转角度。注意在 markLine 中当 symbol 为 'arrow' 时会忽略 symbolRotate 强制设置为切线的角度
		 * @param symbolRotate
		 * @return
		 */
		public Guide symbolRotate(int symbolRotate){
			series.symbolRotate = symbolRotate;
			return this;
		}
		
		/**
		 * 设置图元偏移，默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。
		例如 [0, '50%'] 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。
		 * @param xOffset		水平方向的偏移，支持数字和百分数
		 * @param yOffset		垂直方向的便宜，支持数字和百分数
		 * @return
		 */
		public Guide symbolOffset(String xOffset, String yOffset){
			series.symbolOffset = new String[]{xOffset, yOffset};
			return this;
		}
		
		/**
		 * 是否开启大规模散点图的优化，在数据图形特别多的时候（>=5k）可以开启。
		开启后配合 largeThreshold 在数据量大于指定阈值的时候对绘制进行优化。
		缺点：优化后不能自定义设置单个数据项的样式。
		 * @param large
		 * @return
		 */
		public Guide large(boolean large){
			series.large = large;
			return this;
		}
		
		/**
		 * 开启绘制优化的阈值，默认2000
		 * @param largeThreshold
		 * @return
		 */
		public Guide largeThreshold(int largeThreshold){
			series.largeThreshold = largeThreshold;
			return this;
		}

		@Override
		public AbsSeries getSeries() {
			return series;
		}
	}

	private String type="effectScatter";
	
	/**
	 * 特效类型，目前只支持涟漪特效'ripple'，默认为ripple，见{@link EffectScatterSeries}的EFFECT_TYPE_*常量
	 */
	private String effectType;
	
	/**
	 * 配置何时显示特效，见{@link EffectScatterSeries}的EFFECT_ON_*常量
	 */
	private String showEffectOn;
	
	private String coordinateSystem;
	
	private Integer xAxisIndex;
	private Integer yAxisIndex;
	private Integer polarIndex;
	private Integer geoIndex;
	
	private String symbol;
	private Integer symbolSize;
	private Integer symbolRotate;
	/**
	 * 标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。
		例如 [0, '50%'] 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。
	 */
	private String[] symbolOffset;
	
	/**
	 * 是否开启大规模散点图的优化，在数据图形特别多的时候（>=5k）可以开启。
		开启后配合 largeThreshold 在数据量大于指定阈值的时候对绘制进行优化。
		缺点：优化后不能自定义设置单个数据项的样式。
	 */
	private Boolean large;
	
	/**
	 * 开启绘制优化的阈值，默认2000
	 */
	private Integer largeThreshold;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Integer getGeoIndex() {
		return geoIndex;
	}

	public void setGeoIndex(Integer geoIndex) {
		this.geoIndex = geoIndex;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getSymbolSize() {
		return symbolSize;
	}

	public void setSymbolSize(Integer symbolSize) {
		this.symbolSize = symbolSize;
	}

	public Integer getSymbolRotate() {
		return symbolRotate;
	}

	public void setSymbolRotate(Integer symbolRotate) {
		this.symbolRotate = symbolRotate;
	}

	public String[] getSymbolOffset() {
		return symbolOffset;
	}

	public void setSymbolOffset(String[] symbolOffset) {
		this.symbolOffset = symbolOffset;
	}

	public Boolean getLarge() {
		return large;
	}

	public void setLarge(Boolean large) {
		this.large = large;
	}

	public Integer getLargeThreshold() {
		return largeThreshold;
	}

	public void setLargeThreshold(Integer largeThreshold) {
		this.largeThreshold = largeThreshold;
	}

	public String getEffectType() {
		return effectType;
	}

	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	public String getShowEffectOn() {
		return showEffectOn;
	}

	public void setShowEffectOn(String showEffectOn) {
		this.showEffectOn = showEffectOn;
	}
}
