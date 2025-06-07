<template>
    <view class="content">
        <form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">出入库流水号</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                         :disabled="ro.shangpinChuruInoutUuidNumber" type="text" v-model="ruleForm.shangpinChuruInoutUuidNumber" placeholder="出入库流水号"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">出入库名称</view>
                <input   disabled
                         :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                         :disabled="ro.shangpinChuruInoutName" type="text" v-model="ruleForm.shangpinChuruInoutName" placeholder="出入库名称"></input>
            </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">出入库类型</view>
                    <picker @change="shangpinChuruInoutTypesChange" :value="shangpinChuruInoutTypesIndex" :range="shangpinChuruInoutTypesOptions" range-key="indexName">
                        <view
                                :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                                class="uni-input">{{ruleForm.shangpinChuruInoutTypes?ruleForm.shangpinChuruInoutValue:"请选择出入库类型"}}</view>
                    </picker>
                </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                      class="title">备注</view>
                <textarea :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","height":"200rpx"}'
                          :disabled="ro.shangpinChuruInoutContent" v-model="ruleForm.shangpinChuruInoutContent" placeholder="备注"/>
            </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"var(--publicMainColor)","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm"
                              ref="insertTime" themeColor="#333333"></w-picker>
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
					shangpinChuruInoutUuidNumber: true,
					shangpinChuruInoutName: false,
					shangpinChuruInoutTypes: false,
					shangpinChuruInoutContent: false,
					insertTime: false,
					createTime: false,
        },
            ruleForm: {
					shangpinChuruInoutUuidNumber: this.getUUID(),//数字
					shangpinChuruInoutName: '',
					shangpinChuruInoutTypes: '',//数字
					shangpinChuruInoutValue: '',//数字对应的值
					shangpinChuruInoutContent: '',
					insertTime: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
            shangpinChuruInoutTypesOptions: [],
            shangpinChuruInoutTypesIndex : 0,

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
			let shangpinChuruInoutTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'shangpin_churu_inout_types',
            }
			let shangpinChuruInoutTypes = await this.$api.page(`dictionary`, shangpinChuruInoutTypesParams);
			this.shangpinChuruInoutTypesOptions = shangpinChuruInoutTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`shangpinChuruInout`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.shangpinChuruInoutId){
                this.ruleForm.shangpinChuruInoutId = options.shangpinChuruInoutId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            shangpinChuruInoutTypesChange(e) {
                this.shangpinChuruInoutTypesIndex = e.target.value
                this.ruleForm.shangpinChuruInoutValue = this.shangpinChuruInoutTypesOptions[this.shangpinChuruInoutTypesIndex].indexName
                this.ruleForm.shangpinChuruInoutTypes = this.shangpinChuruInoutTypesOptions[this.shangpinChuruInoutTypesIndex].codeIndex
            },
            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },
			// 日期控件
			insertTimeConfirm(val) {
                this.ruleForm.insertTime = val.result;
                this.$forceUpdate();
            },
			// 日期控件
			createTimeConfirm(val) {
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },

            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.shangpinChuruInoutUuidNumber)) {
                    this.$utils.msg(`出入库流水号不能为空`);
                    return
                }
				if ((!this.ruleForm.shangpinChuruInoutName)) {
                    this.$utils.msg(`出入库名称不能为空`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`shangpinChuruInout`, this.ruleForm);
                } else {
                    await this.$api.save(`shangpinChuruInout`, this.ruleForm);
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