<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Content Header (Page header) -->
<section class="content-header">
	<h1>
		<s:property value="getText('userfind.lable.title')" />
	</h1>
	<ol class="breadcrumb">
		<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
		<li><a href="#">Examples</a></li>
		<li class="active">Blank page</li>
	</ol>
</section>
<!-- Main content -->
<section class="content">
	<div class="row">
		<div class="col-xs-12" id="jqGrid_container">
			<div class="box">
				<div class="box-body">
					<table id="jqGrid" class="table table-bordered table-hover">
					</table>
				</div>
				<div id="jqGridPager"></div> 
				<!-- /.box-body -->
			</div>
			<!-- /.box -->
		</div>
	</div>
</section>
<!-- /.content -->