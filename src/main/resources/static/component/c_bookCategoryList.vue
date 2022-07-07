<template>
<div style="padding:10px;">
	<h4>图书类别管理</h4>
	<table class="table table-bordered">
	  <thead>
	    	<tr>
	      		<th>名称</th>
	      		<th>序号</th>
	      		<th>操作</th>
	    	</tr>
	  </thead>
	  <tbody>
	    	<tr v-for="d in datas">
	      		<td>{{d.name}}</td>
				<td>{{d.index}}</td>
				<td></td>
	    	</tr>
	  	</tbody>
	</table>
	
	<ul class="pagination" style="margin-top:0px;">
	    <li><a href="#">&laquo;</a></li>
	    <li><a href="#">1</a></li>
	    <li><a href="#">2</a></li>
	    <li><a href="#">3</a></li>
	    <li><a href="#">4</a></li>
	    <li><a href="#">5</a></li>
	    <li><a href="#">&raquo;</a></li>
	</ul>
</div>
</template>





<script>
module.exports = {
	data:function(){
		return {
			datas : '',

		}
	},
	mounted:function(){
		this.listData();
	},
	methods:{
		listData:function(){
		
			  var target = this;
			  axios.get('/bac/bookCategory/selectAll')
			  .then(function (response) {
			      
			      target.datas = response.data.result.data;
			     
			     
			  })
			  .catch(function (error) {
			    console.log(error);
			  });
		}
	}
}
</script>

<style>

</style>

