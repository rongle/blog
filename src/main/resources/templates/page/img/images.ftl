<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>图片总数--CMS后台管理系统</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="css/public.css" media="all" />
</head>
<body class="childrenBody">
<form class="layui-form">
	<blockquote class="layui-elem-quote news_search">
		<div class="layui-inline">
			<input type="checkbox" name="selectAll" id="selectAll" lay-filter="selectAll" lay-skin="primary" title="全选">
		</div>
		<div class="layui-inline">
			<a class="layui-btn layui-btn-sm layui-btn-danger batchDel">批量删除</a>
		</div>
		<div class="layui-inline">
			<a class="layui-btn layui-btn-sm uploadNewImg">上传新图片</a>
		</div>
	</blockquote>
	<ul class="layer-photos-demo" id="Images"></ul>
</form>
<script type="text/javascript" src="layui/layui.js"></script>
<script type="text/javascript" src="page/img/images.js"></script>
</body>
</html>