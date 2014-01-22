<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/common/include.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<!--
		Charisma v1.0.0

		Copyright 2012 Muhammad Usman
		Licensed under the Apache License v2.0
		http://www.apache.org/licenses/LICENSE-2.0

		http://usman.it
		http://twitter.com/halalit_usman
	-->
	<meta charset="utf-8">
	<title>Free HTML5 Bootstrap Admin Template</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
	<meta name="author" content="Muhammad Usman">

	<!-- The styles -->
	<link id="bs-css" href="${basePath}/css/bootstrap-cerulean.css" rel="stylesheet">
	<style type="text/css">
	  body {
		padding-bottom: 40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link href="${basePath}/css/bootstrap-responsive.css" rel="stylesheet">
	<link href="${basePath}/css/charisma-app.css" rel="stylesheet">
	<link href="${basePath}/css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
	<link href='${basePath}/css/fullcalendar.css' rel='stylesheet'>
	<link href='${basePath}/css/fullcalendar.print.css' rel='stylesheet'  media='print'>
	<link href='${basePath}/css/chosen.css' rel='stylesheet'>
	<link href='${basePath}/css/uniform.default.css' rel='stylesheet'>
	<link href='${basePath}/css/colorbox.css' rel='stylesheet'>
	<link href='${basePath}/css/jquery.cleditor.css' rel='stylesheet'>
	<link href='${basePath}/css/jquery.noty.css' rel='stylesheet'>
	<link href='${basePath}/css/noty_theme_default.css' rel='stylesheet'>
	<link href='${basePath}/css/elfinder.min.css' rel='stylesheet'>
	<link href='${basePath}/css/elfinder.theme.css' rel='stylesheet'>
	<link href='${basePath}/css/jquery.iphone.toggle.css' rel='stylesheet'>
	<link href='${basePath}/css/opa-icons.css' rel='stylesheet'>
	<link href='${basePath}/css/uploadify.css' rel='stylesheet'>

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

	<!-- The fav icon -->
	<link rel="shortcut icon" href="${basePath}/img/favicon.ico">
		
</head>

<body>
		<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<a class="brand" href="index.html"> <img alt="Charisma Logo" src="${basePath}/img/logo20.png" /> <span>微信管理平台</span></a>
				
				<div class="btn-group pull-right" >
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-user"></i><span>服务号</span><span class="divider">|</span><span class="hidden-phone">weidingzhi</span>
						<span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li><a href="#">切换团队</a></li>
						<li><a href="#">账户设置</a></li>
						<li class="divider"></li>
						<li><a href="login.jsp">退出</a></li>
					</ul>
				</div>
				<!-- user dropdown ends -->
				
				<div class="top-nav nav-collapse">
					<ul class="nav">
						<li><a href="#">微信客服</a></li>
						<li><a href="#">客户管理</a></li>
						<li><a href="#">微页面/表单</a></li>
						<li><a href="#">应用插件</a></li>
						<li><a href="#">营销活动</a></li>
					</ul>
				</div><!--/.nav-collapse -->
			</div>
		</div>
	</div>
		<div class="container-fluid">
		<div class="row-fluid">
			<!-- left menu starts -->
			<%@ include file="leftMenu.jsp"%>
			<!-- left menu ends -->
			
			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>
			
			<div id="content" class="span10">
			<!-- content starts -->
			
		
			<div>
				<ul class="breadcrumb">
					<li>
						<a href="#">Home</a> <span class="divider">/</span>
					</li>
					<li>
						<a href="#">UI Features</a>
					</li>
				</ul>
			</div>
			
			<div class="row-fluid sortable">	
				<div class="box span12">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-plus"></i> Extended Elements</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table table-bordered table-striped">
							<tr>
								<td><h3>Multiple File Upload</h3></td>
								<td>
									<input data-no-uniform="true" type="file" name="file_upload" id="file_upload" />
								</td>
								<td></td>
							</tr>
							<tr>
								<td><h3>Star Rating</h3></td>
								<td>
									<div class="raty"></div>
								</td>
								<td><code>&lt;div class="raty"&gt;&lt;/div&gt;</code></td>
							</tr>
							<tr>
								<td><h3>Toggle Switch</h3></td>
								<td>
									<input data-no-uniform="true" checked type="checkbox" class="iphone-toggle">
								</td>
								<td><code>&lt;input data-no-uniform="true" type="checkbox" class="iphone-toggle"&gt;</code></td>
							</tr>
							<tr>
								<td><h3>Auto Growing Textarea</h3></td>
								<td>
									<textarea class="autogrow">Press enter here, it will grow automatically.</textarea>
								</td>
								<td><code>&lt;textarea class="autogrow"&gt;&lt;/textarea&gt;</code></td>
							</tr>
							<tr>
								<td><h3>Popover</h3></td>
								<td>
									<a href="#" class="btn btn-danger" data-rel="popover" data-content="And here's some amazing content. It's very engaging. right?" title="A Title">Hover for popover</a>
								</td>
								<td><code>&lt;a href="#" class="btn btn-danger" data-rel="popover" data-content="And here's some amazing content. It's very engaging. right?" title="A Title"&gt;hover for popover&lt;/a&gt;</code></td>
							</tr>
							<tr>
								<td><h3>Slider</h3></td>
								<td>
									<div class="slider"></div>
								</td>
								<td><code>&lt;div class="slider"&gt;&lt;/div&gt;</code></td>
							</tr>
							<tr>
								<td><h3>Dialog</h3></td>
								<td>
									<a href="#" class="btn btn-info btn-setting">Click for dialog</a>
								</td>
								<td></td>
							</tr>
							<tr>
								<td><h3>Tooltip</h3></td>
								<td>
									<a href="#" title="Tooltip, you can change the position." data-rel="tooltip" class="btn btn-warning">Hover for tooltip</a>
								</td>
								<td><code>&lt;a href="#" title="Tooltip, you can change the position." data-rel="tooltip" class="btn btn-warning"&gt;Hover for tooltip&lt;/a&gt;</code></td>
							</tr>
						</table>
					</div>	
				</div><!--/span-->
				
			</div><!--/row-->

			<div class="row-fluid sortable">
				<div class="box span6">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-tasks"></i> Progress Bars</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<h3>Basic</h3>
						<div class="progress">
							<div class="bar" style="width: 70%;"></div>
						</div>
						<h3>Striped</h3>
						<div class="progress progress-striped">
							<div class="bar" style="width: 30%;"></div>
						</div>
						<h3>Animated</h3>
						<div class="progress progress-striped progress-success active">
							<div class="bar" style="width: 50%;"></div>
						</div>
						<h3>Additional Colors</h3>
						<div class="progress progress-info progress-striped" style="margin-bottom: 9px;">
							<div class="bar" style="width: 20%"></div>
						</div>
						<div class="progress progress-success" style="margin-bottom: 9px;">
							<div class="bar" style="width: 40%"></div>
						</div>
						<div class="progress progress-warning progress-striped active" style="margin-bottom: 9px;">
							<div class="bar" style="width: 60%"></div>
						</div>
						<div class="progress progress-danger progress-striped" style="margin-bottom: 9px;">
							<div class="bar" style="width: 80%"></div>
						</div>
					</div>
				</div><!--/span-->
				
				<div class="box span6">
					<div class="box-header well">
						<h2><i class="icon-eye-open"></i> Labels and Annotations</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table table-bordered table-striped">
							<thead>
							  <tr>
								<th>Labels</th>
								<th>Markup</th>
							  </tr>
							</thead>
							<tbody>
							  <tr>
								<td>
								  <span class="label">Default</span>
								</td>
								<td>
								  <code>&lt;span class="label"&gt;Default&lt;/span&gt;</code>
								</td>
							  </tr>
							  <tr>
								<td>
								  <span class="label label-success">Success</span>
								</td>
								<td>
								  <code>&lt;span class="label label-success"&gt;Success&lt;/span&gt;</code>
								</td>
							  </tr>
							  <tr>
								<td>
								  <span class="label label-warning">Warning</span>
								</td>
								<td>
								  <code>&lt;span class="label label-warning"&gt;Warning&lt;/span&gt;</code>
								</td>
							  </tr>
							  <tr>
								<td>
								  <span class="label label-important">Important</span>
								</td>
								<td>
								  <code>&lt;span class="label label-important"&gt;Important&lt;/span&gt;</code>
								</td>
							  </tr>
							  <tr>
								<td>
								  <span class="label label-info">Info</span>
								</td>
								<td>
								  <code>&lt;span class="label label-info"&gt;Info&lt;/span&gt;</code>
								</td>
							  </tr>
							  <tr>
								<td>
								  <span class="label label-inverse">Inverse</span>
								</td>
								<td>
								  <code>&lt;span class="label label-inverse"&gt;Inverse&lt;/span&gt;</code>
								</td>
							  </tr>
							</tbody>
						  </table>
					</div>
				</div><!--/span-->
				
			</div><!--/row-->
			<div class="row-fluid sortable">
				<div class="box span5">
					<div class="box-header well">
						<h2><i class="icon-bullhorn"></i> Alerts</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content alerts">
						<div class="alert alert-error">
							<button type="button" class="close" data-dismiss="alert">Ã</button>
							<strong>Oh snap!</strong> Change a few things up and try submitting again.
						</div>
						<div class="alert alert-success">
							<button type="button" class="close" data-dismiss="alert">Ã</button>
							<strong>Well done!</strong> You successfully read this important alert message.
						</div>
						<div class="alert alert-info">
							<button type="button" class="close" data-dismiss="alert">Ã</button>
							<strong>Heads up!</strong> This alert needs your attention, but it's not super important.
						</div>
						<div class="alert alert-block ">
							<button type="button" class="close" data-dismiss="alert">Ã</button>
							<h4 class="alert-heading">Warning!</h4>
							<p>Best check yo self, you're not looking too good. Nulla vitae elit libero, a pharetra augue. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</p>
						</div>
					</div>	
				</div><!--/span-->
				
				<div class="box span7">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-bell"></i> Notifications</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<div class="alert alert-info">
							Click buttons below to see Pop Notifications.
						</div>
						<p class="center">
							<button class="btn btn-primary noty" data-noty-options='{"text":"This is a success notification","layout":"topLeft","type":"success"}'><i class="icon-bell icon-white"></i> Top Left</button>
							<button class="btn btn-primary noty" data-noty-options='{"text":"This is an alert notification with fade effect","layout":"topCenter","type":"alert","animateOpen": {"opacity": "show"}}'><i class="icon-bell icon-white"></i> Top Center (fade)</button>
							<button class="btn btn-primary noty" data-noty-options='{"text":"This is an error notification","layout":"topRight","type":"error"}'><i class="icon-bell icon-white"></i> Top Right</button>
							<button class="btn btn-primary noty" data-noty-options='{"text":"This is a success information","layout":"top","type":"information"}'><i class="icon-bell icon-white"></i> Top Full Width</button>
						</p>
						<p class="center">
							<button class="btn btn-primary noty" data-noty-options='{"text":"This is an alert notification with fade effect","layout":"center","type":"alert","animateOpen": {"opacity": "show"}}'><i class="icon-bell icon-white"></i> Center (fade)</button>
							<button class="btn btn-primary noty" data-noty-options='{"text":"This is an error notification","layout":"center","type":"error"}'><i class="icon-bell icon-white"></i> Center</button>
						</p>
						
						<p class="center">
							<button class="btn btn-primary noty" data-noty-options='{"text":"This is an error notification","layout":"bottomLeft","type":"error"}'><i class="icon-bell icon-white"></i> Bottom Left</button>
							<button class="btn btn-primary noty" data-noty-options='{"text":"This is an alert notification with fade effect","layout":"bottomRight","type":"alert","animateOpen": {"opacity": "show"}}'><i class="icon-bell icon-white"></i> Bottom Right (fade)</button>
						</p>

						<p class="center">
							<button class="btn btn-primary noty" data-noty-options='{"text":"This is an alert","layout":"bottom","type":"alert","closeButton":"true"}'><i class="icon-bell icon-white"></i> Bottom Full Width with Close Button</button>
						</p>
					</div>	
				</div><!--/span-->
				
				<div class="box span7">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-refresh"></i> Ajax Loaders</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<ul class="ajax-loaders">
														<li><img src="${basePath}/img/ajax-loaders/ajax-loader-1.gif" title="${basePath}/img/ajax-loaders/ajax-loader-1.gif" ></li>
														<li><img src="${basePath}/img/ajax-loaders/ajax-loader-2.gif" title="${basePath}/img/ajax-loaders/ajax-loader-2.gif" ></li>
														<li><img src="${basePath}/img/ajax-loaders/ajax-loader-3.gif" title="${basePath}/img/ajax-loaders/ajax-loader-3.gif" ></li>
														<li><img src="${basePath}/img/ajax-loaders/ajax-loader-4.gif" title="${basePath}/img/ajax-loaders/ajax-loader-4.gif" ></li>
														<li><img src="${basePath}/img/ajax-loaders/ajax-loader-5.gif" title="${basePath}/img/ajax-loaders/ajax-loader-5.gif" ></li>
														<li><img src="${basePath}/img/ajax-loaders/ajax-loader-6.gif" title="${basePath}/img/ajax-loaders/ajax-loader-6.gif" ></li>
														<li><img src="${basePath}/img/ajax-loaders/ajax-loader-7.gif" title="${basePath}/img/ajax-loaders/ajax-loader-7.gif" ></li>
														<li><img src="${basePath}/img/ajax-loaders/ajax-loader-8.gif" title="${basePath}/img/ajax-loaders/ajax-loader-8.gif" ></li>
												</ul>
						<span class="clearfix">From / More <a href="http://ajaxload.info/" target="_blank">http://ajaxload.info/</a></span>
					</div>	
				</div><!--/span-->
			</div><!--/row-->
			
		
					<!-- content ends -->
			</div><!--/#content.span10-->
				</div><!--/fluid-row-->
				
		<hr>

		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">Ã</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a>
				<a href="#" class="btn btn-primary">Save changes</a>
			</div>
		</div>

		<footer>
			<p class="pull-left">&copy; <a href="http://usman.it" target="_blank">Muhammad Usman</a> 2012</p>
			<p class="pull-right">Powered by: <a href="http://usman.it/free-responsive-admin-template">Charisma</a></p>
		</footer>
		
	</div><!--/.fluid-container-->

	<!-- external javascript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<!-- jQuery -->
	<script src="${basePath}/js/jquery-1.7.2.min.js"></script>
	<!-- jQuery UI -->
	<script src="${basePath}/js/jquery-ui-1.8.21.custom.min.js"></script>
	<!-- transition / effect library -->
	<script src="${basePath}/js/bootstrap-transition.js"></script>
	<!-- alert enhancer library -->
	<script src="${basePath}/js/bootstrap-alert.js"></script>
	<!-- modal / dialog library -->
	<script src="${basePath}/js/bootstrap-modal.js"></script>
	<!-- custom dropdown library -->
	<script src="${basePath}/js/bootstrap-dropdown.js"></script>
	<!-- scrolspy library -->
	<script src="${basePath}/js/bootstrap-scrollspy.js"></script>
	<!-- library for creating tabs -->
	<script src="${basePath}/js/bootstrap-tab.js"></script>
	<!-- library for advanced tooltip -->
	<script src="${basePath}/js/bootstrap-tooltip.js"></script>
	<!-- popover effect library -->
	<script src="${basePath}/js/bootstrap-popover.js"></script>
	<!-- button enhancer library -->
	<script src="${basePath}/js/bootstrap-button.js"></script>
	<!-- accordion library (optional, not used in demo) -->
	<script src="${basePath}/js/bootstrap-collapse.js"></script>
	<!-- carousel slideshow library (optional, not used in demo) -->
	<script src="${basePath}/js/bootstrap-carousel.js"></script>
	<!-- autocomplete library -->
	<script src="${basePath}/js/bootstrap-typeahead.js"></script>
	<!-- tour library -->
	<script src="${basePath}/js/bootstrap-tour.js"></script>
	<!-- library for cookie management -->
	<script src="${basePath}/js/jquery.cookie.js"></script>
	<!-- calander plugin -->
	<script src='${basePath}/js/fullcalendar.min.js'></script>
	<!-- data table plugin -->
	<script src='${basePath}/js/jquery.dataTables.min.js'></script>

	<!-- chart libraries start -->
	<script src="${basePath}/js/excanvas.js"></script>
	<script src="${basePath}/js/jquery.flot.min.js"></script>
	<script src="${basePath}/js/jquery.flot.pie.min.js"></script>
	<script src="${basePath}/js/jquery.flot.stack.js"></script>
	<script src="${basePath}/js/jquery.flot.resize.min.js"></script>
	<!-- chart libraries end -->

	<!-- select or dropdown enhancer -->
	<script src="${basePath}/js/jquery.chosen.min.js"></script>
	<!-- checkbox, radio, and file input styler -->
	<script src="${basePath}/js/jquery.uniform.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="${basePath}/js/jquery.colorbox.min.js"></script>
	<!-- rich text editor library -->
	<script src="${basePath}/js/jquery.cleditor.min.js"></script>
	<!-- notification plugin -->
	<script src="${basePath}/js/jquery.noty.js"></script>
	<!-- file manager library -->
	<script src="${basePath}/js/jquery.elfinder.min.js"></script>
	<!-- star rating plugin -->
	<script src="${basePath}/js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="${basePath}/js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="${basePath}/js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="${basePath}/js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="${basePath}/js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="${basePath}/js/charisma.js"></script>
	
		
</body>
</html>
