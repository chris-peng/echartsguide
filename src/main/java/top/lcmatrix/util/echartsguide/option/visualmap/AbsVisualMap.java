package top.lcmatrix.util.echartsguide.option.visualmap;

import java.util.ArrayList;
import java.util.List;

import top.lcmatrix.util.echartsguide.common.Orient;
import top.lcmatrix.util.echartsguide.common.Symbol;

public abstract class AbsVisualMap {
	
	@SuppressWarnings("unchecked")
	public abstract static class Guide<T extends Guide<T>>{
		public T min(double min){
			getVisualMap().min = min;
			return (T) this;
		}
		
		public T max(double max){
			getVisualMap().max = max;
			return (T) this;
		}
		
		/**
		 * 是否反转 visualMap 组件
		 * @param inverse
		 * @return
		 */
		public T inverse(boolean inverse){
			getVisualMap().inverse = inverse;
			return (T) this;
		}
		
		/**
		 * 设置数据展示的小数精度，默认为0，无小数点
		 * @param precision
		 * @return
		 */
		public T precision(int precision){
			getVisualMap().precision = precision;
			return (T) this;
		}
		
		/**
		 * visualMap 组件两端的文本，如 ['Low', 'High']
		 * @param startText
		 * @param endText
		 * @return
		 */
		public T text(String minText, String maxText){
			getVisualMap().text = new String[]{maxText, minText};
			return (T) this;
		}
		
		/**
		 * 是否显示 visualMap 组件。如果设置为 false，不会显示，但是数据映射的功能还存在
		 * @param show
		 * @return
		 */
		public T show(boolean show){
			getVisualMap().show = show;
			return (T) this;
		}
		
		/**
		 * 添加取哪个系列的数据，即哪个系列的 series.data，默认取所有系列
		 * @param seriesIndex
		 * @return
		 */
		public T addSeriesIndex(int seriesIndex){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.seriesIndex == null){
				visualMap.seriesIndex = new ArrayList<>();
			}
			visualMap.seriesIndex.add(seriesIndex);
			return (T) this;
		}
		
		/**
		 * 指定用数据的『哪个维度』，映射到视觉元素上，默认取 data 中最后一个维度
		 * @param dimension
		 * @return
		 */
		public T dimension(String dimension){
			getVisualMap().dimension = dimension;
			return (T) this;
		}
		
		/**
		 * 如何放置 visualMap 组件
		 * @param orient	见类{@link Orient}的常量
		 * @return
		 */
		public T orient(String orient){
			getVisualMap().orient = orient;
			return (T) this;
		}
		
		/**
		 * 值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'center', 'right'
		 * @param left
		 * @return
		 */
		public T left(String left){
			getVisualMap().left = left;
			return (T) this;
		}
		
		/**
		 * 值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'top', 'middle', 'bottom'
		 * @param top
		 * @return
		 */
		public T top(String top){
			getVisualMap().top = top;
			return (T) this;
		}
		
		/**
		 * 值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比
		 * @param right
		 * @return
		 */
		public T right(String right){
			getVisualMap().right = right;
			return (T) this;
		}
		
		/**
		 * bottom 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比
		 * @param bottom
		 * @return
		 */
		public T bottom(String bottom){
			getVisualMap().bottom = bottom;
			return (T) this;
		}
		
		/**
		 * x 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'middle', 'center', 'right'
		 * @param x
		 * @return
		 */
		public T x(String x){
			getVisualMap().x = x;
			return (T) this;
		}
		
		/**
		 * y 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'middle', 'center', 'right'
		 * @param y
		 * @return
		 */
		public T y(String y){
			getVisualMap().y = y;
			return (T) this;
		}
		
		public T itemWidth(double itemWidth){
			getVisualMap().itemWidth = itemWidth;
			return (T) this;
		}
		
		public T itemHeight(double itemHeight){
			getVisualMap().itemHeight = itemHeight;
			return (T) this;
		}
		
		/**
		 * zlevel用于 Canvas 分层，不同zlevel值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的zlevel。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃
		 * zlevel 大的 Canvas 会放在 zlevel 小的 Canvas 的上面
		 * @param zlevel
		 * @return
		 */
		public T zlevel(double zlevel){
			getVisualMap().zlevel = zlevel;
			return (T) this;
		}
		
		/**
		 * 组件的所有图形的z值。控制图形的前后顺序。z值小的图形会被z值大的图形覆盖
		 * z相比zlevel优先级更低，而且不会创建新的 Canvas
		 * @param z
		 * @return
		 */
		public T z(double z){
			getVisualMap().z = z;
			return (T) this;
		}
		
		/**
		 * 设置图标类型
		 * @param symbol	见类{@link Symbol}的常量
		 * @return
		 */
		public T inRangeSymbol(String symbol){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setSymbol(symbol);
			return (T) this;
		}
		
		public T inRangeSymbolSize(int size){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setSymbolSize(size);
			return (T) this;
		}
		
		public T inRangeSymbolSize(int minSize, int maxSize){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setSymbolSize(new int[]{minSize, maxSize});
			return (T) this;
		}
		
		/**
		 * 设置图元颜色
		 * @param color
		 * @return
		 */
		public T inRangeSymbolColor(String color){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColor(color);
			return (T) this;
		}
		
		/**
		 * 设置图元颜色映射范围
		 * @param colorRange	如['#121122', 'rgba(3,4,5,0.4)', 'red']
		 * @return
		 */
		public T inRangeSymbolColor(String[] colorRange){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColor(colorRange);
			return (T) this;
		}
		
		/**
		 * 设置图元的颜色的透明度
		 * @param colorAlpha	取值范围0~1
		 * @return
		 */
		public T inRangeSymbolColorAlpha(double colorAlpha){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorAlpha(colorAlpha);
			return (T) this;
		}
		
		/**
		 * 设置图元的颜色的透明度映射范围
		 * @param minColorAlpha		取值范围0~1
		 * @param maxColorAlpha		取值范围0~1
		 * @return
		 */
		public T inRangeSymbolColorAlpha(double minColorAlpha, double maxColorAlpha){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorAlpha(new double[]{minColorAlpha, maxColorAlpha});
			return (T) this;
		}
		
		/**
		 * 设置图元以及其附属物（如文字标签）的透明度
		 * @param opacity	取值范围0~1
		 * @return
		 */
		public T inRangeSymbolOpacity(double opacity){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setOpacity(opacity);
			return (T) this;
		}
		
		/**
		 * 设置图元以及其附属物（如文字标签）的透明度映射范围
		 * @param minOpacity	取值范围0~1
		 * @param maxOpacity	取值范围0~1
		 * @return
		 */
		public T inRangeSymbolOpacity(double minOpacity, double maxOpacity){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setOpacity(new double[]{minOpacity, maxOpacity});
			return (T) this;
		}
		
		/**
		 * 设置颜色的明暗度
		 * @param colorLightness	取值范围0~1
		 * @return
		 */
		public T inRangeSymbolColorLightness(double colorLightness){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorLightness(colorLightness);
			return (T) this;
		}
		
		/**
		 * 设置颜色的明暗度映射范围
		 * @param minColorLightness		取值范围0~1
		 * @param maxColorLightness		取值范围0~1
		 * @return
		 */
		public T inRangeSymbolColorLightness(double minColorLightness, double maxColorLightness){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorLightness(new double[]{minColorLightness, maxColorLightness});
			return (T) this;
		}
		
		/**
		 * 设置颜色的饱和度
		 * @param colorSaturation	取值范围0~1
		 * @return
		 */
		public T inRangeSymbolColorSaturation(double colorSaturation){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorSaturation(colorSaturation);
			return (T) this;
		}
		
		/**
		 * 设置颜色的饱和度映射范围
		 * @param minColorSaturation	取值范围0~1
		 * @param maxColorSaturation	取值范围0~1
		 * @return
		 */
		public T inRangeSymbolColorSaturation(double minColorSaturation, double maxColorSaturation){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorSaturation(new double[]{minColorSaturation, maxColorSaturation});
			return (T) this;
		}
		
		/**
		 * 设置颜色的色调
		 * @param colorHue		取值范围0~360
		 * @return
		 */
		public T inRangeSymbolColorHue(double colorHue){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorHue(colorHue);
			return (T) this;
		}
		
		/**
		 * 设置颜色的色调映射范围
		 * @param minColorHue	取值范围0~360
		 * @param maxColorHue	取值范围0~360
		 * @return
		 */
		public T inRangeSymbolColorHue(double minColorHue, double maxColorHue){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorHue(new double[]{minColorHue, maxColorHue});
			return (T) this;
		}
		
		
		/**
		 * 设置图标类型（超出选中范围）
		 * @param symbol	见类{@link Symbol}的常量
		 * @return
		 */
		public T outOfRangeSymbol(String symbol){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setSymbol(symbol);
			return (T) this;
		}
		
		public T outOfRangeSymbolSize(int size){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setSymbolSize(size);
			return (T) this;
		}
		
		public T outOfRangeSymbolSize(int minSize, int maxSize){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setSymbolSize(new int[]{minSize, maxSize});
			return (T) this;
		}
		
		/**
		 * 设置图元颜色（超出选中范围）
		 * @param color
		 * @return
		 */
		public T outOfRangeSymbolColor(String color){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColor(color);
			return (T) this;
		}
		
		/**
		 * 设置图元颜色映射范围（超出选中范围）
		 * @param colorRange	如['#121122', 'rgba(3,4,5,0.4)', 'red']
		 * @return
		 */
		public T outOfRangeSymbolColor(String[] colorRange){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColor(colorRange);
			return (T) this;
		}
		
		/**
		 * 设置图元的颜色的透明度（超出选中范围）
		 * @param colorAlpha	取值范围0~1
		 * @return
		 */
		public T outOfRangeSymbolColorAlpha(double colorAlpha){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorAlpha(colorAlpha);
			return (T) this;
		}
		
		/**
		 * 设置图元的颜色的透明度映射范围（超出选中范围）
		 * @param minColorAlpha		取值范围0~1
		 * @param maxColorAlpha		取值范围0~1
		 * @return
		 */
		public T outOfRangeSymbolColorAlpha(double minColorAlpha, double maxColorAlpha){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorAlpha(new double[]{minColorAlpha, maxColorAlpha});
			return (T) this;
		}
		
		/**
		 * 设置图元以及其附属物（如文字标签）的透明度（超出选中范围）
		 * @param opacity	取值范围0~1
		 * @return
		 */
		public T outOfRangeSymbolOpacity(double opacity){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setOpacity(opacity);
			return (T) this;
		}
		
		/**
		 * 设置图元以及其附属物（如文字标签）的透明度映射范围（超出选中范围）
		 * @param minOpacity	取值范围0~1
		 * @param maxOpacity	取值范围0~1
		 * @return
		 */
		public T outOfRangeSymbolOpacity(double minOpacity, double maxOpacity){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setOpacity(new double[]{minOpacity, maxOpacity});
			return (T) this;
		}
		
		/**
		 * 设置颜色的明暗度（超出选中范围）
		 * @param colorLightness	取值范围0~1
		 * @return
		 */
		public T outOfRangeSymbolColorLightness(double colorLightness){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorLightness(colorLightness);
			return (T) this;
		}
		
		/**
		 * 设置颜色的明暗度映射范围（超出选中范围）
		 * @param minColorLightness		取值范围0~1
		 * @param maxColorLightness		取值范围0~1
		 * @return
		 */
		public T outOfRangeSymbolColorLightness(double minColorLightness, double maxColorLightness){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorLightness(new double[]{minColorLightness, maxColorLightness});
			return (T) this;
		}
		
		/**
		 * 设置颜色的饱和度（超出选中范围）
		 * @param colorSaturation	取值范围0~1
		 * @return
		 */
		public T outOfRangeSymbolColorSaturation(double colorSaturation){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorSaturation(colorSaturation);
			return (T) this;
		}
		
		/**
		 * 设置颜色的饱和度映射范围（超出选中范围）
		 * @param minColorSaturation	取值范围0~1
		 * @param maxColorSaturation	取值范围0~1
		 * @return
		 */
		public T outOfRangeSymbolColorSaturation(double minColorSaturation, double maxColorSaturation){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorSaturation(new double[]{minColorSaturation, maxColorSaturation});
			return (T) this;
		}
		
		/**
		 * 设置颜色的色调（超出选中范围）
		 * @param colorHue		取值范围0~360
		 * @return
		 */
		public T outOfRangeSymbolColorHue(double colorHue){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorHue(colorHue);
			return (T) this;
		}
		
		/**
		 * 设置颜色的色调映射范围（超出选中范围）
		 * @param minColorHue	取值范围0~360
		 * @param maxColorHue	取值范围0~360
		 * @return
		 */
		public T outOfRangeSymbolColorHue(double minColorHue, double maxColorHue){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorHue(new double[]{minColorHue, maxColorHue});
			return (T) this;
		}
		
		public abstract AbsVisualMap getVisualMap();
	}
	
	protected String type;
	protected Double min;
	protected Double max;
	/**
	 * 是否反转 visualMap 组件
	 */
	protected Boolean inverse;
	/**
	 * default(为null时): 0
	 * 数据展示的小数精度，默认为0，无小数点
	 */
	protected Integer precision;
	/**
	 * 两端的文本，如 ['High', 'Low']
	 */
	protected String[] text;
	/**
	 * default(为null时): true
	 * 是否显示 visualMap-continuous 组件。如果设置为 false，不会显示，但是数据映射的功能还存在
	 */
	protected Boolean show;
	/**
	 * 指定取哪个系列的数据，即哪个系列的 series.data，默认取所有系列
	 */
	protected List<Integer> seriesIndex;
	/**
	 * default(为null时): data 中最后一个维度
	 * 指定用数据的『哪个维度』，映射到视觉元素上，默认取 data 中最后一个维度
	 */
	protected String dimension;
	
	/**
	 * default(为null时): 'vertical'
	 * 如何放置 visualMap 组件，水平（'horizontal'）或者竖直（'vertical'）
	 */
	protected String orient;
	
	/**
	 * 值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'center', 'right'
	 */
	protected String left;
	/**
	 * 值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'top', 'middle', 'bottom'
	 */
	protected String top;
	/**
	 * 值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比
	 */
	protected String right;
	/**
	 * bottom 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比
	 */
	protected String bottom;
	
	/**
	 * x 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'middle', 'center', 'right'
	 */
	protected String x;
	
	/**
	 * y 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'top', 'middle', 'center', 'bottom'
	 */
	protected String y;
	
	/**
	 * default(为null时): 20
	 */
	protected Double itemWidth;
	/**
	 * default(为null时): 140
	 */
	protected Double itemHeight;
	/**
	 * default(为null时): 0
	 * zlevel用于 Canvas 分层，不同zlevel值的图形会放置在不同的 Canvas 中，Canvas 分层是一种常见的优化手段。我们可以把一些图形变化频繁（例如有动画）的组件设置成一个单独的zlevel。需要注意的是过多的 Canvas 会引起内存开销的增大，在手机端上需要谨慎使用以防崩溃
	 * zlevel 大的 Canvas 会放在 zlevel 小的 Canvas 的上面
	 */
	protected Double zlevel;
	/**
	 * default(为null时): 2
	 * 组件的所有图形的z值。控制图形的前后顺序。z值小的图形会被z值大的图形覆盖
	 * z相比zlevel优先级更低，而且不会创建新的 Canvas
	 */
	protected Double z;
	
	/**
	 * 定义 在选中范围中 的视觉元素
	 */
	protected RangeConfig inRange;
	
	/**
	 * 定义 在选中范围外 的视觉元素
	 */
	protected RangeConfig outOfRange;
	
	public static class RangeConfig{
		/**
		 * 图元的图形类别
		 */
		private Object symbol;
		/**
		 * 图元的大小
		 */
		private Object symbolSize;
		/**
		 * 图元的颜色
		 */
		private Object color;
		/**
		 * 图元的颜色的透明度，0~1
		 */
		private Object colorAlpha;
		/**
		 * 图元以及其附属物（如文字标签）的透明度，0~1
		 */
		private Object opacity;
		/**
		 * 颜色的明暗度，0~1
		 */
		private Object colorLightness;
		/**
		 * 颜色的饱和度，0~1
		 */
		private Object colorSaturation;
		/**
		 * 颜色的色调，0~360
		 */
		private Object colorHue;
		
		public Object getSymbol() {
			return symbol;
		}
		public void setSymbol(Object symbol) {
			this.symbol = symbol;
		}
		public Object getSymbolSize() {
			return symbolSize;
		}
		public void setSymbolSize(Object symbolSize) {
			this.symbolSize = symbolSize;
		}
		public Object getColor() {
			return color;
		}
		public void setColor(Object color) {
			this.color = color;
		}
		public Object getColorAlpha() {
			return colorAlpha;
		}
		public void setColorAlpha(Object colorAlpha) {
			this.colorAlpha = colorAlpha;
		}
		public Object getOpacity() {
			return opacity;
		}
		public void setOpacity(Object opacity) {
			this.opacity = opacity;
		}
		public Object getColorLightness() {
			return colorLightness;
		}
		public void setColorLightness(Object colorLightness) {
			this.colorLightness = colorLightness;
		}
		public Object getColorSaturation() {
			return colorSaturation;
		}
		public void setColorSaturation(Object colorSaturation) {
			this.colorSaturation = colorSaturation;
		}
		public Object getColorHue() {
			return colorHue;
		}
		public void setColorHue(Object colorHue) {
			this.colorHue = colorHue;
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public List<Integer> getSeriesIndex() {
		return seriesIndex;
	}

	public void setSeriesIndex(List<Integer> seriesIndex) {
		this.seriesIndex = seriesIndex;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getOrient() {
		return orient;
	}

	public void setOrient(String orient) {
		this.orient = orient;
	}

	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}

	public String getTop() {
		return top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public String getRight() {
		return right;
	}

	public void setRight(String right) {
		this.right = right;
	}

	public String getBottom() {
		return bottom;
	}

	public void setBottom(String bottom) {
		this.bottom = bottom;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public Double getItemWidth() {
		return itemWidth;
	}

	public void setItemWidth(Double itemWidth) {
		this.itemWidth = itemWidth;
	}

	public Double getItemHeight() {
		return itemHeight;
	}

	public void setItemHeight(Double itemHeight) {
		this.itemHeight = itemHeight;
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

	public RangeConfig getInRange() {
		return inRange;
	}

	public void setInRange(RangeConfig inRange) {
		this.inRange = inRange;
	}

	public RangeConfig getOutOfRange() {
		return outOfRange;
	}

	public void setOutOfRange(RangeConfig outOfRange) {
		this.outOfRange = outOfRange;
	}

	public Boolean getInverse() {
		return inverse;
	}

	public void setInverse(Boolean inverse) {
		this.inverse = inverse;
	}
}
