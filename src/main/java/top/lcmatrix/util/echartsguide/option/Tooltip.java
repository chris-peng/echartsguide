package top.lcmatrix.util.echartsguide.option;

public class Tooltip {
	
	public static final String TRIGGER_ITEM = "item";
	public static final String TRIGGER_AXIS = "axis";
	public static final String TRIGGER_NONE = "none";
	
	public Tooltip(){
		
	}
	
	public Tooltip(String trigger){
		this(trigger, null);
	}
	
	public Tooltip(String trigger, String formatter){
		this.trigger = trigger;
		this.formatter = formatter;
	}

	/**
	 * default(为null时): true
	 */
	private Boolean show;
	
	/**
	 * default(为null时): 'item'
	 * 触发类型，可选值见TRIGGER_*常量
	 */
	private String trigger;
	
	/**
	 * 提示框浮层内容格式器，支持字符串模板
	 * <br/>模板变量有 {a}, {b}，{c}，{d}，{e}，分别表示系列名，数据名，数据值等。 在 trigger 为 'axis' 的时候，会有多个系列的数据，此时可以通过 {a0}, {a1}, {a2} 这种后面加索引的方式表示系列的索引。 不同图表类型下的 {a}，{b}，{c}，{d} 含义不一样。 其中变量{a}, {b}, {c}, {d}在不同图表类型下代表数据含义为：
		<br/>模板变量将来还可能支持{@fieldname}形式（目前lable已经支持）
		<br/>
		<br/>折线（区域）图、柱状（条形）图、K线图 : {a}（系列名称），{b}（类目值），{c}（数值）, {d}（无）
		<br/>散点图（气泡）图 : {a}（系列名称），{b}（数据名称），{c}（数值数组）, {d}（无）
		<br/>地图 : {a}（系列名称），{b}（区域名称），{c}（合并数值）, {d}（无）
		<br/>饼图、仪表盘、漏斗图: {a}（系列名称），{b}（数据项名称），{c}（数值）, {d}（百分比）
	 */
	private String formatter;

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getTrigger() {
		return trigger;
	}

	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

	public String getFormatter() {
		return formatter;
	}

	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}
}
