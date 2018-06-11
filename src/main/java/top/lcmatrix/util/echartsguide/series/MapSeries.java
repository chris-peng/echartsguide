package top.lcmatrix.util.echartsguide.series;

import top.lcmatrix.util.echartsguide.common.SelectedMode;
import top.lcmatrix.util.echartsguide.encode.GeoEncode;
import top.lcmatrix.util.echartsguide.option.Geo.ScaleLimit;

public class MapSeries extends AbsSeries{
	
	public static final String CALCULATION_SUM = "sum";
	public static final String CALCULATION_AVERAGE = "average";
	public static final String CALCULATION_MAX = "max";
	public static final String CALCULATION_MIN = "min";
	
	public static class Guide extends AbsSeries.Guide<Guide>{
		
		private MapSeries series = new MapSeries();
		
		public Guide geoEncode(String lngField, String latField){
			series.encode = new GeoEncode(lngField, latField);
			return this;
		}
		
		/**
		 * 默认情况下，map series 会自己生成内部专用的 geo 组件。但是也可以用这个 geoIndex 指定一个 geo 组件
		 * @param geoIndex
		 * @return
		 */
		public Guide geoIndex(int geoIndex){
			series.geoIndex = geoIndex;
			return this;
		}
		
		public Guide map(String map){
			series.map = map;
			return this;
		}
		
		/**
		 * 是否开启鼠标缩放和平移漫游。默认不开启
		 * @param roam
		 * @return
		 */
		public Guide roam(boolean roam){
			series.roam = roam;
			return this;
		}
		
		/**
		 * 当前视角的中心点，用经纬度表示
		 * @param center
		 * @return
		 */
		public Guide center(double[] center){
			series.center = center;
			return this;
		}
		
		/**
		 * 当前视角的缩放比例，默认为1
		 * @param zoom
		 * @return
		 */
		public Guide zoom(int zoom){
			series.zoom = zoom;
			return this;
		}
		
		public Guide scaleLimit(int min, int max){
			series.scaleLimit = new ScaleLimit(min, max);
			return this;
		}
		
		/**
		 * 
		 * @param selectedMode	见{@link SelectedMode}常量
		 * @return
		 */
		public Guide selectedMode(String selectedMode){
			series.selectedMode = selectedMode;
			return this;
		}
		
		/**
		 * 多个拥有相同地图类型的系列会使用同一个地图展现，如果多个系列都在同一个区域有值，ECharts 会对这些值统计得到一个数据。这个配置项就是用于配置统计的方式，目前有：
			<br/>'sum' 取和。
			<br/>'average' 取平均值。
			<br/>'max' 取最大值。
			<br/>'min' 取最小值。
		 * @param mapValueCalculation		见{@link MapSeries}的CALCULATION_*常量
		 * @return
		 */
		public Guide mapValueCalculation(String mapValueCalculation){
			series.mapValueCalculation = mapValueCalculation;
			return this;
		}

		@Override
		public AbsSeries getSeries() {
			return series;
		}
		
	}

	private String type = "map";
	
	/**
	 * 默认情况下，map series 会自己生成内部专用的 geo 组件。但是也可以用这个 geoIndex 指定一个 geo 组件
	 */
	private Integer geoIndex;
	
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
	
	/**
	 * 见{@link MapSeries}的CALCULATION_*常量
	 */
	private String mapValueCalculation;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getGeoIndex() {
		return geoIndex;
	}

	public void setGeoIndex(Integer geoIndex) {
		this.geoIndex = geoIndex;
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

	public String getMapValueCalculation() {
		return mapValueCalculation;
	}

	public void setMapValueCalculation(String mapValueCalculation) {
		this.mapValueCalculation = mapValueCalculation;
	}
}
