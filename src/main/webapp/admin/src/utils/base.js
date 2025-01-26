const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmee587/",
            name: "ssmee587",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmee587/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智能家政保洁预约系统"
        } 
    }
}
export default base
