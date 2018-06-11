package top.lcmatrix.util.echartsguide.series.mark;

import top.lcmatrix.util.echartsguide.common.Symbol;
import top.lcmatrix.util.echartsguide.option.Label;

public class Point {
	
	public static final String TYPE_MIN = "min";
	public static final String TYPE_MAX = "max";
	public static final String TYPE_AVERAGE = "average";
	
	public Point(){
		
	}
	
	/**
	 * 
	 * @param name
	 * @param type	见Point类的TYPE_*常量
	 */
	public Point(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	/**
	 * 
	 * @param name
	 * @param type	见Point类的TYPE_*常量
	 * @param symbol	见{@link Symbol}类的常量
	 */
	public Point(String name, String type, String symbol){
		this.name = name;
		this.type = type;
		this.symbol = symbol;
	}
	
	/**
	 * 
	 * @param name
	 * @param coord		起点或终点的坐标。坐标格式视系列的坐标系而定，可以是直角坐标系上的 x, y，也可以是极坐标系上的 radius, angle。
		<br/>注：对于 axis.type 为 'category' 类型的轴
		<br/>如果 coord 值为 number，则表示 axis.data 的 index。
		<br/>如果 coord 值为 string，则表示 axis.data 中具体的值。注意使用这种方式时，xAxis.data 不能写成 [number, number, ...]，而只能写成 [string, string, ...]，否则不能被 markPoint / markLine 用『具体值』索引到。
	 * @param symbol	见{@link Symbol}类的常量
	 */
	public Point(String name, Object[] coord, String symbol){
		this.name = name;
		this.coord = coord;
		this.symbol = symbol;
	}
	
	/**
	 * 
	 * @param name
	 * @param coord		起点或终点的坐标。坐标格式视系列的坐标系而定，可以是直角坐标系上的 x, y，也可以是极坐标系上的 radius, angle。
		<br/>注：对于 axis.type 为 'category' 类型的轴
		<br/>如果 coord 值为 number，则表示 axis.data 的 index。
		<br/>如果 coord 值为 string，则表示 axis.data 中具体的值。注意使用这种方式时，xAxis.data 不能写成 [number, number, ...]，而只能写成 [string, string, ...]，否则不能被 markPoint / markLine 用『具体值』索引到。
	 */
	public Point(String name, Object[] coord){
		this.name = name;
		this.coord = coord;
	}
	
	private String name;
	private String type;
	/**
	 * 在使用 type 时有效，用于指定在哪个维度上指定最大值最小值，可以是 0（xAxis, radiusAxis），1（yAxis, angleAxis），默认使用第一个数值轴所在的维度。
	 */
	private Integer valueIndex;
	
	/**
	 * 在使用 type 时有效，用于指定在哪个维度上指定最大值最小值。这可以是维度的直接名称，例如折线图时可以是x、angle等、candlestick 图时可以是open、close等维度名称
	 */
	private String valueDim;
	
	/**
	 * 起点或终点的坐标。坐标格式视系列的坐标系而定，可以是直角坐标系上的 x, y，也可以是极坐标系上的 radius, angle。
		<br/>注：对于 axis.type 为 'category' 类型的轴
		<br/>如果 coord 值为 number，则表示 axis.data 的 index。
		<br/>如果 coord 值为 string，则表示 axis.data 中具体的值。注意使用这种方式时，xAxis.data 不能写成 [number, number, ...]，而只能写成 [string, string, ...]，否则不能被 markPoint / markLine 用『具体值』索引到。
	 */
	private Object[] coord;
	
	/**
	 * 见{@link Symbol}类的常量
	 */
	private String symbol;
	
	private Integer symbolSize;
	
	/**
	 * 起点标记的旋转角度。注意在 markLine 中当 symbol 为 'arrow' 时会忽略 symbolRotate 强制设置为切线的角度。
	 */
	private Integer symbolRotate;
	
	/**
	 * 起点标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。
		例如 [0, '50%'] 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。
	 */
	private String[] symbolOffset;
	
	private Label label;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getValueIndex() {
		return valueIndex;
	}

	public void setValueIndex(Integer valueIndex) {
		this.valueIndex = valueIndex;
	}

	public String getValueDim() {
		return valueDim;
	}

	public void setValueDim(String valueDim) {
		this.valueDim = valueDim;
	}

	public Object[] getCoord() {
		return coord;
	}

	public void setCoord(Object[] coord) {
		this.coord = coord;
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

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}
}
