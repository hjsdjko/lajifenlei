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
 * 环保知识
 *
 * @author 
 * @email
 */
@TableName("huanbaozhishi")
public class HuanbaozhishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuanbaozhishiEntity() {

	}

	public HuanbaozhishiEntity(T t) {
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
        return "Huanbaozhishi{" +
            "id=" + id +
            ", huanbaozhishiName=" + huanbaozhishiName +
            ", huanbaozhishiPhoto=" + huanbaozhishiPhoto +
            ", huanbaozhishiContent=" + huanbaozhishiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
