package top.lcmatrix.util.echartsguide.option;

public class Label {
	
	public Label(){
		
	}
	
	public Label(String formatter){
		this.formatter = formatter;
	}

	private Boolean show;
	
	/**
	 * 标签内容格式器，支持字符串模板和回调函数两种形式，字符串模板与回调函数返回的字符串均支持用 \n 换行。
		<br/>字符串模板 模板变量有：
		<br/>{a}：系列名。
		<br/>{b}：数据名。
		<br/>{c}：数据值。
		<br/>{@xxx}：数据中名为'xxx'的维度的值，如{@product}表示名为'product'` 的维度的值。
		<br/>{@[n]}：数据中维度n的值，如{@[3]}` 表示维度 3 的值，从 0 开始计数。
	 */
	private String formatter;

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getFormatter() {
		return formatter;
	}

	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}
}
