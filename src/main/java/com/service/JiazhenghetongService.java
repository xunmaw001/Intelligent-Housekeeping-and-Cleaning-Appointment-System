package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiazhenghetongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiazhenghetongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiazhenghetongView;


/**
 * 家政合同
 *
 * @author 
 * @email 
 * @date 2023-03-08 11:11:01
 */
public interface JiazhenghetongService extends IService<JiazhenghetongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhenghetongVO> selectListVO(Wrapper<JiazhenghetongEntity> wrapper);
   	
   	JiazhenghetongVO selectVO(@Param("ew") Wrapper<JiazhenghetongEntity> wrapper);
   	
   	List<JiazhenghetongView> selectListView(Wrapper<JiazhenghetongEntity> wrapper);
   	
   	JiazhenghetongView selectView(@Param("ew") Wrapper<JiazhenghetongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhenghetongEntity> wrapper);
   	

}

