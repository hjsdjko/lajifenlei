package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 垃圾信息
 *
 * @author 
 * @email
 */
@TableName("lajixinxi")
public class LajixinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LajixinxiEntity() {

	}

	public LajixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 垃圾名称
     */
    @TableField(value = "lajixinxi_name")

    private String lajixinxiName;


    /**
     * 垃圾图片
     */
    @TableField(value = "lajixinxi_photo")

    private String lajixinxiPhoto;


    /**
     * 垃圾类型
     */
    @TableField(value = "lajixinxi_types")

    private Integer lajixinxiTypes;


    /**
     * 垃圾介绍
     */
    @TableField(value = "lajixinxi_content")

    private String lajixinxiContent;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：垃圾名称
	 */
    public String getLajixinxiName() {
        return lajixinxiName;
    }
    /**
	 * 获取：垃圾名称
	 */

    public void setLajixinxiName(String lajixinxiName) {
        this.lajixinxiName = lajixinxiName;
    }
    /**
	 * 设置：垃圾图片
	 */
    public String getLajixinxiPhoto() {
        return lajixinxiPhoto;
    }
    /**
	 * 获取：垃圾图片
	 */

    public void setLajixinxiPhoto(String lajixinxiPhoto) {
        this.lajixinxiPhoto = lajixinxiPhoto;
    }
    /**
	 * 设置：垃圾类型
	 */
    public Integer getLajixinxiTypes() {
        return lajixinxiTypes;
    }
    /**
	 * 获取：垃圾类型
	 */

    public void setLajixinxiTypes(Integer lajixinxiTypes) {
        this.lajixinxiTypes = lajixinxiTypes;
    }
    /**
	 * 设置：垃圾介绍
	 */
    public String getLajixinxiContent() {
        return lajixinxiContent;
    }
    /**
	 * 获取：垃圾介绍
	 */

    public void setLajixinxiContent(String lajixinxiContent) {
        this.lajixinxiContent = lajixinxiContent;
    }
    /**
	 * 设置：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：发布日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Lajixinxi{" +
            "id=" + id +
            ", lajixinxiName=" + lajixinxiName +
            ", lajixinxiPhoto=" + lajixinxiPhoto +
            ", lajixinxiTypes=" + lajixinxiTypes +
            ", lajixinxiContent=" + lajixinxiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
