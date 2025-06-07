<template>
    <view class="content">
        <form class="app-update-pv">
                <!--<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">出入库</view>
                    <picker @change="shangpinChuruInoutChange" :value="shangpinChuruInoutIndex" :range="shangpinChuruInoutOptions" range-key="shangpinChuruInoutName">
                        <view
                                :style='{"padding":"0 30rpx","boxShadow":"0 0 16rpx var(--publicSubColor) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"var(--publicMainColor)","borderRadius":"20rpx","color":"var(--publicMainColor)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.shangpinChuruInoutId?ruleForm.shangpinChuruInoutName:"请选择出入库"}}</view>
                    </picker>
                </view>-->
                <!--<view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">商品</view>
                    <picker @change="shangpinChange" :value="shangpinIndex" :range="shangpinOptions" range-key="shangpinName">
                        <view
                                :style='{"padding":"0 30rpx","boxShadow":"0 0 16rpx var(--publicSubColor) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"var(--publicMainColor)","borderRadius":"20rpx","color":"var(--publicMainColor)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.shangpinId?ruleForm.shangpinName:"请选择商品"}}</view>
                    </picker>
                </view>-->
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"100rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"var(--publicMainColor)","textAlign":"left"}'
                          class="title">操作数量</view>
                    <input   disabled
                             :style='{"padding":"0 24rpx","boxShadow":"0px 0px 0px rgba(0, 0, 0, 0.16)","margin":"0","borderColor":"var(--publicMainColor)","backgroundColor":"#fff","color":"#333","textAlign":"left","borderRadius":"0 180rpx 180rpx 0","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'
                             :disabled="ro.shangpinChuruInoutListNumber" type="number" v-model="ruleForm.shangpinChuruInoutListNumber" placeholder="操作数量"></input>
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
					shangpinChuruInoutId: false,
					shangpinId: false,
					shangpinChuruInoutListNumber: false,
					insertTime: false,
					createTime: false,
        },
            ruleForm: {
					shangpinChuruInoutId: '',
					shangpinId: '',
					shangpinChuruInoutListNumber: '',
					insertTime: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
            shangpinChuruInoutOptions: [],//出入库
            shangpinChuruInoutIndex : 0,//出入库下标
            shangpinOptions: [],//商品
            shangpinIndex : 0,//商品下标

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
            let shangpinChuruInoutParams = {
                page: 1,
                limit: 100,
            }
            let shangpinChuruInoutData = await this.$api.page(`shangpinChuruInout`, shangpinChuruInoutParams);
            this.shangpinChuruInoutOptions = shangpinChuruInoutData.data.list;
            let shangpinParams = {
                page: 1,
                limit: 100,
            }
            let shangpinData = await this.$api.page(`shangpin`, shangpinParams);
            this.shangpinOptions = shangpinData.data.list;


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`shangpinChuruInoutList`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.shangpinChuruInoutListId){
                this.ruleForm.shangpinChuruInoutListId = options.shangpinChuruInoutListId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            shangpinChuruInoutChange(e) {
                this.shangpinChuruInoutIndex = e.target.value
                this.ruleForm.shangpinChuruInoutName = this.shangpinChuruInoutOptions[this.shangpinChuruInoutIndex].shangpinChuruInoutName
                this.ruleForm.shangpinChuruInoutId = this.shangpinChuruInoutOptions[this.shangpinChuruInoutIndex].id
            },
            shangpinChange(e) {
                this.shangpinIndex = e.target.value
                this.ruleForm.shangpinName = this.shangpinOptions[this.shangpinIndex].shangpinName
                this.ruleForm.shangpinId = this.shangpinOptions[this.shangpinIndex].id
            },
            // 下拉变化
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
				if ((!this.ruleForm.shangpinChuruInoutListNumber) && (!this.$validate.isIntNumer(this.ruleForm.shangpinChuruInoutListNumber)) && this.ruleForm.shangpinChuruInoutListNumber >0) {
                    this.$utils.msg(`操作数量不能为空，不能小于0 格式为数字`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`shangpinChuruInoutList`, this.ruleForm);
                } else {
                    await this.$api.save(`shangpinChuruInoutList`, this.ruleForm);
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