package com.dao;

import com.entity.JiazhenghetongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhenghetongVO;
import com.entity.view.JiazhenghetongView;


/**
 * 家政合同
 * 
 * @author 
 * @email 
 * @date 2023-03-08 11:11:01
 */
public interface JiazhenghetongDao extends BaseMapper<JiazhenghetongEntity> {
	
	List<JiazhenghetongVO> selectListVO(@Param("ew") Wrapper<JiazhenghetongEntity> wrapper);
	
	JiazhenghetongVO selectVO(@Param("ew") Wrapper<JiazhenghetongEntity> wrapper);
	
	List<JiazhenghetongView> selectListView(@Param("ew") Wrapper<JiazhenghetongEntity> wrapper);

	List<JiazhenghetongView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhenghetongEntity> wrapper);
	
	JiazhenghetongView selectView(@Param("ew") Wrapper<JiazhenghetongEntity> wrapper);
	

}
