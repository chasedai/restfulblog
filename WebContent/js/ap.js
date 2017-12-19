var rootUrl = "http://" + window.location.host + "/Blog/rest/posts";
var postList;
var pageCount;
var allPosts = function() {
	$.ajax({
		type : 'GET',
		url : rootUrl,
		dataType : "json",
		success : renderAllPosts
	});
};

var renderAllPosts = function(aposts) {
	postList = aposts;
	pageControl('firstPage');
}

/**
 * pages
 */
var pageControl = function(action) {
	if (action == 2) {
		pageCount--;
	} else if(action ==1){
		pageCount++;
	}else{
		pageCount=1;
	}
	$('#allPosts').html('');
	var postCount = 5 * pageCount;
	var currentPageFirstPost = postCount - 5;
	
	if (pageCount == 1) {
		if(postList.length < 5){
			for (var i = 0; i < tempCount; i++) {
				$('#allPosts').append(
						'<a href=posts/' + postList.postModel[i].ID
								+ '><h3 id="animation_style">'
								+ postList.postModel[i].title + '</h3></a><hr>');
			}

		}else{
			
			for (var i = 0; i < tempCount; i++) {
				$('#allPosts').append(
						'<a href=posts/' + postList.postModel[i].ID
								+ '><h3 id="animation_style">'
								+ postList.postModel[i].title + '</h3></a><hr>');
			}

			$('#allPosts')
					.append(
							'<center><a href="javascript:void(0);" onclick="pageControl(1)">Next</a></center>');
		}
		
	} else if (postList.postModel.length <= postCount) {
		// when this is the last page
		for (var i = currentPageFirstPost; i < postList.postModel.length; i++) {
			$('#allPosts').append(
					'<a href=posts/' + postList.postModel[i].ID
							+ '><h3 id="animation_style">'
							+ postList.postModel[i].title + '</h3></a><hr>');
		}
		$('#allPosts').append('<center><a href="javascript:void(0);" onclick="pageControl(2)">Previous</a></center>');
	}else{
		// when this page is not the last page
		for (var i = currentPageFirstPost; i < postCount; i++) {
			$('#allPosts').append(
					'<a href=posts/' + postList.postModel[i].ID
							+ '><h3 id="animation_style">'
							+ postList.postModel[i].title + '</h3></a><hr>');
		}
		$('#allPosts').append('<center><a href="javascript:void(0);" onclick="pageControl(2)">Previous</a>&copy<a href="javascript:void(0);" onclick="pageControl(1)">Next</a></center>');
	}
}

$(document).ready(function() {
	// alert(window.location.host);
	allPosts();
});







//if (postList.postModel.length >= 5) {
//for (var i = 0; i < 5; i++) {
//	$('#allPosts').append(
//			'<a href=posts/' + postList.postModel[i].ID
//					+ '><h3 id="animation_style">'
//					+ postList.postModel[i].title + '</h3></a><hr>');
//}
//
//$('#allPosts')
//		.append(
//				'<center><a href="javascript:void(0);" onclick="pageControl(1)">Next</a></center>');
//
//} else {
//for (var i = 0; i < postList.postModel.length; i++) {
//	$('#allPosts').append(
//			'<a href=posts/' + postList.postModel[i].ID
//					+ '><h3 id="animation_style">'
//					+ postList.postModel[i].title + '</h3></a><hr>');
//}
//} used to be after postList = aposts 