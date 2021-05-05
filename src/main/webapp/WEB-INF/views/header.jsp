
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Husky CMS</a> 
		<a
			class="navbar-brand" href="#"> <img
			src="https://banner2.cleanpng.com/20180611/ibo/kisspng-siberian-husky-clip-art-miniature-siberian-husky-5b1e1e53714466.776728701528700499464.jpg" width="30"
			height="30" alt="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active">
			<a href = "<%= request.getContextPath() %>/" class = "btn btn-light"> Home </a>

				</li>
				</li>
				<li class="nav-item">
				 	<a href = "<%= request.getContextPath() %>/customer/form" class = "btn btn-light"> Add New Customer </a>
				 
				 </li>
				 	<a href = "<%= request.getContextPath() %>/customer/view" class = "btn btn-light"> Customer list </a>
				</li>
				 </li>
				 	<a href = "<%= request.getContextPath() %>/logout" class = "btn btn-light"> logout </a>
				</li>
			</ul>
		</div>
	</nav>
</body>
