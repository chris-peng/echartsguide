package top.lcmatrix.util.echartsguide.option;

import java.util.List;

public class GridAxis{
	
	public static final String POSITION_TOP = "top";
	public static final String POSITION_BOTTOM = "bottom";
	
	public static final String NAME_LOCATION_START = "start";
	public static final String NAME_LOCATION_MIDDLE = "middle";
	public static final String NAME_LOCATION_END = "end";
	
	public GridAxis(){
	}
	
	public GridAxis(String name){
		this(name, null);
	}
	
	public GridAxis(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	public GridAxis(String name, String type, int gridIndex){
		this.name = name;
		this.type = type;
		this.gridIndex = gridIndex;
	}
	
	/**
	 * default(为null时): true
	 */
	private Boolean show;
	/**
	 * default(为null时): 0
	 */
	private Integer gridIndex;
	private String position;
	/**
	 * default(为null时): 0
	 * X 轴相对于默认位置的偏移，在相同的 position 上有多个 X 轴的时候有用
	 */
	private Double offset;
	/**
	 * default(为null时)
	 */
	private String type;
	private String name;
	/**
	 * default(为null时): 'end'
	 * 坐标轴名称显示位置。
	 */
	private String nameLocation;
	/**
	 * default(为null时): 15
	 * 坐标轴名称与轴线之间的距离
	 */
	private Double nameGap;
	/**
	 * 坐标轴名字旋转，角度值
	 */
	private Double nameRotate;
	/**
	 * default(为null时): false
	 * 是否是反向坐标轴
	 */
	private Boolean inverse;
	/**
	 * 坐标轴两边留白策略，类目轴和非类目轴的设置和表现不一样
	 * 例：boundaryGap: ['20%', '20%']
	 */
	private List<String> boundaryGap;
	private Double min;
	private Double max;
	/**
	 * default(为null时): false
	 * 只在数值轴中（type: 'value'）有效。
		是否是脱离 0 值比例。设置成 true 后坐标刻度不会强制包含零刻度。在双数值轴的散点图中比较有用。
		在设置 min 和 max 之后该配置项无效。
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
	public Boolean getShow() {
		return show;
	}
	public void setShow(Boolean show) {
		this.show = show;
	}
	public Integer getGridIndex() {
		return gridIndex;
	}
	public void setGridIndex(Integer gridIndex) {
		this.gridIndex = gridIndex;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Double getOffset() {
		return offset;
	}
	public void setOffset(Double offset) {
		this.offset = offset;
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
	public String getNameLocation() {
		return nameLocation;
	}
	public void setNameLocation(String nameLocation) {
		this.nameLocation = nameLocation;
	}
	public Double getNameGap() {
		return nameGap;
	}
	public void setNameGap(Double nameGap) {
		this.nameGap = nameGap;
	}
	public Double getNameRotate() {
		return nameRotate;
	}
	public void setNameRotate(Double nameRotate) {
		this.nameRotate = nameRotate;
	}
	public Boolean getInverse() {
		return inverse;
	}
	public void setInverse(Boolean inverse) {
		this.inverse = inverse;
	}
	public List<String> getBoundaryGap() {
		return boundaryGap;
	}
	public void setBoundaryGap(List<String> boundaryGap) {
		this.boundaryGap = boundaryGap;
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
}
