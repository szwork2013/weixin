package com.weixin.datacore.domain.busi.model;
// default package
// Generated 2014-2-14 14:54:51 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BusiCouponReceive generated by hbm2java
 */
@Entity
@Table(name = "busi_coupon_receive")
public class BusiCouponReceive implements java.io.Serializable {

	private String id;
	private String receiveName;
	private Date upateTime;
	private Date createTime;
	private String extend1;
	private String extend2;
	private String platformTag;

	public BusiCouponReceive() {
	}

	public BusiCouponReceive(String id) {
		this.id = id;
	}

	public BusiCouponReceive(String id, String receiveName, Date upateTime,
			Date createTime, String extend1, String extend2, String platformTag) {
		this.id = id;
		this.receiveName = receiveName;
		this.upateTime = upateTime;
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

	@Column(name = "receive_name", length = 50)
	public String getReceiveName() {
		return this.receiveName;
	}

	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "upate_time", length = 19)
	public Date getUpateTime() {
		return this.upateTime;
	}

	public void setUpateTime(Date upateTime) {
		this.upateTime = upateTime;
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
