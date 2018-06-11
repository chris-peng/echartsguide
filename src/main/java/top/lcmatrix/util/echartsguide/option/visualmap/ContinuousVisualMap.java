package top.lcmatrix.util.echartsguide.option.visualmap;

public class ContinuousVisualMap extends AbsVisualMap{
	
	public static class Guide extends AbsVisualMap.Guide<Guide>{
		private ContinuousVisualMap visualMap = new ContinuousVisualMap();
		
		/**
		 * 指定手柄对应数值的位置，range 应在 min max 范围内
		 * @param start
		 * @param end
		 * @return
		 */
		public Guide range(double start, double end){
			visualMap.range = new double[]{start, end};
			return this;
		}
		
		/**
		 * 是否显示拖拽用的手柄（手柄能拖拽调整选中范围），默认为false
		 * @param calculable
		 * @return
		 */
		public Guide calculable(boolean calculable){
			visualMap.calculable = calculable;
			return this;
		}
		
		/**
		 * 拖拽时，是否实时更新，默认为true
		 * @param realtime
		 * @return
		 */
		public Guide realtime(boolean realtime){
			visualMap.realtime = realtime;
			return this;
		}
		
		@Override
		public AbsVisualMap getVisualMap() {
			return visualMap;
		}
	}
	
	private final String type = "continuous";
	private double[] range;
	private Boolean calculable;
	private Boolean realtime;
	public String getType() {
		return type;
	}
	public double[] getRange() {
		return range;
	}
	public void setRange(double[] range) {
		this.range = range;
	}
	public Boolean getCalculable() {
		return calculable;
	}
	public void setCalculable(Boolean calculable) {
		this.calculable = calculable;
	}
	public Boolean getRealtime() {
		return realtime;
	}
	public void setRealtime(Boolean realtime) {
		this.realtime = realtime;
	}
}
