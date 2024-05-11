package com.entity.vo;

import com.entity.HuanbaoshipinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 环保视频
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huanbaoshipin")
public class HuanbaoshipinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
