<template>
    <div class="col-md-12 headerClass">  	
	  	{{title}}
	</div>
</template>
 
<script>
module.exports = {
    data: function() {
        return {
            title: '青岛科技大学（高密校区）图书信息管理系统'
        }
    }
}
</script>
 
<style>
.headerClass {
    background-color:rgb(65,127,249);
    font-size:16px;
    color:white;
    font-family:Microsoft YaHei;
    font-weight:bold;
    height:50px;
    line-height:50px;
}
</style>