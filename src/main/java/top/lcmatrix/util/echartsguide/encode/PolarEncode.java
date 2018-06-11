package top.lcmatrix.util.echartsguide.encode;

public class PolarEncode extends AbsEncode{

	private String radius;
	private String angle;
	
	public PolarEncode(){
		
	}
	
	public PolarEncode(String radius, String angle){
		this.radius = radius;
		this.angle = angle;
	}
	
	public String getRadius() {
		return radius;
	}
	public void setRadius(String radius) {
		this.radius = radius;
	}
	public String getAngle() {
		return angle;
	}
	public void setAngle(String angle) {
		this.angle = angle;
	}
}
