package com.weixin.datacore.domain.weixin.model;
// default package
// Generated 2014-2-11 17:49:31 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * WeixinPageInfo generated by hbm2java
 */
@Entity
@Table(name = "weixin_page_info")
public class WeixinPageInfo implements java.io.Serializable {

	private String id;
	private String pageName;
	private String pageClass;
	private String pageClassName;
	private String pageTitle;
	private String pageSubtitle;
	private String content;
	private String associateLinks;
	private Integer displayNum;
	private String operatorId;
	private String operatorName;
	private Date updateTime;
	private Date createTime;
	private String extend1;
	private String extend2;
	private String platformTag;

	public WeixinPageInfo() {
	}

	public WeixinPageInfo(String id) {
		this.id = id;
	}

	public WeixinPageInfo(String id, String pageName, String pageClass,
			String pageClassName, String pageTitle, String pageSubtitle,
			String content, String associateLinks, Integer displayNum,
			String operatorId, String operatorName, Date updateTime,
			Date createTime, String extend1, String extend2, String platformTag) {
		this.id = id;
		this.pageName = pageName;
		this.pageClass = pageClass;
		this.pageClassName = pageClassName;
		this.pageTitle = pageTitle;
		this.pageSubtitle = pageSubtitle;
		this.content = content;
		this.associateLinks = associateLinks;
		this.displayNum = displayNum;
		this.operatorId = operatorId;
		this.operatorName = operatorName;
		this.updateTime = updateTime;
		this.createTime = createTime;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.platformTag = platformTag;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 50)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "page_name", length = 128)
	public String getPageName() {
		return this.pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	@Column(name = "page_class", length = 50)
	public String getPageClass() {
		return this.pageClass;
	}

	public void setPageClass(String pageClass) {
		this.pageClass = pageClass;
	}

	@Column(name = "page_class_name", length = 128)
	public String getPageClassName() {
		return this.pageClassName;
	}

	public void setPageClassName(String pageClassName) {
		this.pageClassName = pageClassName;
	}

	@Column(name = "page_title", length = 128)
	public String getPageTitle() {
		return this.pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	@Column(name = "page_ subtitle", length = 128)
	public String getPageSubtitle() {
		return this.pageSubtitle;
	}

	public void setPageSubtitle(String pageSubtitle) {
		this.pageSubtitle = pageSubtitle;
	}

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "associate_links", length = 256)
	public String getAssociateLinks() {
		return this.associateLinks;
	}

	public void setAssociateLinks(String associateLinks) {
		this.associateLinks = associateLinks;
	}

	@Column(name = "display_num")
	public Integer getDisplayNum() {
		return this.displayNum;
	}

	public void setDisplayNum(Integer displayNum) {
		this.displayNum = displayNum;
	}

	@Column(name = "operator_id", length = 50)
	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	@Column(name = "operator_name", length = 128)
	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", length = 19)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "extend1", length = 50)
	public String getExtend1() {
		return this.extend1;
	}

	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}

	@Column(name = "extend2", length = 50)
	public String getExtend2() {
		return this.extend2;
	}

	public void setExtend2(String extend2) {
		this.extend2 = extend2;
	}

	@Column(name = "platform_tag", length = 50)
	public String getPlatformTag() {
		return this.platformTag;
	}

	public void setPlatformTag(String platformTag) {
		this.platformTag = platformTag;
	}

}
