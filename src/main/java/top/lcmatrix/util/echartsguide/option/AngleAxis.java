package top.lcmatrix.util.echartsguide.option;

import top.lcmatrix.util.echartsguide.common.AxisType;

public class AngleAxis {
	
	public AngleAxis(){
	}
	
	public AngleAxis(String name){
		this(name, null);
	}
	
	public AngleAxis(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	public AngleAxis(String name, String type, int polarIndex){
		this.name = name;
		this.type = type;
		this.polarIndex = polarIndex;
	}
	
	/**
	 * 
	 * @param name
	 * @param type			见{@link AxisType}类的常量
	 * @param polarIndex	
	 * @param startAngle	起始刻度的角度，默认为 90 度，即圆心的正上方。0 度为圆心的正右方
	 * @param clockwise		刻度增长是否按顺时针，默认true顺时针
	 */
	public AngleAxis(String name, String type, 
			int polarIndex, int startAngle, boolean clockwise){
		this.name = name;
		this.type = type;
		this.polarIndex = polarIndex;
		this.startAngle = startAngle;
		this.clockwise = clockwise;
	}

	/**
	 * 径向轴所在的极坐标系的索引，默认使用第一个极坐标系
	 */
	private Integer polarIndex;
	
	private String type;
	
	private String name;
	
	/**
	 * 起始刻度的角度，默认为 90 度，即圆心的正上方。0 度为圆心的正右方
	 */
	private Integer startAngle;
	
	/**
	 * 刻度增长是否按顺时针，默认true顺时针
	 */
	private Boolean clockwise;
	
	private Double min;
	private Double max;
	
	/**
	 * 只在数值轴中（type: 'value'）有效。是否是脱离 0 值比例。设置成 true 后坐标刻度不会强制包含零刻度。在双数值轴的散点图中比较有用。
	 */
	private Boolean scale;
	/**
	 * default(为null时): 5
	 * 坐标轴的分割段数，需要注意的是这个分割段数只是个预估值，最后实际显示的段数会在这个基础上根据分割后坐标轴刻度显示的易读程度作调整
	 * 在类目轴中无效
	 */
	private Integer splitNumber;
	/**
	 * default(为null时): 0
	 * 自动计算的坐标轴最小间隔大小
	 * 例如可以设置成1保证坐标轴分割刻度显示成整数
	 */
	private Integer minInterval;
	/**
	 * 自动计算的坐标轴最大间隔大小
	 * 例如，在时间轴（（type: 'time'））可以设置成 3600 * 24 * 1000 保证坐标轴分割刻度最大为一天
	 */
	private Integer maxInterval;
	/**
	 * 强制设置坐标轴分割间隔
	 * 因为 splitNumber 是预估的值，实际根据策略计算出来的刻度可能无法达到想要的效果，这时候可以使用 interval 配合 min、max 强制设定刻度划分，一般不建议使用
	 */
	private Integer interval;
	/**
	 * default(为null时): 10
	 * 对数轴的底数，只在对数轴中（type: 'log'）有效
	 */
	private Double logBase;
	/**
	 * default(为null时): false
	 * 坐标轴是否是静态无法交互
	 */
	private Boolean silent;
	public Integer getPolarIndex() {
		return polarIndex;
	}
	public void setPolarIndex(Integer polarIndex) {
		this.polarIndex = polarIndex;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Boolean getScale() {
		return scale;
	}
	public void setScale(Boolean scale) {
		this.scale = scale;
	}
	public Integer getSplitNumber() {
		return splitNumber;
	}
	public void setSplitNumber(Integer splitNumber) {
		this.splitNumber = splitNumber;
	}
	public Integer getMinInterval() {
		return minInterval;
	}
	public void setMinInterval(Integer minInterval) {
		this.minInterval = minInterval;
	}
	public Integer getMaxInterval() {
		return maxInterval;
	}
	public void setMaxInterval(Integer maxInterval) {
		this.maxInterval = maxInterval;
	}
	public Integer getInterval() {
		return interval;
	}
	public void setInterval(Integer interval) {
		this.interval = interval;
	}
	public Double getLogBase() {
		return logBase;
	}
	public void setLogBase(Double logBase) {
		this.logBase = logBase;
	}
	public Boolean getSilent() {
		return silent;
	}
	public void setSilent(Boolean silent) {
		this.silent = silent;
	}

	public Integer getStartAngle() {
		return startAngle;
	}

	public void setStartAngle(Integer startAngle) {
		this.startAngle = startAngle;
	}

	public Boolean getClockwise() {
		return clockwise;
	}

	public void setClockwise(Boolean clockwise) {
		this.clockwise = clockwise;
	}
}
