
<template>
    <view class="content">
        <form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#6a4826","textAlign":"left"}'
                      class="title">试题名称</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#6a4826","borderRadius":"16rpx","color":"#6a4826","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.examquestionName" type="text" v-model="ruleForm.examquestionName" placeholder="试题名称"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#6a4826","textAlign":"left"}'
                      class="title">选项，json字符串</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#6a4826","borderRadius":"16rpx","color":"#6a4826","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.examquestionOptions" type="text" v-model="ruleForm.examquestionOptions" placeholder="选项，json字符串"></input>
            </view>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#6a4826","textAlign":"left"}'
                          class="title">分值</view>
                    <input   disabled
                             :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#6a4826","borderRadius":"16rpx","color":"#6a4826","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                             :disabled="ro.examquestionScore" type="number" v-model="ruleForm.examquestionScore" placeholder="分值"></input>
                </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#6a4826","textAlign":"left"}'
                      class="title">正确答案</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#6a4826","borderRadius":"16rpx","color":"#6a4826","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.examquestionAnswer" type="text" v-model="ruleForm.examquestionAnswer" placeholder="正确答案"></input>
            </view>
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#6a4826","textAlign":"left"}'
                      class="title">答案解析</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#6a4826","borderRadius":"16rpx","color":"#6a4826","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.examquestionAnalysis" type="text" v-model="ruleForm.examquestionAnalysis" placeholder="答案解析"></input>
            </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#6a4826","textAlign":"left"}'
                          class="title">试题类型</view>
                    <picker @change="examquestionTypesChange" :value="examquestionTypesIndex" :range="examquestionTypesOptions" range-key="indexName">
                        <view
                                :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#6a4826","borderRadius":"16rpx","color":"#6a4826","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.examquestionTypes?ruleForm.examquestionValue:"请选择试题类型"}}</view>
                    </picker>
                </view>
                <view
                        :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                        class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#6a4826","textAlign":"left"}'
                          class="title">试题排序，值越大排越前面</view>
                    <input   disabled
                             :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#6a4826","borderRadius":"16rpx","color":"#6a4826","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                             :disabled="ro.examquestionSequence" type="number" v-model="ruleForm.examquestionSequence" placeholder="试题排序，值越大排越前面"></input>
                </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#6a4826","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
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
					exampaperId: false,
					examquestionName: false,
					examquestionOptions: false,
					examquestionScore: false,
					examquestionAnswer: false,
					examquestionAnalysis: false,
					examquestionTypes: false,
					examquestionSequence: false,
					createTime: false,
        },
            ruleForm: {
					exampaperId: '',
					examquestionName: '',
					examquestionOptions: '',
					examquestionScore: '',
					examquestionAnswer: '',
					examquestionAnalysis: '',
					examquestionTypes: '',//数字
					examquestionValue: '',//数字对应的值
					examquestionSequence: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
				examquestionTypesOptions: [],
							examquestionTypesIndex : 0,

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
			let examquestionTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'examquestion_types',
            }
			let examquestionTypes = await this.$api.page(`dictionary`, examquestionTypesParams);
			this.examquestionTypesOptions = examquestionTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`examquestion`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.examquestionId){
                this.ruleForm.examquestionId = options.examquestionId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            examquestionTypesChange(e) {
                this.examquestionTypesIndex = e.target.value
                this.ruleForm.examquestionValue = this.examquestionTypesOptions[this.examquestionTypesIndex].indexName
                this.ruleForm.examquestionTypes = this.examquestionTypesOptions[this.examquestionTypesIndex].codeIndex
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
                console.log(val)
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },




            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.examquestionName)) {
                    this.$utils.msg(`试题名称不能为空`);
                    return
                }
				if ((!this.ruleForm.examquestionOptions)) {
                    this.$utils.msg(`选项，json字符串不能为空`);
                    return
                }
				if ((!this.ruleForm.examquestionScore) && (!this.$validate.isIntNumer(this.ruleForm.examquestionScore)) && this.ruleForm.examquestionScore >0) {
                    this.$utils.msg(`分值不能为空，不能小于0 格式为数字`);
                    return
                }
				if ((!this.ruleForm.examquestionAnswer)) {
                    this.$utils.msg(`正确答案不能为空`);
                    return
                }
				if ((!this.ruleForm.examquestionAnalysis)) {
                    this.$utils.msg(`答案解析不能为空`);
                    return
                }
				if ((!this.ruleForm.examquestionSequence) && (!this.$validate.isIntNumer(this.ruleForm.examquestionSequence)) && this.ruleForm.examquestionSequence >0) {
                    this.$utils.msg(`试题排序，值越大排越前面不能为空，不能小于0 格式为数字`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`examquestion`, this.ruleForm);
                } else {
                    await this.$api.save(`examquestion`, this.ruleForm);
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
        line-height: 68rpx;
    }

    .select .uni-input {
        line-height: 68rpx;
    }

    .input .right-input {
        line-height: 68rpx;
    }
</style>