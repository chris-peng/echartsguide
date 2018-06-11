package top.lcmatrix.util.echartsguide.series.mark;

import java.util.List;

import top.lcmatrix.util.echartsguide.common.Symbol;
import top.lcmatrix.util.echartsguide.option.Label;

public class MarkLine extends AbsMark{
	
	public MarkLine(){
		
	}
	
	/**
	 * 
	 * @param symbol	见{@link Symbol}对象的常量
	 * @param labelFormatter		标签内容格式器，支持字符串模板和回调函数两种形式，字符串模板与回调函数返回的字符串均支持用 \n 换行。
	 *								<br/>字符串模板 模板变量有：
	 *								<br/>{a}：系列名。
	 *								<br/>{b}：数据名。
	 *								<br/>{c}：数据值。
	 *								<br/>{@xxx}：数据中名为'xxx'的维度的值，如{@product}表示名为'product'` 的维度的值。
	 *								<br/>{@[n]}：数据中维度n的值，如{@[3]}` 表示维度 3 的值，从 0 开始计数。
	 * @param data		标线的数据数组。每个数组项可以是一个两个值的数组，分别表示线的起点和终点，每一项是一个Point对象；也可以是单点，表示与轴平行的线
	 */
	public MarkLine(String symbol, String labelFormatter, List<Object> data){
		this.symbol = symbol;
		this.label = new Label(labelFormatter);
		this.data = data;
	}
	
	/**
	 * 
	 * @param symbol	见{@link Symbol}对象的常量
	 * @param data		标线的数据数组。每个数组项可以是一个两个值的数组，分别表示线的起点和终点，每一项是一个Point对象
	 */
	public MarkLine(String symbol, List<Object> data){
		this.symbol = symbol;
		this.data = data;
	}

	/**
	 * 标线的数据数组。每个数组项可以是一个两个值的数组，分别表示线的起点和终点，每一项是一个Point对象
	 */
	private List<Object> data;

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}
}
