<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<tiles:useAttribute name="component" />

<div id="${component['path']}_layoutComponents">
	
	<table class="gridLayoutTable" cellpadding="0" cellspacing="0">
		<c:forEach items="${component['cells']}" var="row">
			<tr>
				<c:forEach items="${row}" var="cell">
					<c:if test="${cell.available || cell.component != null}">
					
						<c:set var="borderClass" value=""/>
						<c:if test="${cell.rightBorder}">
							<c:set var="borderClass" value="rightBorder"/>
						</c:if>
					
						<td rowspan="${cell.rowspan}" colspan="${cell.colspan}" class="${borderClass}">
						
							<c:if test="${cell.component != null}">
								<tiles:insertTemplate template="../../component.jsp">
									<tiles:putAttribute name="component" value="${component.children[cell.component.name]}" />
								</tiles:insertTemplate>
							</c:if>
							
						</td>
					</c:if>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
</div>