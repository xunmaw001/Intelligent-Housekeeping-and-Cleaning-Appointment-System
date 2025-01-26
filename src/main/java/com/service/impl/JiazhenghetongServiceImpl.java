package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiazhenghetongDao;
import com.entity.JiazhenghetongEntity;
import com.service.JiazhenghetongService;
import com.entity.vo.JiazhenghetongVO;
import com.entity.view.JiazhenghetongView;

@Service("jiazhenghetongService")
public class JiazhenghetongServiceImpl extends ServiceImpl<JiazhenghetongDao, JiazhenghetongEntity> implements JiazhenghetongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiazhenghetongEntity> page = this.selectPage(
                new Query<JiazhenghetongEntity>(params).getPage(),
                new EntityWrapper<JiazhenghetongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiazhenghetongEntity> wrapper) {
		  Page<JiazhenghetongView> page =new Query<JiazhenghetongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiazhenghetongVO> selectListVO(Wrapper<JiazhenghetongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiazhenghetongVO selectVO(Wrapper<JiazhenghetongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiazhenghetongView> selectListView(Wrapper<JiazhenghetongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiazhenghetongView selectView(Wrapper<JiazhenghetongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
