package com.weixin.datacore.domain.weixin.model;
// default package
// Generated 2014-1-22 16:24:37 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * WeixinMessageEvent generated by hbm2java
 */
@Entity
@Table(name = "weixin_message_event")
public class WeixinMessageEvent implements java.io.Serializable {

	private String id;
	private String toUserName;
	private String fromUserName;
	private Long createTime;
	private String event;
	private String msgType;
	private String eventKey;
	private String ticket;
	private Float locationX;
	private Float locationY;
	private Float scale;
	private String extend1;
	private String extend2;
	private String platformTag;

	public WeixinMessageEvent() {
	}

	public WeixinMessageEvent(String id) {
		this.id = id;
	}

	public WeixinMessageEvent(String id, String toUserName,
			String fromUserName, Long createTime, String event, String msgType,
			String eventKey, String ticket, Float locationX, Float locationY,
			Float scale, String extend1, String extend2, String platformTag) {
		this.id = id;
		this.toUserName = toUserName;
		this.fromUserName = fromUserName;
		this.createTime = createTime;
		this.event = event;
		this.msgType = msgType;
		this.eventKey = eventKey;
		this.ticket = ticket;
		this.locationX = locationX;
		this.locationY = locationY;
		this.scale = scale;
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

	@Column(name = "to_user_name", length = 50)
	public String getToUserName() {
		return this.toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	@Column(name = "from_user_name", length = 50)
	public String getFromUserName() {
		return this.fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	@Column(name = "create_time")
	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	@Column(name = "event", length = 50)
	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Column(name = "msg_type", length = 50)
	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	@Column(name = "event_key", length = 128)
	public String getEventKey() {
		return this.eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	@Column(name = "ticket", length = 128)
	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	@Column(name = "location_x", precision = 12, scale = 0)
	public Float getLocationX() {
		return this.locationX;
	}

	public void setLocationX(Float locationX) {
		this.locationX = locationX;
	}

	@Column(name = "location_y", precision = 12, scale = 0)
	public Float getLocationY() {
		return this.locationY;
	}

	public void setLocationY(Float locationY) {
		this.locationY = locationY;
	}

	@Column(name = "scale", precision = 12, scale = 0)
	public Float getScale() {
		return this.scale;
	}

	public void setScale(Float scale) {
		this.scale = scale;
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