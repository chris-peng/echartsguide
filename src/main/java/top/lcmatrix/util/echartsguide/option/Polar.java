package top.lcmatrix.util.echartsguide.option;

public class Polar {
	
	public Polar(){
		
	}
	
	/**
	 * 
	 * @param x		中心点横坐标，支持设置成百分比，设置成百分比时是相对于容器宽度
	 * @param y		中心点纵坐标，支持设置成百分比，设置成百分比时是相对于容器高度
	 */
	public Polar(String x, String y){
		this.center = new String[]{x, y};
	}
	
	/**
	 * default(为null时): ['50%', '50%']
	 * 极坐标的中心（圆心）坐标，数组的第一项是横坐标，第二项是纵坐标
	 * 支持设置成百分比，设置成百分比时第一项是相对于容器宽度，第二项是相对于容器高度
	 * 支持字符串类型的数字，表示像素数，如['500', '500']
	 */
	private String[] center;
	
	/**
	 * default(为null时): [0, '75%']
	 * 极坐标的半径，数组的第一项是内半径，第二项是外半径
	 * 支持设置成百分比，相对于容器高宽中较小的一项的一半，支持字符串类型的数字，表示像素数，如['500', '500']
	 * 可以将内半径设大显示成圆环图（Donut chart）
	 */
	private String[] radius;
	
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
