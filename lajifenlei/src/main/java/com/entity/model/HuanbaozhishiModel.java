package com.entity.model;

import com.entity.HuanbaozhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 环保知识
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuanbaozhishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String huanbaozhishiName;


    /**
     * 封面
     */
    private String huanbaozhishiPhoto;


    /**
     * 内容
     */
    private String huanbaozhishiContent;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 获取：标题
	 */
    public String getHuanbaozhishiName() {
        return huanbaozhishiName;
    }


    /**
	 * 设置：标题
	 */
    public void setHuanbaozhishiName(String huanbaozhishiName) {
        this.huanbaozhishiName = huanbaozhishiName;
    }
    /**
	 * 获取：封面
	 */
    public String getHuanbaozhishiPhoto() {
        return huanbaozhishiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setHuanbaozhishiPhoto(String huanbaozhishiPhoto) {
        this.huanbaozhishiPhoto = huanbaozhishiPhoto;
    }
    /**
	 * 获取：内容
	 */
    public String getHuanbaozhishiContent() {
        return huanbaozhishiContent;
    }


    /**
	 * 设置：内容
	 */
    public void setHuanbaozhishiContent(String huanbaozhishiContent) {
        this.huanbaozhishiContent = huanbaozhishiContent;
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
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
