import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import fuwuleixingList from '../pages/fuwuleixing/list'
import fuwuleixingDetail from '../pages/fuwuleixing/detail'
import fuwuleixingAdd from '../pages/fuwuleixing/add'
import jiazhengrenyuanList from '../pages/jiazhengrenyuan/list'
import jiazhengrenyuanDetail from '../pages/jiazhengrenyuan/detail'
import jiazhengrenyuanAdd from '../pages/jiazhengrenyuan/add'
import jiazhengfuwuList from '../pages/jiazhengfuwu/list'
import jiazhengfuwuDetail from '../pages/jiazhengfuwu/detail'
import jiazhengfuwuAdd from '../pages/jiazhengfuwu/add'
import jiazhengyuyueList from '../pages/jiazhengyuyue/list'
import jiazhengyuyueDetail from '../pages/jiazhengyuyue/detail'
import jiazhengyuyueAdd from '../pages/jiazhengyuyue/add'
import fuwupingjiaList from '../pages/fuwupingjia/list'
import fuwupingjiaDetail from '../pages/fuwupingjia/detail'
import fuwupingjiaAdd from '../pages/fuwupingjia/add'
import jiazhenghetongList from '../pages/jiazhenghetong/list'
import jiazhenghetongDetail from '../pages/jiazhenghetong/detail'
import jiazhenghetongAdd from '../pages/jiazhenghetong/add'
import hetongqiandingList from '../pages/hetongqianding/list'
import hetongqiandingDetail from '../pages/hetongqianding/detail'
import hetongqiandingAdd from '../pages/hetongqianding/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'fuwuleixing',
					component: fuwuleixingList
				},
				{
					path: 'fuwuleixingDetail',
					component: fuwuleixingDetail
				},
				{
					path: 'fuwuleixingAdd',
					component: fuwuleixingAdd
				},
				{
					path: 'jiazhengrenyuan',
					component: jiazhengrenyuanList
				},
				{
					path: 'jiazhengrenyuanDetail',
					component: jiazhengrenyuanDetail
				},
				{
					path: 'jiazhengrenyuanAdd',
					component: jiazhengrenyuanAdd
				},
				{
					path: 'jiazhengfuwu',
					component: jiazhengfuwuList
				},
				{
					path: 'jiazhengfuwuDetail',
					component: jiazhengfuwuDetail
				},
				{
					path: 'jiazhengfuwuAdd',
					component: jiazhengfuwuAdd
				},
				{
					path: 'jiazhengyuyue',
					component: jiazhengyuyueList
				},
				{
					path: 'jiazhengyuyueDetail',
					component: jiazhengyuyueDetail
				},
				{
					path: 'jiazhengyuyueAdd',
					component: jiazhengyuyueAdd
				},
				{
					path: 'fuwupingjia',
					component: fuwupingjiaList
				},
				{
					path: 'fuwupingjiaDetail',
					component: fuwupingjiaDetail
				},
				{
					path: 'fuwupingjiaAdd',
					component: fuwupingjiaAdd
				},
				{
					path: 'jiazhenghetong',
					component: jiazhenghetongList
				},
				{
					path: 'jiazhenghetongDetail',
					component: jiazhenghetongDetail
				},
				{
					path: 'jiazhenghetongAdd',
					component: jiazhenghetongAdd
				},
				{
					path: 'hetongqianding',
					component: hetongqiandingList
				},
				{
					path: 'hetongqiandingDetail',
					component: hetongqiandingDetail
				},
				{
					path: 'hetongqiandingAdd',
					component: hetongqiandingAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
