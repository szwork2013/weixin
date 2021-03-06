package com.weixin.datacore.domain.sys.model;
// default package
// Generated 2014-1-22 16:24:37 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SysRolePrivilege generated by hbm2java
 */
@Entity
@Table(name = "sys_role_privilege")
public class SysRolePrivilege implements java.io.Serializable {

	private SysRolePrivilegeId id;
	private Integer int_;
	private String operatorId;
	private String operatorName;
	private Date updateTime;
	private Date createTime;
	private String extend1;
	private String extend2;
	private String platformTag;

	public SysRolePrivilege() {
	}

	public SysRolePrivilege(SysRolePrivilegeId id) {
		this.id = id;
	}

	public SysRolePrivilege(SysRolePrivilegeId id, Integer int_,
			String operatorId, String operatorName, Date updateTime,
			Date createTime, String extend1, String extend2, String platformTag) {
		this.id = id;
		this.int_ = int_;
		this.operatorId = operatorId;
		this.operatorName = operatorName;
		this.updateTime = updateTime;
		this.createTime = createTime;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.platformTag = platformTag;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "roleId", column = @Column(name = "role_id", nullable = false, length = 50)),
			@AttributeOverride(name = "privilegeId", column = @Column(name = "privilege_id", nullable = false, length = 50)) })
	public SysRolePrivilegeId getId() {
		return this.id;
	}

	public void setId(SysRolePrivilegeId id) {
		this.id = id;
	}

	@Column(name = "int")
	public Integer getInt_() {
		return this.int_;
	}

	public void setInt_(Integer int_) {
		this.int_ = int_;
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

	@Column(name = "extend1", length = 128)
	public String getExtend1() {
		return this.extend1;
	}

	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}

	@Column(name = "extend2", length = 128)
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
