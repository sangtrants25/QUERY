
$(document).ready(function() {
	var select = $("#ListProvincesID");
		
	$.ajax({
        url: "getProvince",
        data: JSON.stringify({"":""}),
        dataType: 'json',
        contentType: 'application/json',
        type: 'POST',
        async: true,
        success: function (res) {
            for (var i = 0; i < res.listProvince.length; i++) {
        	    var el = document.createElement("option");
        	    el.textContent = res.listProvince[i].name;
        	    el.value = res.listProvince[i].ID;
        	    select.append(el);
            }
        }
    });
});

function OnChangedProvinces(value){
	var select = $("#ListDistrictsID");
	select.empty(); /* clear current drop down list */
	var elDefault = document.createElement("option");
	elDefault.textContent = "Select your district";
	elDefault.value = "-1";
    select.append(elDefault);
		
	var Province = {"province": value};
	
	$.ajax({
        url: "getDistrict",
        data: JSON.stringify(Province),
        dataType: 'json',
        contentType: 'application/json',
        type: 'POST',
        async: true,
        success: function (res) {
        	
            for (var i = 0; i < res.listDistricts.length; i++) {
        	    var el = document.createElement("option");
        	    el.textContent = res.listDistricts[i].name;
        	    el.value = res.listDistricts[i].ID;
        	    select.append(el);
            }
        }
    });
}

function OnChangedDistricts(value){
	var select = $("#ListWardID");
	select.empty(); /* clear current drop down list */
	var elDefault = document.createElement("option");
	elDefault.textContent = "Select your district";
	elDefault.value = "-1";
    select.append(elDefault);
    
	var district = {"district": value};
	
	$.ajax({
        url: "getWard",
        data: JSON.stringify(district),
        dataType: 'json',
        contentType: 'application/json',
        type: 'POST',
        async: true,
        success: function (res) {
        	
            for (var i = 0; i < res.listWard.length; i++) {
        	    var el = document.createElement("option");
        	    el.textContent = res.listWard[i].name;
        	    el.value = res.listWard[i].ID;
        	    select.append(el);
            }
        }
    });
}