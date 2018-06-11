package top.lcmatrix.util.echartsguide.option;

public class Title extends AbsBlockEl{
	
	public Title(){
		
	}
	
	public Title(String text){
		this(text, null);
	}
	
	public Title(String text, String subtext){
		this.text = text;
		this.subtext = subtext;
	}
	
	/**
	 * default(为null时): true
	 */
	private Boolean show;
	
	/**
	 * default(为null时): ''
	 * 主标题文本，支持使用 \n 换行
	 */
	private String text;
	
	/**
	 * default(为null时): ''
	 * 主标题文本超链接
	 */
	private String link;
	
	/**
	 * default(为null时): 'blank'
	 * 指定窗口打开主标题超链接
	 */
	private String target;
	
	/**
	 * default(为null时): ''
	 * 副标题文本，支持使用 \n 换行
	 */
	private String subtext;
	

	/**
	 * default(为null时): ''
	 * 副标题文本超链接
	 */
	private String sublink;
	
	/**
	 * default(为null时): 'blank'
	 * 指定窗口打开副标题超链接
	 */
	private String subtarget;

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getSubtext() {
		return subtext;
	}

	public void setSubtext(String subtext) {
		this.subtext = subtext;
	}

	public String getSublink() {
		return sublink;
	}

	public void setSublink(String sublink) {
		this.sublink = sublink;
	}

	public String getSubtarget() {
		return subtarget;
	}

	public void setSubtarget(String subtarget) {
		this.subtarget = subtarget;
	}
}
