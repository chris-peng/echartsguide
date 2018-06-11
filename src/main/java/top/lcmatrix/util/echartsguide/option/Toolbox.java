package top.lcmatrix.util.echartsguide.option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Toolbox extends AbsBlockEl{
	
	public static final String FEATURE_SAVE_AS_IMAGE = "saveAsImage";
	public static final String FEATURE_RESTORE = "restore";
	public static final String FEATURE_DATAVIEW = "dataView";
	public static final String FEATURE_DATA_ZOOM = "dataZoom";
	public static final String FEATURE_MAGIC_TYPE = "magicType";
	public static final String FEATURE_BRUSH = "brush";
	
	/**
	 * 切换为折线图
	 */
	public static final String MAGIC_TYPE_LINE = "line";
	/**
	 * 切换为柱状图
	 */
	public static final String MAGIC_TYPE_BAR = "bar";
	/**
	 * 切换为堆叠模式
	 */
	public static final String MAGIC_TYPE_STACK = "stack";
	/**
	 * 切换为平铺模式
	 */
	public static final String MAGIC_TYPE_TILED = "tiled";
	
	public Toolbox(){
		
	}
	
	public Toolbox(String[] features){
		this(features, null);
	}
	
	public Toolbox(String[] features, String[] magicTypes){
		this.feature = new LinkedHashMap<>();
		for(String f : features){
			if(FEATURE_MAGIC_TYPE.equals(f) 
					&& magicTypes != null && magicTypes.length > 0){
				MagicTypeFeature mtf = new MagicTypeFeature();
				List<String> type = new ArrayList<String>();
				type.addAll(Arrays.asList(magicTypes));
				mtf.setType(type);
				feature.put(f, mtf);
			}else{
				feature.put(f, new Feature());
			}
		}
	}
	
	/**
	 * default(为null时): true
	 */
	private Boolean show;
	
	/**
	 * default(为null时): 'horizontal'
	 * 工具栏 icon 的布局朝向，'horizontal'或'vertical'
	 */
	private String orient;
	
	private LinkedHashMap<String, Feature> feature;
	
	public static class Feature{
		
	}
	
	public static class MagicTypeFeature extends Feature{
		private List<String> type;

		public List<String> getType() {
			return type;
		}

		public void setType(List<String> type) {
			this.type = type;
		}
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getOrient() {
		return orient;
	}

	public void setOrient(String orient) {
		this.orient = orient;
	}

	public LinkedHashMap<String, Feature> getFeature() {
		return feature;
	}

	public void setFeature(LinkedHashMap<String, Feature> feature) {
		this.feature = feature;
	}
}
