/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-09-23 05:27:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1726718368000L));
    _jspx_dependants.put("/WEB-INF/views/common/menubar.jsp", Long.valueOf(1727056584000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("   \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>first</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("div.lineA {\r\n");
      out.write("	height: 100px;\r\n");
      out.write("	border: 1px solid gray;\r\n");
      out.write("	float: left;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	left: 120px;\r\n");
      out.write("	margin: 5px;\r\n");
      out.write("	padding: 5px;\r\n");
      out.write("}\r\n");
      out.write("div#banner {\r\n");
      out.write("	width: 500px;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("div#banner img {\r\n");
      out.write("	width: 450px;\r\n");
      out.write("	height: 80px;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("	margin-left: 25px;\r\n");
      out.write("}\r\n");
      out.write("div#loginBox {\r\n");
      out.write("	width: 280px;\r\n");
      out.write("	font-size: 10pt;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("	padding-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("div#loginBox button {\r\n");
      out.write("	width: 250px;\r\n");
      out.write("	height: 35px;\r\n");
      out.write("	background-color: navy;\r\n");
      out.write("	color: white;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("	margin-bottom: 15px;\r\n");
      out.write("	font-size: 14pt;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	cursor: pointer;  /* 손가락모양 : 클릭 가능한 버튼으로 표시함 */\r\n");
      out.write("}\r\n");
      out.write("div#loginBox a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: navy;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function movePage(){\r\n");
      out.write("	//자바스크립트로 페이지 연결 또는 서블릿 컨트롤러 연결 요청시에는\r\n");
      out.write("	//location 객체의 href 속성을 사용함 \r\n");
      out.write("	location.href = \"loginPage.do\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("nav > ul#menubar {\r\n");
      out.write("   list-style: none;\r\n");
      out.write("   position: relative;\r\n");
      out.write("   left: 150px;\r\n");
      out.write("}\r\n");
      out.write("nav > ul#menubar li {\r\n");
      out.write("   float: left;\r\n");
      out.write("   width: 120px;\r\n");
      out.write("   height: 30px;\r\n");
      out.write("   margin-right: 5px;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav > ul#menubar li a {\r\n");
      out.write("   text-decoration: none;\r\n");
      out.write("   width: 120px;\r\n");
      out.write("   height: 30px;\r\n");
      out.write("   display: block;\r\n");
      out.write("   background: orange;\r\n");
      out.write("   color: navy;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("   font-weight: bold;\r\n");
      out.write("   margin: 0;\r\n");
      out.write("   text-shadow: 1px 1px 2px white;\r\n");
      out.write("   padding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("nav > ul#menubar li a:hover{\r\n");
      out.write("   text-decoration: none;\r\n");
      out.write("   width: 120px;\r\n");
      out.write("   height: 30px;\r\n");
      out.write("   display: block;\r\n");
      out.write("   background: navy;\r\n");
      out.write("   color: orange;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("   font-weight: bold;\r\n");
      out.write("   margin: 0;\r\n");
      out.write("   text-shadow: 1px 1px 2px white;\r\n");
      out.write("   padding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("hr{\r\n");
      out.write("   clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("   <nav>\r\n");
      out.write("      <ul id=\"menubar\">\r\n");
      out.write("         <li><a href=\"main.do\">Home</a></li>\r\n");
      out.write("         <li><a href=\"testel.do\">testEL</a></li>\r\n");
      out.write("         <li><a href=\"testcore.do\">JSTL: core</a></li>\r\n");
      out.write("         <li><a href=\"testfmt.do\">JSTL: fmt</a></li>\r\n");
      out.write("         <li><a href=\"testfn.do\">JSTL: functions</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </nav>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<header>\r\n");
      out.write("	<div id=\"banner\" class=\"lineA\">\r\n");
      out.write("		<img src=\"/testjstl/resources/images/photo2.jpg\">\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("		<div id=\"loginBox\" class=\"lineA\">\r\n");
      out.write("			testjstl 사이트 방문을 환영합니다.<br>\r\n");
      out.write("			<button onclick=\"movePage();\">testjstl 로그인</button> <br>\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			<a href=\"enrollPage.do\">회원가입</a>\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<hr style=\"clear:both;\">\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("footer {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	background-color: navy;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write("copyright@test.org &nbsp; 클라우드 AI 대화형 웹에플리케이션 개발자 양성과정<BR>\r\n");
      out.write("서울시 서초구 신논현동 ICT기술협회, TEL : 02-1234-5678, FAX : 02-1234-5679\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
