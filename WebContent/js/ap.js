/**
 * 
 */
// JavaScript Document
var rootUrl = "http://" + window.location.host + "/Blog/rest/posts";
var allPosts = function() {
	$.ajax({
		type : 'GET',
		url : rootUrl,
		dataType : "json",
		success : renderList
	});
};

var renderList = function(data) {
	$.each(data, function(index, post) {

		$('#testforRest4').append(
				"<a href=\"" + post.ID + "\"><h3 id=\"animation_style\">"
						+ post.title + "</h3></a><hr>");

	});

	// $('#myTable').DataTable();

}

$(document).ready(function() {
	// $('#testforRest4').append(window.location.host+"/Blog/rest/posts");
	allPosts();
});