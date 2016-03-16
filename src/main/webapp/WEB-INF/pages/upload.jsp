<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8"/>
		<title>Mini Ajax File Upload Form</title>

		<!-- Google web fonts -->
		<link href="http://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700" rel='stylesheet' />

		<!-- The main CSS file -->
		<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" />
		
	</head>

	<body>
      
		<form id="upload" method="post" action="upload.php" enctype="multipart/form-data">
			
			<div id="drop">
				Drop Here
				<a>Browse</a>
				<input type="file" name="upl" multiple />
			</div>

			<ul>
				<!-- The file uploads will be shown here -->
			</ul>

		</form>
        
		<!-- JavaScript Includes -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<script src="<c:url value="/resources/js/jquery.knob.js"/>"></script>

		<!-- jQuery File Upload Dependencies -->
		<script src="<c:url value="/resources/js/jquery.ui.widget.js"/>"></script>
		<script src="<c:url value="/resources/js/jquery.iframe-transport.js"/>"></script>
		<script src="<c:url value="/resources/js/jquery.fileupload.js"/>"></script>
		
		<!-- Our main JS file -->
		<script src="<c:url value="/resources/js/script.js"/>"></script>

	</body>
</html>