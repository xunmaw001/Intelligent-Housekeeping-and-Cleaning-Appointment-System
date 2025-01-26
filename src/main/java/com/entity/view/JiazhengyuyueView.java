package com.entity.view;

import com.entity.JiazhengyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家政预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 11:11:00
 */
@TableName("jiazhengyuyue")
public class JiazhengyuyueView  extends JiazhengyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiazhengyuyueView(){
	}
 
 	public JiazhengyuyueView(JiazhengyuyueEntity jiazhengyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, jiazhengyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
