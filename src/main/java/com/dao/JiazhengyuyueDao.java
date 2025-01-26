package com.dao;

import com.entity.JiazhengyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiazhengyuyueVO;
import com.entity.view.JiazhengyuyueView;


/**
 * 家政预约
 * 
 * @author 
 * @email 
 * @date 2023-03-08 11:11:00
 */
public interface JiazhengyuyueDao extends BaseMapper<JiazhengyuyueEntity> {
	
	List<JiazhengyuyueVO> selectListVO(@Param("ew") Wrapper<JiazhengyuyueEntity> wrapper);
	
	JiazhengyuyueVO selectVO(@Param("ew") Wrapper<JiazhengyuyueEntity> wrapper);
	
	List<JiazhengyuyueView> selectListView(@Param("ew") Wrapper<JiazhengyuyueEntity> wrapper);

	List<JiazhengyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhengyuyueEntity> wrapper);
	
	JiazhengyuyueView selectView(@Param("ew") Wrapper<JiazhengyuyueEntity> wrapper);
	

}
