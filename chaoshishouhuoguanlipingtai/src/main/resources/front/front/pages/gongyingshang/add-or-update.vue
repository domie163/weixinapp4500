<template>
    <view class="content">
        <form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">供应商唯一编号</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                         :disabled="ro.gongyingshangUuidNumber" type="text" v-model="ruleForm.gongyingshangUuidNumber" placeholder="供应商唯一编号"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">供应商名称</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                         :disabled="ro.gongyingshangName" type="text" v-model="ruleForm.gongyingshangName" placeholder="供应商名称"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">联系人姓名</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                         :disabled="ro.lianxirenName" type="text" v-model="ruleForm.lianxirenName" placeholder="联系人姓名"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">联系人手机号</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                         :disabled="ro.lianxirenPhone" type="text" v-model="ruleForm.lianxirenPhone" placeholder="联系人手机号"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">地址</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                         :disabled="ro.lianxirenAddress" type="text" v-model="ruleForm.lianxirenAddress" placeholder="地址"></input>
            </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">供应商类型</view>
                    <picker @change="gongyingshangTypesChange" :value="gongyingshangTypesIndex" :range="gongyingshangTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                                class="uni-input">{{ruleForm.gongyingshangTypes?ruleForm.gongyingshangValue:"请选择供应商类型"}}</view>
                    </picker>
                </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">信用等级</view>
                    <picker @change="gongyingshangXinyongdengjiTypesChange" :value="gongyingshangXinyongdengjiTypesIndex" :range="gongyingshangXinyongdengjiTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                                class="uni-input">{{ruleForm.gongyingshangXinyongdengjiTypes?ruleForm.gongyingshangXinyongdengjiValue:"请选择信用等级"}}</view>
                    </picker>
                </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">供应商详情</view>
                <textarea :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","height":"200rpx"}'
                          :disabled="ro.gongyingshangContent" v-model="ruleForm.gongyingshangContent" placeholder="供应商详情"/>
            </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"var(--publicMainColor)","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
                              ref="createTime" themeColor="#333333"></w-picker>


    </view>
</template>

<script>
    import wPicker from "@/components/w-picker/w-picker.vue";

    export default {
        data() {
            return {
                cross: '',
                ro:{
					gongyingshangUuidNumber: true,
					gongyingshangName: false,
					lianxirenName: false,
					lianxirenPhone: false,
					lianxirenAddress: false,
					gongyingshangTypes: false,
					gongyingshangXinyongdengjiTypes: false,
					gongyingshangContent: false,
					createTime: false,
        },
            ruleForm: {
					gongyingshangUuidNumber: this.getUUID(),//数字
					gongyingshangName: '',
					lianxirenName: '',
					lianxirenPhone: '',
					lianxirenAddress: '',
					gongyingshangTypes: '',//数字
					gongyingshangValue: '',//数字对应的值
					gongyingshangXinyongdengjiTypes: '',//数字
					gongyingshangXinyongdengjiValue: '',//数字对应的值
					gongyingshangContent: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
            gongyingshangTypesOptions: [],
            gongyingshangTypesIndex : 0,
            gongyingshangXinyongdengjiTypesOptions: [],
            gongyingshangXinyongdengjiTypesIndex : 0,

        }
        },
        components: {
            wPicker
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
        async onLoad(options) {
		/*下拉框*/
			let gongyingshangTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'gongyingshang_types',
            }
			let gongyingshangTypes = await this.$api.page(`dictionary`, gongyingshangTypesParams);
			this.gongyingshangTypesOptions = gongyingshangTypes.data.list
		/*下拉框*/
			let gongyingshangXinyongdengjiTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'gongyingshang_xinyongdengji_types',
            }
			let gongyingshangXinyongdengjiTypes = await this.$api.page(`dictionary`, gongyingshangXinyongdengjiTypesParams);
			this.gongyingshangXinyongdengjiTypesOptions = gongyingshangXinyongdengjiTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`gongyingshang`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.gongyingshangId){
                this.ruleForm.gongyingshangId = options.gongyingshangId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            gongyingshangTypesChange(e) {
                this.gongyingshangTypesIndex = e.target.value
                this.ruleForm.gongyingshangValue = this.gongyingshangTypesOptions[this.gongyingshangTypesIndex].indexName
                this.ruleForm.gongyingshangTypes = this.gongyingshangTypesOptions[this.gongyingshangTypesIndex].codeIndex
            },
            gongyingshangXinyongdengjiTypesChange(e) {
                this.gongyingshangXinyongdengjiTypesIndex = e.target.value
                this.ruleForm.gongyingshangXinyongdengjiValue = this.gongyingshangXinyongdengjiTypesOptions[this.gongyingshangXinyongdengjiTypesIndex].indexName
                this.ruleForm.gongyingshangXinyongdengjiTypes = this.gongyingshangXinyongdengjiTypesOptions[this.gongyingshangXinyongdengjiTypesIndex].codeIndex
            },
            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },
			// 日期控件
			createTimeConfirm(val) {
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },

            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.gongyingshangUuidNumber)) {
                    this.$utils.msg(`供应商唯一编号不能为空`);
                    return
                }
				if ((!this.ruleForm.gongyingshangName)) {
                    this.$utils.msg(`供应商名称不能为空`);
                    return
                }
				if ((!this.ruleForm.lianxirenName)) {
                    this.$utils.msg(`联系人姓名不能为空`);
                    return
                }
				if ((!this.ruleForm.lianxirenPhone) && (!this.$validate.isMobile(this.ruleForm.lianxirenPhone))) {
                    this.$utils.msg(`联系人手机号不能为空并且需要输入正确格式`);
                    return
                }
				if ((!this.ruleForm.lianxirenAddress)) {
                    this.$utils.msg(`地址不能为空`);
                    return
                }
				if ((!this.ruleForm.gongyingshangXinyongdengjiTypes)) {
                    this.$utils.msg(`信用等级不能为空`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`gongyingshang`, this.ruleForm);
                } else {
                    await this.$api.save(`gongyingshang`, this.ruleForm);
                }
                uni.setStorageSync('pingluenStateState', true);
                this.$utils.msgBack('提交成功');
            },
            getDate(type) {
                const date = new Date();
                let year = date.getFullYear();
                let month = date.getMonth() + 1;
                let day = date.getDate();
                if (type === 'start') {
                    year = year - 60;
                } else if (type === 'end') {
                    year = year + 2;
                }
                month = month > 9 ? month : '0' + month;;
                day = day > 9 ? day : '0' + day;
                return `${year}-${month}-${day}`;
            },
            toggleTab(str) {
                this.$refs[str].show();
            }
        }
    }
</script>
<style lang="scss" scoped>
    .container {
        padding: 20upx;
    }

    .content:after {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
        content: '';
        background-attachment: fixed;
        background-size: cover;
        background-position: center;
    }

    textarea {
        border: 1upx solid #EEEEEE;
        border-radius: 20upx;
        padding: 20upx;
    }

    .title {
        width: 180upx;
    }

    .avator {
        width: 150upx;
        height: 60upx;
    }

    .right-input {
        flex: 1;
        text-align: left;
        padding: 0 24upx;
    }

    .cu-form-group.active {
        justify-content: space-between;
    }

    .cu-form-group .title {
        height: auto;
        line-height:30rpx
    }

    .btn {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-wrap: wrap;
        padding: 20upx 0;
    }

    .cu-form-group {
        padding: 0 24upx;
        background-color: transparent;
        min-height: inherit;
    }

    .cu-form-group+.cu-form-group {
        border: 0;
    }

    .cu-form-group uni-input {
        padding: 0 30upx;
    }

    .uni-input {
        padding: 0 30upx;
    }

    .cu-form-group uni-textarea {
        padding: 30upx;
        margin: 0;
    }

    .cu-form-group uni-picker::after {
        line-height: 80rpx;
    }

    .select .uni-input {
        line-height: 80rpx;
    }

    .input .right-input {
        line-height: 88rpx;
    }
</style>