package com.letv.mms.transmission.model;

public class ConAlbumLangInfoModel extends MultiLangBaseModel {
		private static final long serialVersionUID = 1L;
	
	private String subTitle;//   副标题	private String alias;//   别名	private String tag;//   标签	private String shortDesc;//   简略描述	private String description;//   描述
	private String playStatus; // 跟播规则
	private String vipWatchingFocus; // 会员看点		public static final String ID = "ID";	public static final String ALBUM_ID = "ALBUM_ID";	public static final String LANG = "LANG";	public static final String NAME = "NAME";	public static final String SUB_TITLE = "SUB_TITLE";
	public static final String ALIAS = "alias";
	public static final String TAG = "TAG";	public static final String SHORT_DESC = "SHORT_DESC";	public static final String DESCRIPTION = "DESCRIPTION";	public static final String DELETED = "DELETED";	public static final String CREATE_TIME = "CREATE_TIME";	public static final String CREATE_ID = "CREATE_ID";	public static final String UPDATE_TIME = "UPDATE_TIME";	public static final String UPDATE_ID = "UPDATE_ID";
	public String getSubTitle() {	    return this.subTitle;	}	public void setSubTitle(String subTitle) {	    this.subTitle=subTitle;	}	public String getTag() {	    return this.tag;	}	public void setTag(String tag) {	    this.tag=tag;	}	public String getShortDesc() {	    return this.shortDesc;	}	public void setShortDesc(String shortDesc) {	    this.shortDesc=shortDesc;	}	public String getDescription() {	    return this.description;	}	public void setDescription(String description) {	    this.description=description;	}	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getPlayStatus() {
		return this.playStatus;
	}
	public void setPlayStatus(String playStatus) {
		this.playStatus = playStatus;
	}
	public String getVipWatchingFocus() {
		return this.vipWatchingFocus;
	}
	public void setVipWatchingFocus(String vipWatchingFocus) {
		this.vipWatchingFocus = vipWatchingFocus;
	}
	
}
