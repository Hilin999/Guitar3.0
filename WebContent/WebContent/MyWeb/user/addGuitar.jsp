<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Guitar销售系统</title>
<link href="../css/main.css" rel="stylesheet" type="text/css">
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css">
</head>

<body>
<div id="navbar-main"> 
  <!-- Fixed navbar -->
  <div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        <a class="navbar-brand" href="#home"><i class="fa fa-location-arrow"></i>Guitar3.0销售系统</a> </div>
      <div class="navbar-collapse collapse">
        <ul class="nav navbar-nav navbar-right">
          <li> <a href="searchGuitar.jsp" class="smoothScroll"> 查询</a></li>
          <li> <a href="addGuitar.jsp" class="smoothScroll">添加</a></li>
          <li> <a href="deleteGuitar.jsp" class="smoothScroll"> 删除</a></li>          
        </ul>
      </div>
      <!--/.nav-collapse --> 
    </div>
  </div>
</div><br>
      <div id="headerwrap">
       <hr>
		<div>
		   <form action="../../addGuitar" method="post">
		   
	        <label> <span>编号</span>    
		         <input id="serialNumber" type="text" name="serialNumber" />
			</label><br><br>			
	        <label> <span>制造商</span>    
		         <input id="price" type="text" name="price" />
			</label><br><br>	
	        <label> <span>制造商</span>    
		         <input id="builder" type="text" name="builder" />
			</label><br><br>	
			<label> <span>种&nbsp;&nbsp;&nbsp;类</span>    
		         <input id="type" type="text" name="type" />
			</label><br><br>
			 <label><span>弦&nbsp;&nbsp;&nbsp;数</span>    
		         <input id="numStrings" type="text" name="numStrings" />
			</label><br><br>
			 <label><span>前&nbsp;&nbsp;&nbsp;壳</span>    
		         <input id="topWood" type="text" name="topWood" />
			</label><br><br>
			 <label> <span>后&nbsp;&nbsp;&nbsp;壳</span>    
		         <input id="backWood" type="text" name="backWood" />
			</label><br><br>
			
	      <span>&nbsp;</span>
		       <input id="btnQuery" type="submit" class="btn btn-primary" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp; 	
         </form>		
      </div>
     </div>
</body>
</html>