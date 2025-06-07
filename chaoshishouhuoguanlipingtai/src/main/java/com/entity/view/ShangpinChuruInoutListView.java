package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShangpinChuruInoutListEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 出入库详情
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shangpin_churu_inout_list")
public class ShangpinChuruInoutListView extends ShangpinChuruInoutListEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

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
	//级联表 出入库
		/**
		* 出入库流水号
		*/

		@ColumnInfo(comment="出入库流水号",type="varchar(200)")
		private String shangpinChuruInoutUuidNumber;
		/**
		* 出入库名称
		*/

		@ColumnInfo(comment="出入库名称",type="varchar(200)")
		private String shangpinChuruInoutName;
		/**
		* 出入库类型
		*/
		@ColumnInfo(comment="出入库类型",type="int(11)")
		private Integer shangpinChuruInoutTypes;
			/**
			* 出入库类型的值
			*/
			@ColumnInfo(comment="出入库类型的字典表值",type="varchar(200)")
			private String shangpinChuruInoutValue;
		/**
		* 备注
		*/

		@ColumnInfo(comment="备注",type="longtext")
		private String shangpinChuruInoutContent;



	public ShangpinChuruInoutListView() {

	}

	public ShangpinChuruInoutListView(ShangpinChuruInoutListEntity shangpinChuruInoutListEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinChuruInoutListEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	//级联表的get和set 出入库

		/**
		* 获取： 出入库流水号
		*/
		public String getShangpinChuruInoutUuidNumber() {
			return shangpinChuruInoutUuidNumber;
		}
		/**
		* 设置： 出入库流水号
		*/
		public void setShangpinChuruInoutUuidNumber(String shangpinChuruInoutUuidNumber) {
			this.shangpinChuruInoutUuidNumber = shangpinChuruInoutUuidNumber;
		}

		/**
		* 获取： 出入库名称
		*/
		public String getShangpinChuruInoutName() {
			return shangpinChuruInoutName;
		}
		/**
		* 设置： 出入库名称
		*/
		public void setShangpinChuruInoutName(String shangpinChuruInoutName) {
			this.shangpinChuruInoutName = shangpinChuruInoutName;
		}
		/**
		* 获取： 出入库类型
		*/
		public Integer getShangpinChuruInoutTypes() {
			return shangpinChuruInoutTypes;
		}
		/**
		* 设置： 出入库类型
		*/
		public void setShangpinChuruInoutTypes(Integer shangpinChuruInoutTypes) {
			this.shangpinChuruInoutTypes = shangpinChuruInoutTypes;
		}


			/**
			* 获取： 出入库类型的值
			*/
			public String getShangpinChuruInoutValue() {
				return shangpinChuruInoutValue;
			}
			/**
			* 设置： 出入库类型的值
			*/
			public void setShangpinChuruInoutValue(String shangpinChuruInoutValue) {
				this.shangpinChuruInoutValue = shangpinChuruInoutValue;
			}

		/**
		* 获取： 备注
		*/
		public String getShangpinChuruInoutContent() {
			return shangpinChuruInoutContent;
		}
		/**
		* 设置： 备注
		*/
		public void setShangpinChuruInoutContent(String shangpinChuruInoutContent) {
			this.shangpinChuruInoutContent = shangpinChuruInoutContent;
		}


	@Override
	public String toString() {
		return "ShangpinChuruInoutListView{" +
			", shangpinChuruInoutUuidNumber=" + shangpinChuruInoutUuidNumber +
			", shangpinChuruInoutName=" + shangpinChuruInoutName +
			", shangpinChuruInoutContent=" + shangpinChuruInoutContent +
			", shangpinName=" + shangpinName +
			", shangpinUuidNumber=" + shangpinUuidNumber +
			", shangpinPhoto=" + shangpinPhoto +
			", shangpinKucunNumber=" + shangpinKucunNumber +
			", shangpinNewMoney=" + shangpinNewMoney +
			", shangpinContent=" + shangpinContent +
			", shangpinDelete=" + shangpinDelete +
			"} " + super.toString();
	}
}
