/**
 * user.html
 */

$(window).resize(function () {
	var width = $('#jqGrid_container').width();
    $('#jqGrid').setGridWidth(width);
});

$(document).ready(function () {
	$("#jqGrid").jqGrid({
		url: 'http://localhost:8080/Strut2Maven/json/UserFindAPI',
		mtype: "GET",
		styleUI : 'Bootstrap',
		datatype: "jsonp",
		colNames: ['Id', 'Name', 'Email','Password','CreateDate','ModifiedDate'],
		colModel: [
			{ label: 'UserID', name: 'id', key: true, width: 75,sorttype: 'int' },
			{ label: 'Username', name: 'name', width: 100},
			{ label: 'Email', name: 'email', width: 100 },
			{ label: 'Password', name: 'password', width: 100 },
			{ label: 'CreateDate', name: 'createdDate', width: 70 },
			{ label: 'ModifiedDate', name: 'modifiedDate', width: 70 },
			],
		viewrecords: true,
		height: 750,
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
	
	/*$("#jqGrid").jqGrid({
        url: 'http://trirand.com/blog/phpjqgrid/examples/jsonp/getjsonp.php?callback=?&qwery=longorders',
        mtype: "GET",
		styleUI : 'Bootstrap',
        datatype: "jsonp",
        colModel: [
            { label: 'OrderID', name: 'OrderID', key: true, width: 75 },
            { label: 'Customer ID', name: 'CustomerID', width: 150 },
            { label: 'Order Date', name: 'OrderDate', width: 150 },
            { label: 'Freight', name: 'Freight', width: 150 },
            { label:'Ship Name', name: 'ShipName', width: 150 }
        ],
		viewrecords: true,
        height: 250,
        rowNum: 20,
        pager: "#jqGridPager"
    });*/
});

