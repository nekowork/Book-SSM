<template>				
  <div class="menus" v-bind:style="{ height: height + 'px', width: width + 'px' }">
    <div class="menuItem" v-for="menu in menus">
      <router-link :to="menu.link">{{menu.name}}</router-link>
    </div>
  </div>
</template>

<script>
module.exports = {
	props: ['width', 'height'],
	data: function() {
        return {
        	menus: [
        			{ name: '图书类别管理',link:'/bookCategoryList'},
           	        { name: 'foo', link: '/foo'},
        	        { name: 'bar', link: '/bar' },
        	        { name: 'test', link: '/test' }
        	      ]
        }
    }
}
</script>
 
<style>
.menus {

   background-color:rgb(240,240,240);
   float:left;
   margin:0px;
   padding:0px;
   width:100%;
}
.menuItem{
	display:block;
	height:30px;
	padding:5px 10px;
	font-size:14px;
	line-height:30px;
}
</style>