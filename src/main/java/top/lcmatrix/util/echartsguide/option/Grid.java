package top.lcmatrix.util.echartsguide.option;

public class Grid extends AbsBlockEl{
	/**
	 * default(为null时): true
	 */
	private Boolean show;
	
	/**
	 * default(为null时): false 
	 * grid 区域是否包含坐标轴的刻度标签。
	 * 设置为true常用来『防止标签溢出』的场景，标签溢出指的是，标签长度动态变化时，可能会溢出容器或者覆盖其他组件
	 */
	private Boolean containLabel;
	/**
	 * default(为null时): 'transparent'
	 * 网格背景色，默认透明
	 * 颜色可以使用 RGB 表示，比如 'rgb(128, 128, 128)' ，如果想要加上 alpha 通道，可以使用 RGBA，比如 'rgba(128, 128, 128, 0.5)'，也可以使用十六进制格式，比如 '#ccc'
	 */
	private String backgroundColor;
	/**
	 * default(为null时): '#ccc'
	 * 网格的边框颜色。
	 * 颜色可以使用 RGB 表示，比如 'rgb(128, 128, 128)' ，如果想要加上 alpha 通道，可以使用 RGBA，比如 'rgba(128, 128, 128, 0.5)'，也可以使用十六进制格式，比如 '#ccc'
	 */
	private String borderColor;
	/**
	 * default(为null时): 1
	 * 网格的边框线宽
	 */
	private Integer borderWidth;
	/**
	 * 图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果
	 */
	private Integer shadowBlur;
	/**
	 * 阴影颜色
	 * 颜色可以使用 RGB 表示，比如 'rgb(128, 128, 128)' ，如果想要加上 alpha 通道，可以使用 RGBA，比如 'rgba(128, 128, 128, 0.5)'，也可以使用十六进制格式，比如 '#ccc'
	 */
	private String shadowColor;
	/**
	 * default(为null时): 0
	 * 阴影水平方向上的偏移距离
	 */
	private Integer shadowOffsetX;
	/**
	 * default(为null时): 0
	 * 阴影垂直方向上的偏移距离
	 */
	private Integer shadowOffsetY;
	private Tooltip tooltip;
	public Boolean getShow() {
		return show;
	}
	public void setShow(Boolean show) {
		this.show = show;
	}
	public Boolean getContainLabel() {
		return containLabel;
	}
	public void setContainLabel(Boolean containLabel) {
		this.containLabel = containLabel;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
	public Integer getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
	}
	public Integer getShadowBlur() {
		return shadowBlur;
	}
	public void setShadowBlur(Integer shadowBlur) {
		this.shadowBlur = shadowBlur;
	}
	public String getShadowColor() {
		return shadowColor;
	}
	public void setShadowColor(String shadowColor) {
		this.shadowColor = shadowColor;
	}
	public Integer getShadowOffsetX() {
		return shadowOffsetX;
	}
	public void setShadowOffsetX(Integer shadowOffsetX) {
		this.shadowOffsetX = shadowOffsetX;
	}
	public Integer getShadowOffsetY() {
		return shadowOffsetY;
	}
	public void setShadowOffsetY(Integer shadowOffsetY) {
		this.shadowOffsetY = shadowOffsetY;
	}
	public Tooltip getTooltip() {
		return tooltip;
	}
	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}
}
