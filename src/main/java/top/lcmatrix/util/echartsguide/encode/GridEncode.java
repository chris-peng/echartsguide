package top.lcmatrix.util.echartsguide.encode;

import java.util.ArrayList;
import java.util.List;

public class GridEncode extends AbsEncode{
	
	private List<String> x;
	private List<String> y;
	
	public GridEncode(){
		
	}
	
	public GridEncode(String x, String y){
		this.x = new ArrayList<>();
		this.x.add(x);
		this.y = new ArrayList<>();
		this.y.add(y);
	}
	
	public GridEncode(String seriesName, String x, String y){
		this.seriesName = seriesName;
		this.x = new ArrayList<>();
		this.x.add(x);
		this.y = new ArrayList<>();
		this.y.add(y);
	}
	
	public List<String> getX() {
		return x;
	}
	public void setX(List<String> x) {
		this.x = x;
	}
	public List<String> getY() {
		return y;
	}
	public void setY(List<String> y) {
		this.y = y;
	}
}
