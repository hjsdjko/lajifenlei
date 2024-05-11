package com.entity.vo;

import com.entity.HuanbaozhishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 环保知识
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huanbaozhishi")
public class HuanbaozhishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "huanbaozhishi_name")
    private String huanbaozhishiName;


    /**
     * 封面
     */

    @TableField(value = "huanbaozhishi_photo")
    private String huanbaozhishiPhoto;


    /**
     * 内容
     */

    @TableField(value = "huanbaozhishi_content")
    private String huanbaozhishiContent;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：标题
	 */
    public String getHuanbaozhishiName() {
        return huanbaozhishiName;
    }


    /**
	 * 获取：标题
	 */

    public void setHuanbaozhishiName(String huanbaozhishiName) {
        this.huanbaozhishiName = huanbaozhishiName;
    }
    /**
	 * 设置：封面
	 */
    public String getHuanbaozhishiPhoto() {
        return huanbaozhishiPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setHuanbaozhishiPhoto(String huanbaozhishiPhoto) {
        this.huanbaozhishiPhoto = huanbaozhishiPhoto;
    }
    /**
	 * 设置：内容
	 */
    public String getHuanbaozhishiContent() {
        return huanbaozhishiContent;
    }


    /**
	 * 获取：内容
	 */

    public void setHuanbaozhishiContent(String huanbaozhishiContent) {
        this.huanbaozhishiContent = huanbaozhishiContent;
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
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
