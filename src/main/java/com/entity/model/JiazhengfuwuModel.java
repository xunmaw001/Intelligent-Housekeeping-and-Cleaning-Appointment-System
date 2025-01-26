package com.entity.model;

import com.entity.JiazhengfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 家政服务
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-08 11:11:00
 */
public class JiazhengfuwuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 家政姓名
	 */
	
	private String jiazhengxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private Integer nianling;
		
	/**
	 * 民族
	 */
	
	private String minzu;
		
	/**
	 * 最高学历
	 */
	
	private String zuigaoxueli;
		
	/**
	 * 服务类型
	 */
	
	private String fuwuleixing;
		
	/**
	 * 服务名称
	 */
	
	private String fuwumingcheng;
		
	/**
	 * 服务区域
	 */
	
	private String fuwuquyu;
		
	/**
	 * 工作经验
	 */
	
	private String gongzuojingyan;
		
	/**
	 * 服务金额
	 */
	
	private Integer fuwujine;
		
	/**
	 * 服务介绍
	 */
	
	private String fuwujieshao;
				
	
	/**
	 * 设置：家政姓名
	 */
	 
	public void setJiazhengxingming(String jiazhengxingming) {
		this.jiazhengxingming = jiazhengxingming;
	}
	
	/**
	 * 获取：家政姓名
	 */
	public String getJiazhengxingming() {
		return jiazhengxingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：民族
	 */
	 
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	
	/**
	 * 获取：民族
	 */
	public String getMinzu() {
		return minzu;
	}
				
	
	/**
	 * 设置：最高学历
	 */
	 
	public void setZuigaoxueli(String zuigaoxueli) {
		this.zuigaoxueli = zuigaoxueli;
	}
	
	/**
	 * 获取：最高学历
	 */
	public String getZuigaoxueli() {
		return zuigaoxueli;
	}
				
	
	/**
	 * 设置：服务类型
	 */
	 
	public void setFuwuleixing(String fuwuleixing) {
		this.fuwuleixing = fuwuleixing;
	}
	
	/**
	 * 获取：服务类型
	 */
	public String getFuwuleixing() {
		return fuwuleixing;
	}
				
	
	/**
	 * 设置：服务名称
	 */
	 
	public void setFuwumingcheng(String fuwumingcheng) {
		this.fuwumingcheng = fuwumingcheng;
	}
	
	/**
	 * 获取：服务名称
	 */
	public String getFuwumingcheng() {
		return fuwumingcheng;
	}
				
	
	/**
	 * 设置：服务区域
	 */
	 
	public void setFuwuquyu(String fuwuquyu) {
		this.fuwuquyu = fuwuquyu;
	}
	
	/**
	 * 获取：服务区域
	 */
	public String getFuwuquyu() {
		return fuwuquyu;
	}
				
	
	/**
	 * 设置：工作经验
	 */
	 
	public void setGongzuojingyan(String gongzuojingyan) {
		this.gongzuojingyan = gongzuojingyan;
	}
	
	/**
	 * 获取：工作经验
	 */
	public String getGongzuojingyan() {
		return gongzuojingyan;
	}
				
	
	/**
	 * 设置：服务金额
	 */
	 
	public void setFuwujine(Integer fuwujine) {
		this.fuwujine = fuwujine;
	}
	
	/**
	 * 获取：服务金额
	 */
	public Integer getFuwujine() {
		return fuwujine;
	}
				
	
	/**
	 * 设置：服务介绍
	 */
	 
	public void setFuwujieshao(String fuwujieshao) {
		this.fuwujieshao = fuwujieshao;
	}
	
	/**
	 * 获取：服务介绍
	 */
	public String getFuwujieshao() {
		return fuwujieshao;
	}
			
}
