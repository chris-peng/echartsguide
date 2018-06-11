package top.lcmatrix.util.echartsguide.encode;

public class PieEncode extends AbsEncode{

	private String itemName;
	private String value;
	
	public PieEncode(){
		
	}
	
	public PieEncode(String itemName, String value){
		this.itemName = itemName;
		this.value = value;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
