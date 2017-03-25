/**
 * user.html
 */

$(window).resize(function () {
	var width = $('#jqGrid_container').width();
    $('#jqGrid').setGridWidth(width);
});

$(document).ready(function () {
	$("#jqGrid").jqGrid({
		url: 'http://localhost:8989/api/users',
		mtype: "GET",
		styleUI : 'Bootstrap',
		datatype: "json",
		colNames: ['Inv No', 'Date', 'Amount'],
		colModel: [
			{ label: 'UserID', name: 'id', key: true, width: 75,sorttype: 'int' },
			{ label: 'Username', name: 'username', width: 150},
			{ label: 'Email', name: 'email', width: 150 },
			],
			viewrecords: true,
			/*height: 250,*/
			rowNum: 2,
			pager: "#jqGridPager",
			autowidth: true,  // set 'true' here
			shrinkToFit: true, // well, it's 'true' by default
			loadonce: true,
			loadtext: "Loading...",
			height: 'auto',
			refreshtext:'Refresh',
            emptyrecords: "No records to view",
            /*rowList: [5, 10, 30],*/
	});
});

