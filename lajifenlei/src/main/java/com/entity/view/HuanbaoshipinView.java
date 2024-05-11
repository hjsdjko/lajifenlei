package com.entity.view;

import com.entity.HuanbaoshipinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 环保视频
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huanbaoshipin")
public class HuanbaoshipinView extends HuanbaoshipinEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 视频类型的值
		*/
		private String huanbaoshipinValue;



	public HuanbaoshipinView() {

	}

	public HuanbaoshipinView(HuanbaoshipinEntity huanbaoshipinEntity) {
		try {
			BeanUtils.copyProperties(this, huanbaoshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 视频类型的值
			*/
			public String getHuanbaoshipinValue() {
				return huanbaoshipinValue;
			}
			/**
			* 设置： 视频类型的值
			*/
			public void setHuanbaoshipinValue(String huanbaoshipinValue) {
				this.huanbaoshipinValue = huanbaoshipinValue;
			}
















}
