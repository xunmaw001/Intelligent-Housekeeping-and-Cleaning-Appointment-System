export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"服务类型","menuJump":"列表","tableName":"fuwuleixing"}],"menu":"服务类型管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除"],"menu":"家政人员","menuJump":"列表","tableName":"jiazhengrenyuan"}],"menu":"家政人员管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除","查看评论"],"menu":"家政服务","menuJump":"列表","tableName":"jiazhengfuwu"}],"menu":"家政服务管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除","发送合同","审核"],"menu":"家政预约","menuJump":"列表","tableName":"jiazhengyuyue"}],"menu":"家政预约管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","修改","删除"],"menu":"服务评价","menuJump":"列表","tableName":"fuwupingjia"}],"menu":"服务评价管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","修改","删除"],"menu":"家政合同","menuJump":"列表","tableName":"jiazhenghetong"}],"menu":"家政合同管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除"],"menu":"合同签订","menuJump":"列表","tableName":"hetongqianding"}],"menu":"合同签订管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","回复","删除"],"menu":"系统留言","tableName":"messages"}],"menu":"系统留言"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"家政资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","预约"],"menu":"家政服务列表","menuJump":"列表","tableName":"jiazhengfuwu"}],"menu":"家政服务模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["删除","支付","查看","服务评价"],"menu":"家政预约","menuJump":"列表","tableName":"jiazhengyuyue"}],"menu":"家政预约管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"服务评价","menuJump":"列表","tableName":"fuwupingjia"}],"menu":"服务评价管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","合同签订"],"menu":"家政合同","menuJump":"列表","tableName":"jiazhenghetong"}],"menu":"家政合同管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"合同签订","menuJump":"列表","tableName":"hetongqianding"}],"menu":"合同签订管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","预约"],"menu":"家政服务列表","menuJump":"列表","tableName":"jiazhengfuwu"}],"menu":"家政服务模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除","查看评论"],"menu":"家政服务","menuJump":"列表","tableName":"jiazhengfuwu"}],"menu":"家政服务管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","删除"],"menu":"家政预约","menuJump":"列表","tableName":"jiazhengyuyue"}],"menu":"家政预约管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看"],"menu":"服务评价","menuJump":"列表","tableName":"fuwupingjia"}],"menu":"服务评价管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"合同签订","menuJump":"列表","tableName":"hetongqianding"}],"menu":"合同签订管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","预约"],"menu":"家政服务列表","menuJump":"列表","tableName":"jiazhengfuwu"}],"menu":"家政服务模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"家政人员","tableName":"jiazhengrenyuan"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}