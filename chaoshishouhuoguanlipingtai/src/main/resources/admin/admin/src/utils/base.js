const base = {
    get() {
        return {
            url : "http://localhost:8080/chaoshishouhuoguanlipingtai/",
            name: "chaoshishouhuoguanlipingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/chaoshishouhuoguanlipingtai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "超市售货管理平台"
        } 
    }
}
export default base
