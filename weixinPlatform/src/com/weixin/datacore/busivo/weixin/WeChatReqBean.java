package com.weixin.datacore.busivo.weixin;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlCDATA;

@SuppressWarnings("serial")
@XmlRootElement(name = "xml")
public class WeChatReqBean implements Serializable {

	private String toUserName;
	private String fromUserName;
	private Long createTime;
	private String msgType;
	private String content;
	private Double location_X;
	private Double location_Y;
	private Integer scale;
	private String label;
	private Long msgId;
	private String event;
	private String event_key;

	public String getEvent() {
		return event;
	}

	@XmlCDATA
	@XmlElement(name = "Event")
	public void setEvent(String event) {
		this.event = event;
	}

	public String getToUserName() {
		return toUserName;
	}

	@XmlCDATA
	@XmlElement(name = "ToUserName")
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	@XmlCDATA
	@XmlElement(name = "FromUserName")
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return createTime;
	}

	@XmlElement(name = "CreateTime")
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	@XmlCDATA
	@XmlElement(name = "MsgType")
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getContent() {
		return content;
	}

	@XmlCDATA
	@XmlElement(name = "Content")
	public void setContent(String content) {
		this.content = content;
	}

	public Double getLocation_X() {
		return location_X;
	}

	@XmlElement(name = "Location_X")
	public void setLocation_X(Double location_X) {
		this.location_X = location_X;
	}

	public Double getLocation_Y() {
		return location_Y;
	}

	@XmlElement(name = "Location_Y")
	public void setLocation_Y(Double location_Y) {
		this.location_Y = location_Y;
	}

	public Integer getScale() {
		return scale;
	}

	@XmlElement(name = "Scale")
	public void setScale(Integer scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	@XmlCDATA
	@XmlElement(name = "Label")
	public void setLabel(String label) {
		this.label = label;
	}

	public Long getMsgId() {
		return msgId;
	}

	@XmlElement(name = "MsgId")
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}

	public String getEvent_key() {
		return event_key;
	}

	@XmlCDATA
	@XmlElement(name = "EventKey")
	public void setEvent_key(String eventKey) {
		event_key = eventKey;
	}

	@Override
	public String toString() {
		return "WeChatReqBean [content=" + content + ", createTime="
				+ createTime + ", event=" + event + ", event_key=" + event_key
				+ ", fromUserName=" + fromUserName + ", label=" + label
				+ ", location_X=" + location_X + ", location_Y=" + location_Y
				+ ", msgId=" + msgId + ", msgType=" + msgType + ", scale="
				+ scale + ", toUserName=" + toUserName + "]";
	}
}