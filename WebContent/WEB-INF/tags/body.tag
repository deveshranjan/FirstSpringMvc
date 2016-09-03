<%@attribute name = "par" required="true" rtexprvalue="true"%>
<%@tag body-content="tagdependent" %>
<em>
This is the body of the tag which has parameter ${par} and body
<jsp:doBody></jsp:doBody>
</em>