<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Content Header (Page header) -->
<section class="content-header">
	<h1>
		<s:property value="getText('customer.label.title')" />
	</h1>
	<ol class="breadcrumb">
		<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
		<li><a href="#">Examples</a></li>
		<li class="active">Blank page</li>
	</ol>
</section>
<!-- Main content -->
<section class="content">
	<!-- content -->
	<div id="content">
			<div class="col-md-8 ">
				<!-- Horizontal Form -->
				<div class="box box-info">
					<div class="box-header with-border">
						<h3 class="box-title">Horizontal Form</h3>
					</div>
					<!-- /.box-header -->
					<!-- form start -->
					<s:form cssClass="form-horizontal" action="customer"> 
						<div class="box-body">
							<div class="form-group">
								<s:label value="Id" cssClass="col-sm-2 control-label"></s:label>
								<div class="col-sm-10">
									<s:textfield cssClass="form-control" id="customerId"  name="customer.ID" disabled="true"> </s:textfield>
								</div>
							</div>
							<div class="form-group">
								<s:label value="Name" cssClass="col-sm-2 control-label"></s:label>
								<div class="col-sm-10">
									<s:textfield cssClass="form-control" id="customerName"  name="customer.Name"> </s:textfield>
								</div>
							</div>
							<div class="form-group">
								<s:label value="CustomerNo" cssClass="col-sm-2 control-label"></s:label>
								<div class="col-sm-10">
									<s:textfield cssClass="form-control" id="CustomerNo"  name="customer.CustomerNo"> </s:textfield>
								</div>
							</div>
							<%-- <div class="form-group">
								<s:label value="Password" for="inputPassword3" cssClass="col-sm-2 control-label"></s:label>
								<div class="col-sm-10">
									<s:password cssClass="form-control" id="password" name="customer.password"> </s:password>
								</div>
							</div> --%>
							<%-- <div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<div class="checkbox">
										<s:label value="Hoạt động" ><s:checkbox name="checkbox" /> </s:label>
									</div>
								</div>
							</div> --%>
						</div>
						<!-- /.box-body -->
						<div class="box-footer">
							<s:submit type="button" cssClass="btn btn-default" />
							<s:submit type="button" cssClass="btn btn-info pull-right" />
						</div>
						<!-- /.box-footer -->
						<s:hidden name="customer.createdUser"> </s:hidden>
						<s:hidden name="customer.createdDate"> </s:hidden>
						<s:hidden name="customer.modifiedUser"> </s:hidden>
						<s:hidden name="customer.modifiedDate"> </s:hidden>
						<s:hidden name="customer.status"> </s:hidden>
						<s:hidden name="action" value="create"> </s:hidden>
						<s:hidden name="customer.ID" > </s:hidden>
						<s:hidden name="customer.Name" > </s:hidden>
						<s:hidden name="customer.CustomerNo" > </s:hidden>
					</s:form>
				</div>
				<!-- /.box -->
			</div>
		</div>
</section>
<!-- /.content -->