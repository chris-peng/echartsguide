package top.lcmatrix.util.echartsguide.series.mark;

import top.lcmatrix.util.echartsguide.option.Label;

public abstract class AbsMark {
	
	protected String symbol;
	protected Integer symbolSize;
	protected Integer symbolRotate;
	/**
	 * 标记相对于原本位置的偏移。默认情况下，标记会居中置放在数据对应的位置，但是如果 symbol 是自定义的矢量路径或者图片，就有可能不希望 symbol 居中。这时候可以使用该配置项配置 symbol 相对于原本居中的偏移，可以是绝对的像素值，也可以是相对的百分比。
		例如 [0, '50%'] 就是把自己向上移动了一半的位置，在 symbol 图形是气泡的时候可以让图形下端的箭头对准数据点。
	 */
	protected String[] symbolOffset;
	
	protected Label label;

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
