import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import Friends from '../views/FriendsView.vue'
import FriendDetails from '../views/FriendDetailsShow.vue'
import MyTest from '../views/MyTest.vue'
import MyTest2 from '../views/MyTest2.vue'

const routes = [
  {
    path:'/test',
    name:'test',
    component: MyTest
  },
  {
    path:'/test/:id',
    name:'test2',
    component: MyTest2
  },
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path:'/friends',
    name:'friends',
    component: Friends
  },
  {
    path:'/friends/:id',
    name: 'FriendDetails',
    component: FriendDetails,
    props:true
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
