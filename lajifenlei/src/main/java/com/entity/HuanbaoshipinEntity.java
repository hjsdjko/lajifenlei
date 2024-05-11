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
 * 环保视频
 *
 * @author 
 * @email
 */
@TableName("huanbaoshipin")
public class HuanbaoshipinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuanbaoshipinEntity() {

	}

	public HuanbaoshipinEntity(T t) {
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
     * 视频标题
     */
    @TableField(value = "huanbaoshipin_name")

    private String huanbaoshipinName;


    /**
     * 视频封面
     */
    @TableField(value = "huanbaoshipin_photo")

    private String huanbaoshipinPhoto;


    /**
     * 视频
     */
    @TableField(value = "huanbaoshipin_video")

    private String huanbaoshipinVideo;


    /**
     * 视频类型
     */
    @TableField(value = "huanbaoshipin_types")

    private Integer huanbaoshipinTypes;


    /**
     * 视频介绍
     */
    @TableField(value = "huanbaoshipin_content")

    private String huanbaoshipinContent;


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
	 * 设置：视频标题
	 */
    public String getHuanbaoshipinName() {
        return huanbaoshipinName;
    }
    /**
	 * 获取：视频标题
	 */

    public void setHuanbaoshipinName(String huanbaoshipinName) {
        this.huanbaoshipinName = huanbaoshipinName;
    }
    /**
	 * 设置：视频封面
	 */
    public String getHuanbaoshipinPhoto() {
        return huanbaoshipinPhoto;
    }
    /**
	 * 获取：视频封面
	 */

    public void setHuanbaoshipinPhoto(String huanbaoshipinPhoto) {
        this.huanbaoshipinPhoto = huanbaoshipinPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getHuanbaoshipinVideo() {
        return huanbaoshipinVideo;
    }
    /**
	 * 获取：视频
	 */

    public void setHuanbaoshipinVideo(String huanbaoshipinVideo) {
        this.huanbaoshipinVideo = huanbaoshipinVideo;
    }
    /**
	 * 设置：视频类型
	 */
    public Integer getHuanbaoshipinTypes() {
        return huanbaoshipinTypes;
    }
    /**
	 * 获取：视频类型
	 */

    public void setHuanbaoshipinTypes(Integer huanbaoshipinTypes) {
        this.huanbaoshipinTypes = huanbaoshipinTypes;
    }
    /**
	 * 设置：视频介绍
	 */
    public String getHuanbaoshipinContent() {
        return huanbaoshipinContent;
    }
    /**
	 * 获取：视频介绍
	 */

    public void setHuanbaoshipinContent(String huanbaoshipinContent) {
        this.huanbaoshipinContent = huanbaoshipinContent;
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
        return "Huanbaoshipin{" +
            "id=" + id +
            ", huanbaoshipinName=" + huanbaoshipinName +
            ", huanbaoshipinPhoto=" + huanbaoshipinPhoto +
            ", huanbaoshipinVideo=" + huanbaoshipinVideo +
            ", huanbaoshipinTypes=" + huanbaoshipinTypes +
            ", huanbaoshipinContent=" + huanbaoshipinContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
