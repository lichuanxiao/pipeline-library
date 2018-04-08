<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Load Test Results</title>
<style type="text/css">
				body {
					font:normal 68% verdana,arial,helvetica;
					color:#000000;
				}
				table tr td, table tr th {
					font-size: 68%;
				}
				table.details tr th{
				    color: #ffffff;
					font-weight: bold;
					text-align:center;
					background:#2674a6;
					white-space: nowrap;
				}
				table.details tr td{
					background:#eeeee0;
					white-space: nowrap;
				}
				h1 {
					margin: 0px 0px 5px; font: 165% verdana,arial,helvetica
				}
				h2 {
					margin-top: 1em; margin-bottom: 0.5em; font: bold 125% verdana,arial,helvetica
				}
				h3 {
					margin-bottom: 0.5em; font: bold 115% verdana,arial,helvetica
				}
				.Failure {
					font-weight:bold; color:red;
				}
				
	
				img
				{
				  border-width: 0px;
				}
				
				.expand_link
				{
				   position=absolute;
				   right: 0px;
				   width: 27px;
				   top: 1px;
				   height: 27px;
				}
				
				.page_details
				{
				   display: none;
				}
                                
                                .page_details_expanded
                                {
                                    display: block;
                                    display/* hide this definition from  IE5/6 */: table-row;
                                }


			</style>
<script language="JavaScript">
                           function expand(details_id)
			   {
			      
			      document.getElementById(details_id).className = "page_details_expanded";
			   }
			   
			   function collapse(details_id)
			   {
			      
			      document.getElementById(details_id).className = "page_details";
			   }
			   
			   function change(details_id)
			   {
			      if(document.getElementById(details_id+"_image").src.match("expand"))
			      {
			         document.getElementById(details_id+"_image").src = "http://p07pi7g5j.bkt.clouddn.com/collapse.png";
			         expand(details_id);
			      }
			      else
			      {
			         document.getElementById(details_id+"_image").src = "http://p07pi7g5j.bkt.clouddn.com/expand.png";
			         collapse(details_id);
			      } 
                           }
			</script>
</head>
<body>
<h1>Load Test Results</h1>
<table width="100%">
<tr>
<td align="left">Date report: 2018/03/09 11:24</td><td align="right">.</td>
</tr>
</table>
<hr size="1">
<h2>构建情况汇总</h2>
<table width="95%" cellspacing="2" cellpadding="5" border="0" class="details" align="center">
<tr valign="top">
<th># 构建项目数</th><th>失败项目数</th><th>失败率</th><th>构建时间</th>
<tr valign="top" class="Failure">
<td align="center">208</td><td align="center">11</td><td align="center">94.71%</td><td align="center">198 ms</td>
</tr>
</table>
<hr align="center" width="95%" size="1">
<h2>构建失败详情</h2>
<table width="95%" cellspacing="2" cellpadding="5" border="0" class="details" align="center">
<tr valign="top">
<th>项目</th><th># Samples</th>
</tr>

<%for(failed_project in failed_projects){%>
<tr valign="top" class="">
<td>${failed_project}</td><td align="center">13</td>
</tr>
<%}%>
</body>
</html>
