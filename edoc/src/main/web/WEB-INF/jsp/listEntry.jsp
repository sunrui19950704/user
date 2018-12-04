<%--
  Created by IntelliJ IDEA.
  User: Mr.Sr
  Date: 2018/11/29
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
      href="${pageContext.request.contextPath}/statics/css/editTablestyles.css">
<script type="text/javascript"
        src="${pageContext.request.contextPath }/statics/js/jquery-1.12.4.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath }/statics/js/listTable.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/entry/queryAll">
    <table>
        <tr>
            <th>查询</th>
            <td>
                <select name="cid" >
                    <option value="0">--请选择--</option>
                    <c:forEach items="${cat}" var="cat">
                    <option value="${cat.cid}">${cat.cname}</option>
                    </c:forEach>
                </select>
            </td>
            <td>
                <input type="submit" value="提交"/>
            </td>
        </tr>

    </table>
</form>


<table id="ajaxtable" align="center">
    <tr>

        <td>文档编号</td>
        <td>文档名称</td>
        <td>文档摘要</td>
        <td>上传人</td>
        <td>上传日期</td>
        <td>操作</td>

    </tr>

    <c:forEach items="${pageInfo.list}" var="entry">
    <tr>

        <td>${entry.eid}</td>
        <td>${entry.title}</td>
        <td>${entry.summary}</td>
        <td>${entry.uploaduser}</td>
        <td>${entry.data}</td>
        <td>
            <a href="/entry/deleteEntryById?eid=${entry.eid}" onclick="return confirm('确认删除?');">删除</a>
        </td>

    </tr>
    </c:forEach>
</table>
<div align="center">
    共：${pageInfo.total}条记录[${pageInfo.pageNum}/${pageInfo.pages}]
    <c:if test="${pageInfo.isFirstPage}">
        <a>首页</a>
        <a>上一页</a>
    </c:if>
    <c:if test="${pageInfo.isFirstPage==false}">
        <a href="${pageContext.request.contextPath}/entry/queryAll?pageNo=1">首页</a>
        <a href="${pageContext.request.contextPath}/entry/queryAll?pageNo=${pageInfo.prePage}">上一页</a>
    </c:if>
    <c:if test="${pageInfo.isLastPage}">
        <a>下一页</a>
        <a>末页</a>
    </c:if>
    <c:if test="${pageInfo.isLastPage==false}">
        <a href="${pageContext.request.contextPath}/entry/queryAll?pageNo=${pageInfo.nextPage}">下一页</a>
        <a href="${pageContext.request.contextPath}/entry/queryAll?pageNo=${pageInfo.pages}">末页</a>
    </c:if>
</div>





</body>
</html>
