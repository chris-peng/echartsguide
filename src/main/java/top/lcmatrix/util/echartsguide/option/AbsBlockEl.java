package top.lcmatrix.util.echartsguide.option;

public abstract class AbsBlockEl {

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
	 * default(为null时): 'auto'
	 */
	protected Double width;
	/**
	 * default(为null时): 'auto'
	 */
	protected Double height;
	
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

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
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
}
