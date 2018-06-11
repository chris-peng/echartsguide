package top.lcmatrix.util.echartsguide.option;

import top.lcmatrix.util.echartsguide.common.SelectedMode;

public class Geo extends AbsBlockEl{
	
	public Geo(){
		
	}
	
	public Geo(String map){
		this.map = map;
	}
	
	public Geo(String map, double[] center){
		this.map = map;
		this.center = center;
	}
	
	/**
	 * 
	 * @param map
	 * @param center
	 * @param roam			是否开启鼠标缩放和平移漫游。默认不开启
	 * @param zoom			当前视角的缩放比例，默认为1
	 */
	public Geo(String map, double[] center, boolean roam, int zoom){
		this.map = map;
		this.center = center;
		this.roam = roam;
		this.zoom = zoom;
	}

	/**
	 * default(为null时): true
	 */
	private Boolean show;
	
	private String map;
	
	/**
	 * 是否开启鼠标缩放和平移漫游。默认不开启
	 */
	private Boolean roam;
	
	/**
	 * 当前视角的中心点，用经纬度表示
	 */
	private double[] center;
	
	/**
	 * 当前视角的缩放比例，默认为1
	 */
	private Integer zoom;
	
	/**
	 * 滚轮缩放的极限控制，通过min, max最小和最大的缩放值，默认的缩放为1
	 */
	private ScaleLimit scaleLimit;
	
	/**
	 * 见{@link SelectedMode}常量
	 */
	private String selectedMode;
	
	private Label label;
	
	public static class ScaleLimit{
		
		public ScaleLimit(){}
		public ScaleLimit(Integer min, Integer max) {
			super();
			this.min = min;
			this.max = max;
		}
		private Integer min;
		private Integer max;
		public Integer getMin() {
			return min;
		}
		public void setMin(Integer min) {
			this.min = min;
		}
		public Integer getMax() {
			return max;
		}
		public void setMax(Integer max) {
			this.max = max;
		}
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public Boolean getRoam() {
		return roam;
	}

	public void setRoam(Boolean roam) {
		this.roam = roam;
	}

	public double[] getCenter() {
		return center;
	}

	public void setCenter(double[] center) {
		this.center = center;
	}

	public Integer getZoom() {
		return zoom;
	}

	public void setZoom(Integer zoom) {
		this.zoom = zoom;
	}

	public ScaleLimit getScaleLimit() {
		return scaleLimit;
	}

	public void setScaleLimit(ScaleLimit scaleLimit) {
		this.scaleLimit = scaleLimit;
	}

	public String getSelectedMode() {
		return selectedMode;
	}

	public void setSelectedMode(String selectedMode) {
		this.selectedMode = selectedMode;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}
}
