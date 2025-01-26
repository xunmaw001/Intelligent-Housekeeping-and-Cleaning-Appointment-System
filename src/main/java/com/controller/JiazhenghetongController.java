package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiazhenghetongEntity;
import com.entity.view.JiazhenghetongView;

import com.service.JiazhenghetongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 家政合同
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-08 11:11:01
 */
@RestController
@RequestMapping("/jiazhenghetong")
public class JiazhenghetongController {
    @Autowired
    private JiazhenghetongService jiazhenghetongService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiazhenghetongEntity jiazhenghetong, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiazhengrenyuan")) {
			jiazhenghetong.setJiazhengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			jiazhenghetong.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiazhenghetongEntity> ew = new EntityWrapper<JiazhenghetongEntity>();


		PageUtils page = jiazhenghetongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiazhenghetong), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiazhenghetongEntity jiazhenghetong, 
		HttpServletRequest request){
        EntityWrapper<JiazhenghetongEntity> ew = new EntityWrapper<JiazhenghetongEntity>();

		PageUtils page = jiazhenghetongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiazhenghetong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiazhenghetongEntity jiazhenghetong){
       	EntityWrapper<JiazhenghetongEntity> ew = new EntityWrapper<JiazhenghetongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiazhenghetong, "jiazhenghetong")); 
        return R.ok().put("data", jiazhenghetongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiazhenghetongEntity jiazhenghetong){
        EntityWrapper< JiazhenghetongEntity> ew = new EntityWrapper< JiazhenghetongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiazhenghetong, "jiazhenghetong")); 
		JiazhenghetongView jiazhenghetongView =  jiazhenghetongService.selectView(ew);
		return R.ok("查询家政合同成功").put("data", jiazhenghetongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiazhenghetongEntity jiazhenghetong = jiazhenghetongService.selectById(id);
        return R.ok().put("data", jiazhenghetong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiazhenghetongEntity jiazhenghetong = jiazhenghetongService.selectById(id);
        return R.ok().put("data", jiazhenghetong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiazhenghetongEntity jiazhenghetong, HttpServletRequest request){
    	jiazhenghetong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiazhenghetong);

        jiazhenghetongService.insert(jiazhenghetong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiazhenghetongEntity jiazhenghetong, HttpServletRequest request){
    	jiazhenghetong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiazhenghetong);

        jiazhenghetongService.insert(jiazhenghetong);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiazhenghetongEntity jiazhenghetong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiazhenghetong);
        jiazhenghetongService.updateById(jiazhenghetong);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiazhenghetongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JiazhenghetongEntity> wrapper = new EntityWrapper<JiazhenghetongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiazhengrenyuan")) {
			wrapper.eq("jiazhengzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jiazhenghetongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
