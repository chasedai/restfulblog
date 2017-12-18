var rootUrl = "http://" + window.location.host + "/Blog/rest/posts";
var allPosts = function() {
	$.ajax({
		type : 'GET',
		url : rootUrl,
		dataType : "json",
		success : renderAllPosts
	});
};

var renderAllPosts = function(aposts) {
	$.each(aposts.postModel, function(index, post) {
		$('#allPosts').append(
				'<a href=posts/' + post.ID + '><h3 id="animation_style">'
						+ post.title + '</h3></a><hr>');

	});
}

$(document).ready(function() {
//	alert(window.location.host);
	allPosts();
});