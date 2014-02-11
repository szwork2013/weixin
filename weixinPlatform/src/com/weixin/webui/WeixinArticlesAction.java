package com.weixin.webui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import com.weixin.comm.ConvertJson;
import com.weixin.comm.PageInfo;
import com.weixin.comm.date.DateUtil;
import com.weixin.comm.logs.LogUtil;
import com.weixin.datacore.domain.weixin.model.WeixinArticles;
import com.weixin.datacore.domain.weixin.model.WeixinPicture;
import com.weixin.datacore.service.weixin.WeixinArticlesSrv;
import com.weixin.webui.form.WeixinArticlesForm;
import com.weixin.webui.core.BaseAction;

/**
 * 图文管理action
 * 
 * @author JINLONE
 * 
 */
public class WeixinArticlesAction extends BaseAction {
	private String jump;
	private WeixinArticlesForm weixinArticlesForm;
	private String id;
	/**
	 * 
	 */
	private static final long serialVersionUID = -4949448238447282481L;

	public String articlesList(){
		if(weixinArticlesForm!=null){
			Map<String, Object> params = new HashMap<String, Object>();
			
			if(StringUtils.isNotEmpty(weixinArticlesForm.getTitle())){
				params.put("title", weixinArticlesForm.getTitle());
			}
			
			if(StringUtils.isNotEmpty(weixinArticlesForm.getPicType())){
				params.put("picType", weixinArticlesForm.getPicType());
			}
			
			Long total = 0L;
			Map<String, Object> map = new HashMap<String, Object>();
			PageInfo<WeixinArticles> pageInfo = weixinArticlesSrv.findWeixinArticlesList(params,
					this.page, this.rows);
			List<WeixinArticlesForm> pictureLs = new ArrayList<WeixinArticlesForm>();
			if (pageInfo != null) {
				for (WeixinArticles obj : pageInfo.getResultlist()) {
					WeixinArticlesForm e=new WeixinArticlesForm();
					e.setCreateTime(String.valueOf(obj.getCreateTime()));
					e.setDescription(obj.getDescription());
					e.setTitle(obj.getTitle());
					e.setId(String.valueOf(obj.getId()));
					int picType=obj.getPicType();
					if(picType==1){
						e.setPicType("单图文");
					}else{
						e.setPicType("多图文");
					}
					int status=obj.getStatus();
					if(status==1){
						e.setStatus("有效");
					}else{
						e.setStatus("无效");
					}
					e.setUpdateTime(String.valueOf(obj.getUpdateTime()));
					pictureLs.add(e);
				}
				total = pageInfo.getTotalrecond();
			}
			map.put("total", total);
			map.put("rows", pictureLs);
			String jsonStr = ConvertJson.map2json(map);
			LogUtil.info(jsonStr);
			this.writeResult(jsonStr);
			return null;
		}
		return SUCCESS;
	}
	
	/**
	 * 删除
	 * 
	 * @return
	 */
	public String articlesRemove() {
		if(StringUtils.isNotEmpty(id)){
			WeixinArticles weixinArticles=weixinArticlesSrv.getWeixinArticles(Long.valueOf(id));
			if(weixinArticles!=null){
				weixinArticles.setStatus(0);
				weixinArticlesSrv.updateWeixinArticles(weixinArticles);
				WeixinArticlesForm e=new WeixinArticlesForm();
				e.setCreateTime(String.valueOf(weixinArticles.getCreateTime()));
				e.setDescription(weixinArticles.getDescription());
				e.setTitle(weixinArticles.getTitle());
				e.setId(String.valueOf(weixinArticles.getId()));
				int picType=weixinArticles.getPicType();
				if(picType==1){
					e.setPicType("单图文");
				}else{
					e.setPicType("多图文");
				}
				int status=weixinArticles.getStatus();
				if(status==1){
					e.setStatus("有效");
				}else{
					e.setStatus("无效");
				}
				e.setUpdateTime(String.valueOf(weixinArticles.getUpdateTime()));
				String jsonStr = ConvertJson.bean2json(e);
				LogUtil.info(jsonStr);
				this.writeResult(jsonStr);
				return null;
			}
		}
		return SUCCESS;
	}

	/**
	 * 新增
	 * 
	 * @return
	 */
	public String articlesAdd() {
		WeixinArticles weixinArticles=new WeixinArticles();
		if(weixinArticlesForm!=null){
			weixinArticles.setCreateTime(DateUtil.getNow());
			weixinArticles.setDescription(weixinArticlesForm.getDescription());
			weixinArticles.setUrl(weixinArticlesForm.getUrl());
			weixinArticles.setPicType(1);
			weixinArticles.setTitle(weixinArticlesForm.getTitle());
			weixinArticles.setStatus(1);
			weixinArticles.setPicUrl(weixinArticlesForm.getPicUrl());
			weixinArticlesSrv.addWeixinArticles(weixinArticles);
			
			weixinArticlesForm.setId(String.valueOf(weixinArticles.getId()));
			weixinArticlesForm.setStatus("有效");
			weixinArticlesForm.setPicType("单图文");
			String jsonStr = ConvertJson.bean2json(weixinArticlesForm);
			LogUtil.info(jsonStr);
			this.writeResult(jsonStr);
			return null;
		}
		return SUCCESS;
	}

	/**
	 * 跳转
	 * 
	 * @return
	 */
	public String articlesBase() {
		if (jump.equals("single")) {
			return "single";
		}
		if (jump.equals("edit")) {
			return "edit";
		}
		if (jump.equals("multi")) {
			return "multi";
		}
		return SUCCESS;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getJump() {
		return jump;
	}

	public void setJump(String jump) {
		this.jump = jump;
	}

	public WeixinArticlesForm getWeixinArticlesForm() {
		return weixinArticlesForm;
	}

	public void setWeixinArticlesForm(WeixinArticlesForm weixinArticlesForm) {
		this.weixinArticlesForm = weixinArticlesForm;
	}

	@Resource(name = "weixinArticlesSrv")
	private WeixinArticlesSrv weixinArticlesSrv;
}