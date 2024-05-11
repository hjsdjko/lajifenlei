package com.entity.model;

import com.entity.HuanbaoshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 环保视频
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuanbaoshipinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 视频标题
     */
    private String huanbaoshipinName;


    /**
     * 视频封面
     */
    private String huanbaoshipinPhoto;


    /**
     * 视频
     */
    private String huanbaoshipinVideo;


    /**
     * 视频类型
     */
    private Integer huanbaoshipinTypes;


    /**
     * 视频介绍
     */
    private String huanbaoshipinContent;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：视频标题
	 */
    public String getHuanbaoshipinName() {
        return huanbaoshipinName;
    }


    /**
	 * 设置：视频标题
	 */
    public void setHuanbaoshipinName(String huanbaoshipinName) {
        this.huanbaoshipinName = huanbaoshipinName;
    }
    /**
	 * 获取：视频封面
	 */
    public String getHuanbaoshipinPhoto() {
        return huanbaoshipinPhoto;
    }


    /**
	 * 设置：视频封面
	 */
    public void setHuanbaoshipinPhoto(String huanbaoshipinPhoto) {
        this.huanbaoshipinPhoto = huanbaoshipinPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getHuanbaoshipinVideo() {
        return huanbaoshipinVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setHuanbaoshipinVideo(String huanbaoshipinVideo) {
        this.huanbaoshipinVideo = huanbaoshipinVideo;
    }
    /**
	 * 获取：视频类型
	 */
    public Integer getHuanbaoshipinTypes() {
        return huanbaoshipinTypes;
    }


    /**
	 * 设置：视频类型
	 */
    public void setHuanbaoshipinTypes(Integer huanbaoshipinTypes) {
        this.huanbaoshipinTypes = huanbaoshipinTypes;
    }
    /**
	 * 获取：视频介绍
	 */
    public String getHuanbaoshipinContent() {
        return huanbaoshipinContent;
    }


    /**
	 * 设置：视频介绍
	 */
    public void setHuanbaoshipinContent(String huanbaoshipinContent) {
        this.huanbaoshipinContent = huanbaoshipinContent;
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
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
