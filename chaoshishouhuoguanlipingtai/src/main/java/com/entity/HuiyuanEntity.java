package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 会员
 *
 * @author 
 * @email
 */
@TableName("huiyuan")
public class HuiyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuiyuanEntity() {

	}

	public HuiyuanEntity(T t) {
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
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 会员编号
     */
    @ColumnInfo(comment="会员编号",type="varchar(200)")
    @TableField(value = "huiyuan_uuid_number")

    private String huiyuanUuidNumber;


    /**
     * 会员姓名
     */
    @ColumnInfo(comment="会员姓名",type="varchar(200)")
    @TableField(value = "huiyuan_name")

    private String huiyuanName;


    /**
     * 会员手机号
     */
    @ColumnInfo(comment="会员手机号",type="varchar(200)")
    @TableField(value = "huiyuan_phone")

    private String huiyuanPhone;


    /**
     * 会员身份证号
     */
    @ColumnInfo(comment="会员身份证号",type="varchar(200)")
    @TableField(value = "huiyuan_id_number")

    private String huiyuanIdNumber;


    /**
     * 会员头像
     */
    @ColumnInfo(comment="会员头像",type="varchar(200)")
    @TableField(value = "huiyuan_photo")

    private String huiyuanPhoto;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 余额
     */
    @ColumnInfo(comment="余额",type="decimal(10,2)")
    @TableField(value = "new_money")

    private Double newMoney;


    /**
     * 会员邮箱
     */
    @ColumnInfo(comment="会员邮箱",type="varchar(200)")
    @TableField(value = "huiyuan_email")

    private String huiyuanEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：会员编号
	 */
    public String getHuiyuanUuidNumber() {
        return huiyuanUuidNumber;
    }
    /**
	 * 设置：会员编号
	 */

    public void setHuiyuanUuidNumber(String huiyuanUuidNumber) {
        this.huiyuanUuidNumber = huiyuanUuidNumber;
    }
    /**
	 * 获取：会员姓名
	 */
    public String getHuiyuanName() {
        return huiyuanName;
    }
    /**
	 * 设置：会员姓名
	 */

    public void setHuiyuanName(String huiyuanName) {
        this.huiyuanName = huiyuanName;
    }
    /**
	 * 获取：会员手机号
	 */
    public String getHuiyuanPhone() {
        return huiyuanPhone;
    }
    /**
	 * 设置：会员手机号
	 */

    public void setHuiyuanPhone(String huiyuanPhone) {
        this.huiyuanPhone = huiyuanPhone;
    }
    /**
	 * 获取：会员身份证号
	 */
    public String getHuiyuanIdNumber() {
        return huiyuanIdNumber;
    }
    /**
	 * 设置：会员身份证号
	 */

    public void setHuiyuanIdNumber(String huiyuanIdNumber) {
        this.huiyuanIdNumber = huiyuanIdNumber;
    }
    /**
	 * 获取：会员头像
	 */
    public String getHuiyuanPhoto() {
        return huiyuanPhoto;
    }
    /**
	 * 设置：会员头像
	 */

    public void setHuiyuanPhoto(String huiyuanPhoto) {
        this.huiyuanPhoto = huiyuanPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：余额
	 */
    public Double getNewMoney() {
        return newMoney;
    }
    /**
	 * 设置：余额
	 */

    public void setNewMoney(Double newMoney) {
        this.newMoney = newMoney;
    }
    /**
	 * 获取：会员邮箱
	 */
    public String getHuiyuanEmail() {
        return huiyuanEmail;
    }
    /**
	 * 设置：会员邮箱
	 */

    public void setHuiyuanEmail(String huiyuanEmail) {
        this.huiyuanEmail = huiyuanEmail;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Huiyuan{" +
            ", id=" + id +
            ", huiyuanUuidNumber=" + huiyuanUuidNumber +
            ", huiyuanName=" + huiyuanName +
            ", huiyuanPhone=" + huiyuanPhone +
            ", huiyuanIdNumber=" + huiyuanIdNumber +
            ", huiyuanPhoto=" + huiyuanPhoto +
            ", sexTypes=" + sexTypes +
            ", newMoney=" + newMoney +
            ", huiyuanEmail=" + huiyuanEmail +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
