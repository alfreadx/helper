$(function(){
	
	$("#btnGo").on("click",function(){
		$("#btnS1").trigger("click");
		$("#btnG1").trigger("click");
	});
	
	$("#btnS1").on("click",function(){
		executeUrl("/helper/base/btnS1");
	});
	
	$("#btnG1").on("click",function(){
		executeUrl("/helper/base/btnG1");
	});
	
});

function executeUrl(url){
	$.ajax({
		url : url,
		type : 'get',
		dataType : 'text',
		success:function(res){
			alert(res);
		},
		error:function(xhr,options,error){
			console.log(xhr.status);
			console.log(error);
		}
		
	});
}