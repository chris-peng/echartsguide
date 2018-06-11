package top.lcmatrix.util.echartsguide;

import java.util.List;

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

public class Chart {
	
	protected Title title;
	protected Legend legend = new Legend();
	protected Tooltip tooltip = new Tooltip();
	protected Toolbox toolbox;
	protected List<Dataset> dataset;
	protected List<AbsSeries> series;
	protected AbsVisualMap visualMap;
	
	protected List<Grid> grid;
	protected List<GridAxis> xAxis;
	protected List<GridAxis> yAxis;
	
	protected List<Polar> polar;
	protected List<RadiusAxis> radiusAxis;
	protected List<AngleAxis> angleAxis;
	
	protected List<Geo> geo;
	
	protected String backgroundColor;
	
	/**
	 * default(为null时): ['#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83',  '#ca8622', '#bda29a','#6e7074', '#546570', '#c4ccd3']
	 * 调色盘颜色列表。如果系列没有设置颜色，则会依次循环从该列表中取颜色作为系列颜色。
	 */
	private List<String> color;
	
	public List<Dataset> getDataset() {
		return dataset;
	}

	public void setDataset(List<Dataset> dataset) {
		this.dataset = dataset;
	}

	public List<AbsSeries> getSeries() {
		return series;
	}

	public void setSeries(List<AbsSeries> series) {
		this.series = series;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public List<Grid> getGrid() {
		return grid;
	}

	public void setGrid(List<Grid> grid) {
		this.grid = grid;
	}

	public List<GridAxis> getxAxis() {
		return xAxis;
	}

	public void setxAxis(List<GridAxis> xAxis) {
		this.xAxis = xAxis;
	}

	public List<GridAxis> getyAxis() {
		return yAxis;
	}

	public void setyAxis(List<GridAxis> yAxis) {
		this.yAxis = yAxis;
	}

	public List<String> getColor() {
		return color;
	}

	public void setColor(List<String> color) {
		this.color = color;
	}

	public Toolbox getToolbox() {
		return toolbox;
	}

	public void setToolbox(Toolbox toolbox) {
		this.toolbox = toolbox;
	}

	public AbsVisualMap getVisualMap() {
		return visualMap;
	}

	public void setVisualMap(AbsVisualMap visualMap) {
		this.visualMap = visualMap;
	}

	public List<Polar> getPolar() {
		return polar;
	}

	public void setPolar(List<Polar> polar) {
		this.polar = polar;
	}

	public List<RadiusAxis> getRadiusAxis() {
		return radiusAxis;
	}

	public void setRadiusAxis(List<RadiusAxis> radiusAxis) {
		this.radiusAxis = radiusAxis;
	}

	public List<AngleAxis> getAngleAxis() {
		return angleAxis;
	}

	public void setAngleAxis(List<AngleAxis> angleAxis) {
		this.angleAxis = angleAxis;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public List<Geo> getGeo() {
		return geo;
	}

	public void setGeo(List<Geo> geo) {
		this.geo = geo;
	}
}
