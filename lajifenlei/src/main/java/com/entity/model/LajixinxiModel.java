package com.entity.model;

import com.entity.LajixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 垃圾信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LajixinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 垃圾名称
     */
    private String lajixinxiName;


    /**
     * 垃圾图片
     */
    private String lajixinxiPhoto;


    /**
     * 垃圾类型
     */
    private Integer lajixinxiTypes;


    /**
     * 垃圾介绍
     */
    private String lajixinxiContent;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：垃圾名称
	 */
    public String getLajixinxiName() {
        return lajixinxiName;
    }


    /**
	 * 设置：垃圾名称
	 */
    public void setLajixinxiName(String lajixinxiName) {
        this.lajixinxiName = lajixinxiName;
    }
    /**
	 * 获取：垃圾图片
	 */
    public String getLajixinxiPhoto() {
        return lajixinxiPhoto;
    }


    /**
	 * 设置：垃圾图片
	 */
    public void setLajixinxiPhoto(String lajixinxiPhoto) {
        this.lajixinxiPhoto = lajixinxiPhoto;
    }
    /**
	 * 获取：垃圾类型
	 */
    public Integer getLajixinxiTypes() {
        return lajixinxiTypes;
    }


    /**
	 * 设置：垃圾类型
	 */
    public void setLajixinxiTypes(Integer lajixinxiTypes) {
        this.lajixinxiTypes = lajixinxiTypes;
    }
    /**
	 * 获取：垃圾介绍
	 */
    public String getLajixinxiContent() {
        return lajixinxiContent;
    }


    /**
	 * 设置：垃圾介绍
	 */
    public void setLajixinxiContent(String lajixinxiContent) {
        this.lajixinxiContent = lajixinxiContent;
    }
    /**
	 * 获取：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布日期
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
