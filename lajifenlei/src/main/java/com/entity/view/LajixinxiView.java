package com.entity.view;

import com.entity.LajixinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 垃圾信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("lajixinxi")
public class LajixinxiView extends LajixinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 垃圾类型的值
		*/
		private String lajixinxiValue;



	public LajixinxiView() {

	}

	public LajixinxiView(LajixinxiEntity lajixinxiEntity) {
		try {
			BeanUtils.copyProperties(this, lajixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 垃圾类型的值
			*/
			public String getLajixinxiValue() {
				return lajixinxiValue;
			}
			/**
			* 设置： 垃圾类型的值
			*/
			public void setLajixinxiValue(String lajixinxiValue) {
				this.lajixinxiValue = lajixinxiValue;
			}
















}
