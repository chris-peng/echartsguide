package top.lcmatrix.util.echartsguide.option;

public class AreaStyle {
	
	public AreaStyle(){
		
	}
	
	public AreaStyle(String color){
		this.color = color;
	}
	
	/**
	 * 填充坐标轴轴线到数据间的区域
	 */
	public static final String ORIGIN_AUTO = "auto";
	/**
	 * 填充坐标轴底部（非 inverse 情况是最小值）到数据间的区域
	 */
	public static final String ORIGIN_START = "start";
	/**
	 * 填充坐标轴顶部（非 inverse 情况是最大值）到数据间的区域
	 */
	public static final String ORIGIN_END = "end";
	
	/**
	 * default(为null时): '#000'，会根据系列的颜色自动调整
	 * 颜色可以使用 RGB 表示，比如 'rgb(128, 128, 128)'，如果想要加上 alpha 通道表示不透明度，可以使用 RGBA，比如 'rgba(128, 128, 128, 0.5)'，也可以使用十六进制格式，比如 '#ccc'。
	 * 除了纯色之外颜色也支持渐变色和纹理填充(见echarts官方文档)
	 */
	private String color;
	/**
	 * default(为null时): 'auto'
	 * 图形区域的起始位置
	 * 默认情况下，图形会从坐标轴轴线到数据间进行填充。如果需要填充的区域是坐标轴最大值到数据间，或者坐标轴最小值到数据间，则可以通过这个配置项进行设置。
		可选值包括 'auto'（默认值）、 'start'、 'end'。
	 */
	private String origin;
	/**
	 * 图形透明度。支持从 0 到 1 的数字，为 0 时不绘制该图形
	 */
	private Double opacity;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Double getOpacity() {
		return opacity;
	}
	public void setOpacity(Double opacity) {
		this.opacity = opacity;
	}
}
