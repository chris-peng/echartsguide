package top.lcmatrix.util.echartsguide.option;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Legend extends AbsBlockEl{
	
	public static final String TYPE_PLAIN = "plain";
	public static final String TYPE_SCROLL = "scroll";
	
	public Legend(){
		
	}
	
	public Legend(List<String> unselectLegends){
		this(unselectLegends, null, null);
	}
	
	public Legend(List<String> unselectLegends, Boolean scrollable){
		this(unselectLegends, scrollable, null);
	}
	
	public Legend(List<String> unselectLegends,
			Boolean scrollable, String orient){
		unselect(unselectLegends);
		if(scrollable != null && scrollable){
			this.type = TYPE_SCROLL;
		}
		this.orient = orient;
	}

	/**
	 * default(为null时): true
	 */
	private Boolean show;
	
	/**
	 * default(为null时): 'plain'
	 * 图例的类型。可选值：
	 * 	'plain'：普通图例。缺省就是普通图例。
	 * 	'scroll'：可滚动翻页的图例。当图例数量较多时可以使用。
	 */
	private String type;
	
	/**
	 * default(为null时): 'horizontal'
	 * 图例列表的布局朝向，'horizontal'或'vertical'
	 */
	private String orient;
	
	/**
	 * 图例选中状态表。例：
	 * <pre>
	 	selected: {
		    // 选中'系列1'
		    '系列1': true,
		    // 不选中'系列2'
		    '系列2': false
		}
	 * </pre>
	 */
	private Map<String, Boolean> selected;
	
	public void select(List<String> legends2Select){
		if(legends2Select == null || legends2Select.isEmpty()){
			if(selected != null){
				selected.clear();
			}
		}
		if(selected == null){
			selected = new LinkedHashMap<>();
		}
		for(String l : legends2Select){
			selected.put(l, true);
		}
	}
	
	public void unselect(List<String> unselectLegends){
		if(unselectLegends == null || unselectLegends.isEmpty()){
			return;
		}
		if(selected == null){
			selected = new LinkedHashMap<>();
		}
		for(String l : unselectLegends){
			selected.put(l, false);
		}
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrient() {
		return orient;
	}

	public void setOrient(String orient) {
		this.orient = orient;
	}

	public Map<String, Boolean> getSelected() {
		return selected;
	}

	public void setSelected(Map<String, Boolean> selected) {
		this.selected = selected;
	}
}
