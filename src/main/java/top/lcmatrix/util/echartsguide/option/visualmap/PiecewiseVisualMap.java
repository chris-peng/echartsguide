package top.lcmatrix.util.echartsguide.option.visualmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import top.lcmatrix.util.echartsguide.common.SelectedMode;

/**
 * 暂不支持pieces选项
 * @author chris
 *
 */
public class PiecewiseVisualMap extends AbsVisualMap{
	
	public static class Guide extends AbsVisualMap.Guide<Guide>{
		private PiecewiseVisualMap visualMap = new PiecewiseVisualMap();

		/**
		 * 对于连续型数据，自动平均切分成几段。默认为5段
		 * @param splitNumber
		 * @return
		 */
		public Guide splitNumber(int splitNumber){
			visualMap.splitNumber = splitNumber;
			return this;
		}
		
		/**
		 * 设置用于表示离散型数据（或可以称为类别型数据、枚举型数据）的全集
		 * @param categories
		 * @return
		 */
		public Guide categories(String[] categories){
			if(visualMap.categories == null){
				visualMap.categories = new ArrayList<String>();
			}
			visualMap.categories.clear();
			visualMap.categories.addAll(Arrays.asList(categories));
			return this;
		}
		
		/**
		 * 设置选择模式，默认为多选模式
		 * @param multiSelect	是否设置为多选模式
		 * @return
		 */
		public Guide selectedMode(boolean multiSelect){
			if(multiSelect){
				visualMap.selectedMode = SelectedMode.MULTIPLE;
			}else{
				visualMap.selectedMode = SelectedMode.SINGLE;
			}
			return this;
		}
		
		/**
		 * 设置categories和图标类型的映射关系
		 * @param symbolMapping		空字符串""表示默认映射
		 * @return
		 */
		public Guide inRangeSymbol(Map<String, String> symbolMapping){
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setSymbol(symbolMapping);
			return this;
		}
		
		/**
		 * 设置categories和图标大小的映射关系
		 * @param sizeMapping		空字符串""表示默认映射
		 * @return
		 */
		public Guide inRangeSymbolSize(Map<String, Integer> sizeMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setSymbolSize(sizeMapping);
			return this;
		}
		
		/**
		 * 设置categories和图元颜色的映射关系
		 * @param colorMapping		空字符串""表示默认映射
		 * @return
		 */
		public Guide inRangeSymbolColor(Map<String, String> colorMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColor(colorMapping);
			return this;
		}
		
		/**
		 * 设置categories和图元的颜色的透明度的映射关系
		 * @param colorAlphaMapping		空字符串""表示默认映射，value的取值范围0~1
		 * @return
		 */
		public Guide inRangeSymbolColorAlpha(Map<String, Double> colorAlphaMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorAlpha(colorAlphaMapping);
			return this;
		}
		
		/**
		 * 设置categories和图元以及其附属物（如文字标签）的透明度的映射关系
		 * @param opacityMapping	空字符串""表示默认映射，value的取值范围0~1
		 * @return
		 */
		public Guide inRangeSymbolOpacity(Map<String, Double> opacityMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setOpacity(opacityMapping);
			return this;
		}
		
		/**
		 * 设置categories和颜色的明暗度的映射关系
		 * @param colorLightnessMapping		空字符串""表示默认映射，value的取值范围0~1
		 * @return
		 */
		public Guide inRangeSymbolColorLightness(Map<String, Double> colorLightnessMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorLightness(colorLightnessMapping);
			return this;
		}
		
		/**
		 * 设置categories和颜色的饱和度的映射关系
		 * @param colorSaturationMapping		空字符串""表示默认映射，value的取值范围0~1
		 * @return
		 */
		public Guide inRangeSymbolColorSaturation(Map<String, Double> colorSaturationMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorSaturation(colorSaturationMapping);
			return this;
		}
		
		/**
		 * 设置categories和颜色的色调的映射关系
		 * @param colorHueMapping		空字符串""表示默认映射，value的取值范围0~360
		 * @return
		 */
		public Guide inRangeSymbolColorHue(Map<String, Double> colorHueMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.inRange == null){
				visualMap.inRange = new RangeConfig();
			}
			visualMap.inRange.setColorHue(colorHueMapping);
			return this;
		}
		
		/**
		 * 设置categories和图标类型的映射关系（超出范围或未选中状态）
		 * @param symbolMapping		空字符串""表示默认映射
		 * @return
		 */
		public Guide outOfRangeSymbol(Map<String, String> symbolMapping){
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setSymbol(symbolMapping);
			return this;
		}
		
		/**
		 * 设置categories和图标大小的映射关系（超出范围或未选中状态）
		 * @param sizeMapping		空字符串""表示默认映射
		 * @return
		 */
		public Guide outOfRangeSymbolSize(Map<String, Integer> sizeMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setSymbolSize(sizeMapping);
			return this;
		}
		
		/**
		 * 设置categories和图元颜色的映射关系（超出范围或未选中状态）
		 * @param colorMapping		空字符串""表示默认映射
		 * @return
		 */
		public Guide outOfRangeSymbolColor(Map<String, String> colorMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColor(colorMapping);
			return this;
		}
		
		/**
		 * 设置categories和图元的颜色的透明度的映射关系（超出范围或未选中状态）
		 * @param colorAlphaMapping		空字符串""表示默认映射，value的取值范围0~1
		 * @return
		 */
		public Guide outOfRangeSymbolColorAlpha(Map<String, Double> colorAlphaMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorAlpha(colorAlphaMapping);
			return this;
		}
		
		/**
		 * 设置categories和图元以及其附属物（如文字标签）的透明度的映射关系（超出范围或未选中状态）
		 * @param opacityMapping	空字符串""表示默认映射，value的取值范围0~1
		 * @return
		 */
		public Guide outOfRangeSymbolOpacity(Map<String, Double> opacityMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setOpacity(opacityMapping);
			return this;
		}
		
		/**
		 * 设置categories和颜色的明暗度的映射关系（超出范围或未选中状态）
		 * @param colorLightnessMapping		空字符串""表示默认映射，value的取值范围0~1
		 * @return
		 */
		public Guide outOfRangeSymbolColorLightness(Map<String, Double> colorLightnessMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorLightness(colorLightnessMapping);
			return this;
		}
		
		/**
		 * 设置categories和颜色的饱和度的映射关系（超出范围或未选中状态）
		 * @param colorSaturationMapping		空字符串""表示默认映射，value的取值范围0~1
		 * @return
		 */
		public Guide outOfRangeSymbolColorSaturation(Map<String, Double> colorSaturationMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorSaturation(colorSaturationMapping);
			return this;
		}
		
		/**
		 * 设置categories和颜色的色调的映射关系（超出范围或未选中状态）
		 * @param colorHueMapping		空字符串""表示默认映射，value的取值范围0~360
		 * @return
		 */
		public Guide outOfRangeSymbolColorHue(Map<String, Double> colorHueMapping){
			AbsVisualMap visualMap = getVisualMap();
			if(visualMap.outOfRange == null){
				visualMap.outOfRange = new RangeConfig();
			}
			visualMap.outOfRange.setColorHue(colorHueMapping);
			return this;
		}
		
		@Override
		public AbsVisualMap getVisualMap() {
			return visualMap;
		}
		
	}

	private final String type = "piecewise";
	
	private Integer splitNumber;
	
	private List<String> categories;
	
	private String selectedMode;

	public Integer getSplitNumber() {
		return splitNumber;
	}

	public void setSplitNumber(Integer splitNumber) {
		this.splitNumber = splitNumber;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public String getSelectedMode() {
		return selectedMode;
	}

	public void setSelectedMode(String selectedMode) {
		this.selectedMode = selectedMode;
	}

	public String getType() {
		return type;
	}
}
