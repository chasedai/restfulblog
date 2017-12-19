var rootUrl = "http://" + window.location.host + "/Blog/rest/posts";
var tempPost;
var myDate = new Date();
var year = myDate.getFullYear();
var month = myDate.getMonth() + 1;
var day = myDate.getDate();
var today = year + "-" + month + "-" + day

var deletePost = function() {
	$.ajax({
		type : 'DELETE',
		url : rootUrl + "/" + $('#tobeDeleted').val(),
		headers : {
			'Authorization' : 'Basic ' + btoa('Chase:daiqi123')
		}
	});
};

var renderPost = function() {
	$.ajax({
		type : 'GET',
		url : rootUrl + "/" + $('#tobeDeleted').val(),
		dataType : "json",
		success : renderSinglePost
	});
};

var renderSinglePost = function(post) {
	tempPost = post;
	$('#postTitle').val(post.title);
	$('#editor').html(post.content);
}

var updatePost = function() {
	$.ajax({
		type : 'PUT',
		contentType : 'application/json',
		url : rootUrl + "/" + $('#tobeDeleted').val(),
		dataType : "json",
		data : formToJSON(2),
		headers : {
			'Authorization' : 'Basic ' + btoa('Chase:daiqi123')
		},
		success : function(data, textStatus, jqXHR) {
			alert('Post updated successfully');
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert('update error: ' + textStatus);
		}
	});
}

var newPost = function() {
	$.ajax({
		type : 'POST',
		contentType : 'application/json',
		url : rootUrl,
		dataType : "json",
		data : formToJSON(4),
		headers : {
			'Authorization' : 'Basic ' + btoa('Chase:daiqi123')
		},
		success : function(data, textStatus, jqXHR) {
			alert('Post created successfully');
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert('new post error: ' + textStatus);
		}
	});

};

var formToJSON = function(action) {

	if (action == 2) {
		return JSON.stringify({
			"ID" : tempPost.ID,
			"category" : 1,
			"time" : today,
			"title" : $('#postTitle').val(),
			"content" : $('#editor').html(),
		});
	} else {
		return JSON.stringify({
			"category" : 1,
			"time" : today,
			"title" : $('#postTitle').val(),
			"content" : $('#editor').html(),
		});
	}

};

$(document).ready(function() {

});