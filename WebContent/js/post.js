/**
 * post.js
 * @author Chase
 * @date 17/12/2017
 * The purpose of this js is to assemble content in post page. Post page is 
 * designed to display one single post.
 */

/**
 * @rpath Relative path
 * In this case, rpath will be /Blog/posts/{id}
 * 
 * @rootUrl Restful API
 * Restful API 
 */

var rpath = window.location.pathname;
var rootUrl = "http://" + window.location.host + "/Blog/rest/posts/"+rpath.substring(12,rpath.length);
var renderPost = function() {
	$.ajax({
		type : 'GET',
		url : rootUrl,
		dataType : "json",
		success : renderSinglePost
	});
};

var renderSinglePost = function(post) {
	$('#postTitle').append(post.title);
	$('#postTime').append(post.time);
	$('#postContent').append(post.content);
	document.title = post.title + " - Chase's";
}

$(document).ready(function() {	
	renderPost();
	
});