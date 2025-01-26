import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import jiazhengyuyue from '@/views/modules/jiazhengyuyue/list'
    import jiazhenghetong from '@/views/modules/jiazhenghetong/list'
    import fuwupingjia from '@/views/modules/fuwupingjia/list'
    import fuwuleixing from '@/views/modules/fuwuleixing/list'
    import systemintro from '@/views/modules/systemintro/list'
    import hetongqianding from '@/views/modules/hetongqianding/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussjiazhengfuwu from '@/views/modules/discussjiazhengfuwu/list'
    import jiazhengfuwu from '@/views/modules/jiazhengfuwu/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'
    import jiazhengrenyuan from '@/views/modules/jiazhengrenyuan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '家政资讯',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/jiazhengyuyue',
        name: '家政预约',
        component: jiazhengyuyue
      }
      ,{
	path: '/jiazhenghetong',
        name: '家政合同',
        component: jiazhenghetong
      }
      ,{
	path: '/fuwupingjia',
        name: '服务评价',
        component: fuwupingjia
      }
      ,{
	path: '/fuwuleixing',
        name: '服务类型',
        component: fuwuleixing
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/hetongqianding',
        name: '合同签订',
        component: hetongqianding
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussjiazhengfuwu',
        name: '家政服务评论',
        component: discussjiazhengfuwu
      }
      ,{
	path: '/jiazhengfuwu',
        name: '家政服务',
        component: jiazhengfuwu
      }
      ,{
	path: '/messages',
        name: '系统留言',
        component: messages
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jiazhengrenyuan',
        name: '家政人员',
        component: jiazhengrenyuan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
