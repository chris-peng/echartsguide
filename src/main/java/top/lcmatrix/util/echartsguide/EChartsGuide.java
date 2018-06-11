package top.lcmatrix.util.echartsguide;

import java.util.ArrayList;
import java.util.List;

import top.lcmatrix.util.echartsguide.common.AxisType;
import top.lcmatrix.util.echartsguide.encode.AbsEncode;
import top.lcmatrix.util.echartsguide.option.AngleAxis;
import top.lcmatrix.util.echartsguide.option.Dataset;
import top.lcmatrix.util.echartsguide.option.Geo;
import top.lcmatrix.util.echartsguide.option.Grid;
import top.lcmatrix.util.echartsguide.option.GridAxis;
import top.lcmatrix.util.echartsguide.option.Legend;
import top.lcmatrix.util.echartsguide.option.Polar;
import top.lcmatrix.util.echartsguide.option.RadiusAxis;
import top.lcmatrix.util.echartsguide.option.Title;
import top.lcmatrix.util.echartsguide.option.Toolbox;
import top.lcmatrix.util.echartsguide.option.Tooltip;
import top.lcmatrix.util.echartsguide.option.visualmap.AbsVisualMap;
import top.lcmatrix.util.echartsguide.series.AbsSeries;
import top.lcmatrix.util.echartsguide.series.BarSeries;
import top.lcmatrix.util.echartsguide.series.LineSeries;
import top.lcmatrix.util.echartsguide.series.PieSeries;

public class EChartsGuide {

	public static final String SERIES_TYPE_LINE = "line";
	public static final String SERIES_TYPE_SMOOTH_LINE = "smooth_line";
	public static final String SERIES_TYPE_BAR = "bar";
	public static final String SERIES_TYPE_PIE = "pie";
	/**
	 * 南丁格尔饼图
	 */
	public static final String SERIES_TYPE_NTG_PIE = "ntg_pie";

	private Chart chart = new Chart();
	
	public Chart getChart() {
		return chart;
	}
	
	/**
	 * 生成一个简单的grid类型图，包括一个标题，一个category类型的x轴和一个value类型的y轴，一个grid类型图适用的toolbox，一个触发方式为axis的tooltip
	 * @param title
	 * @param xAxisName
	 * @param yAxisName
	 * @return
	 */
	public EChartsGuide simpleGridChart(String title, String xAxisName, String yAxisName){
		return title(title).addGridAxis(xAxisName, yAxisName)
				.toolbox(new String[]{
						Toolbox.FEATURE_MAGIC_TYPE,
						Toolbox.FEATURE_DATAVIEW,
						Toolbox.FEATURE_RESTORE,
						Toolbox.FEATURE_SAVE_AS_IMAGE,
				}, new String[]{
						Toolbox.MAGIC_TYPE_LINE,
						Toolbox.MAGIC_TYPE_BAR
				}).tooltip(Tooltip.TRIGGER_AXIS);
	}
	
	/**
	 * 生成一个简单的极坐标图，包括一个标题，一个value类型的径向轴和一个category类型的角度轴，一个极坐标图适用的toolbox，一个触发方式为axis的tooltip
	 * @param title
	 * @param radiusAxisName
	 * @param angleAxisName
	 * @return
	 */
	public EChartsGuide simplePolarChart(String title, String radiusAxisName, String angleAxisName){
		return title(title).addPolar(new Polar()).addPolarAxis(radiusAxisName, angleAxisName)
				.toolbox(new String[]{
						Toolbox.FEATURE_MAGIC_TYPE,
						Toolbox.FEATURE_DATAVIEW,
						Toolbox.FEATURE_RESTORE,
						Toolbox.FEATURE_SAVE_AS_IMAGE,
				}, new String[]{
						Toolbox.MAGIC_TYPE_LINE,
						Toolbox.MAGIC_TYPE_BAR
				}).tooltip(Tooltip.TRIGGER_AXIS);
	}
	
	public EChartsGuide title(String title){
		return title(title, null);
	}
	
	public EChartsGuide title(String title, String subTitle){
		return title(new Title(title, subTitle));
	}
	
	public EChartsGuide title(Title title){
		chart.setTitle(title);
		return this;
	}
	
	public EChartsGuide backgroundColor(String backgroundColor){
		chart.setBackgroundColor(backgroundColor);
		return this;
	}
	
	/**
	 * 设置可选颜色集
	 * default: ['#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83',  '#ca8622', '#bda29a','#6e7074', '#546570', '#c4ccd3']
	 * 调色盘颜色列表。如果系列没有设置颜色，则会依次循环从该列表中取颜色作为系列颜色。
	 * @param colors
	 * @return
	 */
	public EChartsGuide colors(List<String> colors){
		chart.setColor(colors);
		return this;
	}
	
	/**
	 * 配置图例
	 * @param legend
	 * @return
	 */
	public EChartsGuide legend(Legend legend){
		chart.setLegend(legend);
		return this;
	}
	
	/**
	 * 指定toolbox支持的工具
	 * @param features	见Toolbox类的FEATURE_*常量
	 * @return
	 */
	public EChartsGuide toolbox(String[] features){
		return toolbox(features, null);
	}
	
	/**
	 * 指定toolbox支持的工具，及支持的动态类型切换的图类型（折线图、柱状图、堆叠和平铺模式）
	 * @param features		见Toolbox类的FEATURE_*常量
	 * @param magicTypes	见Toolbox类的MAGIC_TYPE_*常量
	 * @return
	 */
	public EChartsGuide toolbox(String[] features, String[] magicTypes){
		chart.setToolbox(new Toolbox(features, magicTypes));
		return this;
	}
	
	/**
	 * 指定tooltip的触发方式
	 * @param trigger	见Tooltip的TRIGGER_*常量
	 * @return
	 */
	public EChartsGuide tooltip(String trigger){
		return tooltip(new Tooltip(trigger));
	}
	
	/**
	 * 配置tooltip
	 * @param tooltip
	 * @return
	 */
	public EChartsGuide tooltip(Tooltip tooltip){
		chart.setTooltip(tooltip);
		return this;
	}

	/**
	 * 添加指定grid 只支持grid类型图
	 * 
	 * @param grid
	 * @return
	 */
	public EChartsGuide addGrid(Grid grid) {
		List<Grid> grids = chart.getGrid();
		if (grids == null) {
			grids = new ArrayList<>();
			chart.setGrid(grids);
		}
		grids.add(grid);
		return this;
	}

	/**
	 * 添加x轴（默认category类型）和y轴（默认value类型） 只支持grid类型图
	 * @param xAxisName
	 * @param yAxisName
	 * @return
	 */
	public EChartsGuide addGridAxis(String xAxisName, String yAxisName) {
		GridAxis xAxis = null, yAxis = null;
		if (xAxisName != null) {
			xAxis = new GridAxis(xAxisName, AxisType.CATEGORY);
		}
		if (yAxisName != null) {
			yAxis = new GridAxis(yAxisName, AxisType.VALUE);
		}
		return addGridAxis(xAxis, yAxis);
	}

	/**
	 * 添加x轴和y轴 只支持grid类型图
	 * 
	 * @param xAxis
	 * @param yAxis
	 * @return
	 */
	public EChartsGuide addGridAxis(GridAxis xAxis, GridAxis yAxis) {
		if(xAxis != null){
			List<GridAxis> xAxises = chart.getxAxis();
			if (xAxises == null) {
				xAxises = new ArrayList<GridAxis>();
				chart.setxAxis(xAxises);
			}
			xAxises.add(xAxis);
		}
		if(yAxis != null){
			List<GridAxis> yAxises = chart.getyAxis();
			if (yAxises == null) {
				yAxises = new ArrayList<GridAxis>();
				chart.setyAxis(yAxises);
			}
			yAxises.add(yAxis);
		}
		return this;
	}
	
	public EChartsGuide addPolar(Polar polar) {
		List<Polar> polars = chart.getPolar();
		if (polars == null) {
			polars = new ArrayList<>();
			chart.setPolar(polars);
		}
		polars.add(polar);
		return this;
	}
	
	/**
	 * 添加径向轴（默认value类型）和角度轴（默认category类型） 只支持极坐标图
	 * @param radiusAxisName
	 * @param angleAxisName
	 * @return
	 */
	public EChartsGuide addPolarAxis(String radiusAxisName, String angleAxisName) {
		RadiusAxis radiusAxis = null;
		AngleAxis angleAxis = null;
		if (radiusAxisName != null) {
			radiusAxis = new RadiusAxis(radiusAxisName, AxisType.VALUE);
		}
		if (angleAxisName != null) {
			angleAxis = new AngleAxis(angleAxisName, AxisType.CATEGORY);
		}
		return addPolarAxis(radiusAxis, angleAxis);
	}
	
	/**
	 * 添加径向轴和角度轴，只支持极坐标图
	 * @param radiusAxis
	 * @param angleAxis
	 * @return
	 */
	public EChartsGuide addPolarAxis(RadiusAxis radiusAxis, AngleAxis angleAxis) {
		if(radiusAxis != null){
			List<RadiusAxis> radiusAxises = chart.getRadiusAxis();
			if (radiusAxises == null) {
				radiusAxises = new ArrayList<RadiusAxis>();
				chart.setRadiusAxis(radiusAxises);
			}
			radiusAxises.add(radiusAxis);
		}
		if(angleAxis != null){
			List<AngleAxis> angleAxises = chart.getAngleAxis();
			if (angleAxises == null) {
				angleAxises = new ArrayList<AngleAxis>();
				chart.setAngleAxis(angleAxises);
			}
			angleAxises.add(angleAxis);
		}
		return this;
	}
	
	/**
	 * 添加地理坐标
	 * @param geo
	 * @return
	 */
	public EChartsGuide addGeo(Geo geo) {
		List<Geo> geos = chart.getGeo();
		if (geos == null) {
			geos = new ArrayList<>();
			chart.setGeo(geos);
		}
		geos.add(geo);
		return this;
	}

	/**
	 * 添加源数据
	 * 
	 * @param datas
	 * @return
	 */
	public EChartsGuide addDataset(List<?> datas) {
		List<Dataset> datasets = chart.getDataset();
		if (datasets == null) {
			datasets = new ArrayList<>();
			chart.setDataset(datasets);
		}
		Dataset ds = new Dataset();
		ds.setSource(datas);
		datasets.add(ds);
		return this;
	}
	
	/**
	 * 添加系列，无系列名或在encode中设置
	 * 
	 * @param type
	 *            系列类型，见EchartsGuide的SERIES_TYPE_*常量
	 * @param encode
	 *            dataset到坐标的映射规则
	 * @return
	 */
	public EChartsGuide addSeries(String type, AbsEncode encode) {
		AbsSeries series = genSeries(type);
		series.setEncode(encode);
		return addSeries(series);
	}

	/**
	 * 添加系列
	 * 
	 * @param type
	 *            系列类型，见EchartsGuide的SERIES_TYPE_*常量
	 * @param name
	 *            系列名称，用于legend和tooltip的显示
	 * @param encode
	 *            dataset到坐标的映射规则
	 * @return
	 */
	public EChartsGuide addSeries(String type, String name, AbsEncode encode) {
		AbsSeries series = genSeries(type);
		series.setName(name);
		series.setEncode(encode);
		return addSeries(series);
	}

	/**
	 * 添加系列
	 * 
	 * @param series
	 * @return
	 */
	public EChartsGuide addSeries(AbsSeries series) {
		List<AbsSeries> serieses = chart.getSeries();
		if (serieses == null) {
			serieses = new ArrayList<>();
			chart.setSeries(serieses);
		}
		serieses.add(series);
		return this;
	}
	
	/**
	 * 设置视觉映射组件
	 * @param visualMap
	 * @return
	 */
	public EChartsGuide visualMap(AbsVisualMap visualMap){
		chart.setVisualMap(visualMap);
		return this;
	}

	private AbsSeries genSeries(String type) {
		switch (type) {
		case SERIES_TYPE_LINE:
			return new LineSeries();

		case SERIES_TYPE_SMOOTH_LINE:
			LineSeries lineSeries = new LineSeries();
			lineSeries.setSmooth(LineSeries.COMMON_SMOOTH);
			return lineSeries;
		
		case SERIES_TYPE_BAR:
			return new BarSeries();
			
		case SERIES_TYPE_PIE:
			return new PieSeries();
			
		case SERIES_TYPE_NTG_PIE:
			PieSeries pieSeries = new PieSeries();
			pieSeries.setRoseType(true);
			return pieSeries;
			
		default:
			return null;
		}
	}
}
