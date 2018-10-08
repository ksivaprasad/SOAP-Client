<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEmailServiceImplProxyid" scope="session" class="com.soapservice.service.EmailServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEmailServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleEmailServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleEmailServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.soapservice.service.EmailServiceImpl getEmailServiceImpl10mtemp = sampleEmailServiceImplProxyid.getEmailServiceImpl();
if(getEmailServiceImpl10mtemp == null){
%>
<%=getEmailServiceImpl10mtemp %>
<%
}else{
        if(getEmailServiceImpl10mtemp!= null){
        String tempreturnp11 = getEmailServiceImpl10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String body_2id=  request.getParameter("body20");
            java.lang.String body_2idTemp = null;
        if(!body_2id.equals("")){
         body_2idTemp  = body_2id;
        }
        String subject_3id=  request.getParameter("subject22");
            java.lang.String subject_3idTemp = null;
        if(!subject_3id.equals("")){
         subject_3idTemp  = subject_3id;
        }
        String to_4id=  request.getParameter("to24");
            java.lang.String to_4idTemp = null;
        if(!to_4id.equals("")){
         to_4idTemp  = to_4id;
        }
        %>
        <jsp:useBean id="com1soapservice1bean1Email_1id" scope="session" class="com.soapservice.bean.Email" />
        <%
        com1soapservice1bean1Email_1id.setBody(body_2idTemp);
        com1soapservice1bean1Email_1id.setSubject(subject_3idTemp);
        com1soapservice1bean1Email_1id.setTo(to_4idTemp);
        com.soapservice.bean.EmailStatus sendEmail13mtemp = sampleEmailServiceImplProxyid.sendEmail(com1soapservice1bean1Email_1id);
if(sendEmail13mtemp == null){
%>
<%=sendEmail13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(sendEmail13mtemp != null){
java.lang.String typestatus16 = sendEmail13mtemp.getStatus();
        String tempResultstatus16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus16));
        %>
        <%= tempResultstatus16 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>