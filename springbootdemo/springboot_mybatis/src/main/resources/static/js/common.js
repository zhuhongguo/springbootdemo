//导航选择器
var url = window.location.href;
if (url.indexOf("userManage") > 0
		|| url.indexOf("userEdit") > 0) {
	$("#contentManage").addClass("active");
	$("#userManage").addClass("active");
} else if (url.indexOf("carManage") > 0 || url.indexOf("carEdit") > 0) {
	$("#contentManage").addClass("active");
	$("#carManage").addClass("active");
}

// 提示条配置
/*toastr.options = {
	"closeButton" : true,
	"debug" : false,
	"progressBar" : true,
	"preventDuplicates" : false,
	"positionClass" : "toast-top-right",
	"onclick" : null,
	"showDuration" : "400",
	"hideDuration" : "1000",
	"timeOut" : "7000",
	"extendedTimeOut" : "1000",
	"showEasing" : "swing",
	"hideEasing" : "linear",
	"showMethod" : "fadeIn",
	"hideMethod" : "fadeOut"
}*/