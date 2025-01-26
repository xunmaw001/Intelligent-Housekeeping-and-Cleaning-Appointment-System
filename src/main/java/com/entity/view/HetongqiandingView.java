package com.entity.view;

import com.entity.HetongqiandingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 合同签订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 11:11:01
 */
@TableName("hetongqianding")
public class HetongqiandingView  extends HetongqiandingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HetongqiandingView(){
	}
 
 	public HetongqiandingView(HetongqiandingEntity hetongqiandingEntity){
 	try {
			BeanUtils.copyProperties(this, hetongqiandingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
