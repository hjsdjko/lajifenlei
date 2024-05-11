package com.entity.view;

import com.entity.HuanbaozhishiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 环保知识
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huanbaozhishi")
public class HuanbaozhishiView extends HuanbaozhishiEntity implements Serializable {
    private static final long serialVersionUID = 1L;




	public HuanbaozhishiView() {

	}

	public HuanbaozhishiView(HuanbaozhishiEntity huanbaozhishiEntity) {
		try {
			BeanUtils.copyProperties(this, huanbaozhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















}
