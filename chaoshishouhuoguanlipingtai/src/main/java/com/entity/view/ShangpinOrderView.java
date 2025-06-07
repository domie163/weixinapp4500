package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShangpinOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 商品订单
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shangpin_order")
public class ShangpinOrderView extends ShangpinOrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 订单类型的值
	*/
	@ColumnInfo(comment="订单类型的字典表值",type="varchar(200)")
	private String shangpinOrderValue;

	//级联表 会员
		/**
		* 会员编号
		*/

		@ColumnInfo(comment="会员编号",type="varchar(200)")
		private String huiyuanUuidNumber;
		/**
		* 会员姓名
		*/

		@ColumnInfo(comment="会员姓名",type="varchar(200)")
		private String huiyuanName;
		/**
		* 会员手机号
		*/

		@ColumnInfo(comment="会员手机号",type="varchar(200)")
		private String huiyuanPhone;
		/**
		* 会员身份证号
		*/

		@ColumnInfo(comment="会员身份证号",type="varchar(200)")
		private String huiyuanIdNumber;
		/**
		* 会员头像
		*/

		@ColumnInfo(comment="会员头像",type="varchar(200)")
		private String huiyuanPhoto;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 会员邮箱
		*/

		@ColumnInfo(comment="会员邮箱",type="varchar(200)")
		private String huiyuanEmail;
	//级联表 商品
							/**
		* 商品名称
		*/

		@ColumnInfo(comment="商品名称",type="varchar(200)")
		private String shangpinName;
		/**
		* 商品编号
		*/

		@ColumnInfo(comment="商品编号",type="varchar(200)")
		private String shangpinUuidNumber;
		/**
		* 商品照片
		*/

		@ColumnInfo(comment="商品照片",type="varchar(200)")
		private String shangpinPhoto;
		/**
		* 商品类型
		*/
		@ColumnInfo(comment="商品类型",type="int(11)")
		private Integer shangpinTypes;
			/**
			* 商品类型的值
			*/
			@ColumnInfo(comment="商品类型的字典表值",type="varchar(200)")
			private String shangpinValue;
		/**
		* 商品库存
		*/

		@ColumnInfo(comment="商品库存",type="int(11)")
		private Integer shangpinKucunNumber;
		/**
		* 现价/积分
		*/
		@ColumnInfo(comment="现价/积分",type="decimal(10,2)")
		private Double shangpinNewMoney;
		/**
		* 商品介绍
		*/

		@ColumnInfo(comment="商品介绍",type="longtext")
		private String shangpinContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer shangpinDelete;
	//级联表 用户
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;

	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer sexTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String sexValue;


	public ShangpinOrderView() {

	}

	public ShangpinOrderView(ShangpinOrderEntity shangpinOrderEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 订单类型的值
	*/
	public String getShangpinOrderValue() {
		return shangpinOrderValue;
	}
	/**
	* 设置： 订单类型的值
	*/
	public void setShangpinOrderValue(String shangpinOrderValue) {
		this.shangpinOrderValue = shangpinOrderValue;
	}


	//级联表的get和set 会员

		/**
		* 获取： 会员编号
		*/
		public String getHuiyuanUuidNumber() {
			return huiyuanUuidNumber;
		}
		/**
		* 设置： 会员编号
		*/
		public void setHuiyuanUuidNumber(String huiyuanUuidNumber) {
			this.huiyuanUuidNumber = huiyuanUuidNumber;
		}

		/**
		* 获取： 会员姓名
		*/
		public String getHuiyuanName() {
			return huiyuanName;
		}
		/**
		* 设置： 会员姓名
		*/
		public void setHuiyuanName(String huiyuanName) {
			this.huiyuanName = huiyuanName;
		}

		/**
		* 获取： 会员手机号
		*/
		public String getHuiyuanPhone() {
			return huiyuanPhone;
		}
		/**
		* 设置： 会员手机号
		*/
		public void setHuiyuanPhone(String huiyuanPhone) {
			this.huiyuanPhone = huiyuanPhone;
		}

		/**
		* 获取： 会员身份证号
		*/
		public String getHuiyuanIdNumber() {
			return huiyuanIdNumber;
		}
		/**
		* 设置： 会员身份证号
		*/
		public void setHuiyuanIdNumber(String huiyuanIdNumber) {
			this.huiyuanIdNumber = huiyuanIdNumber;
		}

		/**
		* 获取： 会员头像
		*/
		public String getHuiyuanPhoto() {
			return huiyuanPhoto;
		}
		/**
		* 设置： 会员头像
		*/
		public void setHuiyuanPhoto(String huiyuanPhoto) {
			this.huiyuanPhoto = huiyuanPhoto;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 会员邮箱
		*/
		public String getHuiyuanEmail() {
			return huiyuanEmail;
		}
		/**
		* 设置： 会员邮箱
		*/
		public void setHuiyuanEmail(String huiyuanEmail) {
			this.huiyuanEmail = huiyuanEmail;
		}
	//级联表的get和set 商品

		/**
		* 获取： 商品名称
		*/
		public String getShangpinName() {
			return shangpinName;
		}
		/**
		* 设置： 商品名称
		*/
		public void setShangpinName(String shangpinName) {
			this.shangpinName = shangpinName;
		}

		/**
		* 获取： 商品编号
		*/
		public String getShangpinUuidNumber() {
			return shangpinUuidNumber;
		}
		/**
		* 设置： 商品编号
		*/
		public void setShangpinUuidNumber(String shangpinUuidNumber) {
			this.shangpinUuidNumber = shangpinUuidNumber;
		}

		/**
		* 获取： 商品照片
		*/
		public String getShangpinPhoto() {
			return shangpinPhoto;
		}
		/**
		* 设置： 商品照片
		*/
		public void setShangpinPhoto(String shangpinPhoto) {
			this.shangpinPhoto = shangpinPhoto;
		}
		/**
		* 获取： 商品类型
		*/
		public Integer getShangpinTypes() {
			return shangpinTypes;
		}
		/**
		* 设置： 商品类型
		*/
		public void setShangpinTypes(Integer shangpinTypes) {
			this.shangpinTypes = shangpinTypes;
		}


			/**
			* 获取： 商品类型的值
			*/
			public String getShangpinValue() {
				return shangpinValue;
			}
			/**
			* 设置： 商品类型的值
			*/
			public void setShangpinValue(String shangpinValue) {
				this.shangpinValue = shangpinValue;
			}

		/**
		* 获取： 商品库存
		*/
		public Integer getShangpinKucunNumber() {
			return shangpinKucunNumber;
		}
		/**
		* 设置： 商品库存
		*/
		public void setShangpinKucunNumber(Integer shangpinKucunNumber) {
			this.shangpinKucunNumber = shangpinKucunNumber;
		}

		/**
		* 获取： 现价/积分
		*/
		public Double getShangpinNewMoney() {
			return shangpinNewMoney;
		}
		/**
		* 设置： 现价/积分
		*/
		public void setShangpinNewMoney(Double shangpinNewMoney) {
			this.shangpinNewMoney = shangpinNewMoney;
		}

		/**
		* 获取： 商品介绍
		*/
		public String getShangpinContent() {
			return shangpinContent;
		}
		/**
		* 设置： 商品介绍
		*/
		public void setShangpinContent(String shangpinContent) {
			this.shangpinContent = shangpinContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getShangpinDelete() {
			return shangpinDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setShangpinDelete(Integer shangpinDelete) {
			this.shangpinDelete = shangpinDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

	//重复字段
			/**
			* 获取： 重复字段 的types
			*/
			public Integer getSexTypes() {
			return sexTypes;
			}
			/**
			* 设置： 重复字段 的types
			*/
			public void setSexTypes(Integer sexTypes) {
			this.sexTypes = sexTypes;
			}
				public String getSexValue() {
				return sexValue;
				}
				public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
				}

	@Override
	public String toString() {
		return "ShangpinOrderView{" +
			", shangpinOrderValue=" + shangpinOrderValue +
			", shangpinName=" + shangpinName +
			", shangpinUuidNumber=" + shangpinUuidNumber +
			", shangpinPhoto=" + shangpinPhoto +
			", shangpinKucunNumber=" + shangpinKucunNumber +
			", shangpinNewMoney=" + shangpinNewMoney +
			", shangpinContent=" + shangpinContent +
			", shangpinDelete=" + shangpinDelete +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", huiyuanUuidNumber=" + huiyuanUuidNumber +
			", huiyuanName=" + huiyuanName +
			", huiyuanPhone=" + huiyuanPhone +
			", huiyuanIdNumber=" + huiyuanIdNumber +
			", huiyuanPhoto=" + huiyuanPhoto +
			", newMoney=" + newMoney +
			", huiyuanEmail=" + huiyuanEmail +
			"} " + super.toString();
	}
}
