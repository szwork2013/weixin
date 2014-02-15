/******************************************************************************
f * Copyright (C) 2013 SiFangDingLi Co.,Ltd
 * All Rights Reserved.
 *****************************************************************************/
 
package com.weixin.datacore.service.weixin.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weixin.comm.PageInfo;
import com.weixin.datacore.core.impl.ServiceSrvImpl;
import com.weixin.datacore.domain.weixin.dao.WeixinArticlesMultiDao;
import com.weixin.datacore.domain.weixin.model.WeixinArticlesMulti;
import com.weixin.datacore.service.weixin.WeixinArticlesMultiSrv;

@Service("weixinArticlesMultiSrv")
public class WeixinArticlesMultiSrvImpl extends ServiceSrvImpl implements WeixinArticlesMultiSrv {

	@Override
	public WeixinArticlesMulti addWeixinArticlesMulti(WeixinArticlesMulti weixinArticlesMulti) {
		// TODO Auto-generated method stub
		return (WeixinArticlesMulti)weixinArticlesMultiDao.save(weixinArticlesMulti);
	}

	@Override
	public void deleWeixinArticlesMulti(WeixinArticlesMulti weixinArticlesMulti) {
		// TODO Auto-generated method stub
		weixinArticlesMultiDao.delete(weixinArticlesMulti);
	}

	@Override
	public void deleWeixinArticlesMulti(Long id) {
		// TODO Auto-generated method stub
		weixinArticlesMultiDao.deleteByKey(id);
	}

	@Override
	public void updateWeixinArticlesMulti(WeixinArticlesMulti weixinArticlesMulti) {
		// TODO Auto-generated method stub
		weixinArticlesMultiDao.saveOrUpdate(weixinArticlesMulti);
	}
	
	@Override
	public void saveBatchWeixinArticlesMulti(List<WeixinArticlesMulti> weixinArticlesMultiLs) {
		// TODO Auto-generated method stub
		weixinArticlesMultiDao.addBacth(weixinArticlesMultiLs);
	}
	
	public PageInfo<WeixinArticlesMulti> findWeixinArticlesMultiList(Map<String, Object> params, int pageNo, int pageSize) {
		 return null;
	}
	
	public List<WeixinArticlesMulti> findWeixinArticlesMultiList(Map<String, Object> params) {
		String hql="from WeixinArticlesMulti c 1=1";
		StringBuffer where = new StringBuffer();
		String orderBy = " order by c.id";
		List<Object> values = new ArrayList<Object>();
		for(Map.Entry<String, Object> enity : params.entrySet()) {
			if("articlesId".equals(enity.getKey())) {
				where.append(" and c.articlesId=?");
				values.add(enity.getValue());
			}
		}
		List<WeixinArticlesMulti> list=weixinArticlesMultiDao.loadByPagenation(hql+where.toString()+orderBy,1,10, values.toArray());
		return list;
	}
	
	public WeixinArticlesMulti getWeixinArticlesMulti(Long id) {
		return weixinArticlesMultiDao.get(id);
	}
	
	@Override
	public void deleWeixinArticlesMultiList(List<WeixinArticlesMulti> weixinArticlesMultiLs) {
		weixinArticlesMultiDao.deleteAll(weixinArticlesMultiLs);
	}
	
	@Resource(name="weixinArticlesMultiDao")
	private WeixinArticlesMultiDao weixinArticlesMultiDao;
}
