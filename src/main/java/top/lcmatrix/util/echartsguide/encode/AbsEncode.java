package top.lcmatrix.util.echartsguide.encode;

import java.util.List;

public abstract class AbsEncode {

	protected String seriesName;
	
	protected List<String> tooltip;
	
	/**
	 * 用于指定 tooltip 中数据项名称
	 */
	protected String itemName;

	public List<String> getTooltip() {
		return tooltip;
	}

	public void setTooltip(List<String> tooltip) {
		this.tooltip = tooltip;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
}
