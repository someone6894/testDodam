/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-10-09 18:34:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/lecture/dodamServer/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/dodam/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1630554284453L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>dodam dodam</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<!--   <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script> -->\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!--   <link href=\"https://cdnjs.cloudflare.com/ajax/libs/bxslider/4.2.15/jquery.bxslider.min.css\" rel=\"stylesheet\" /> -->\r\n");
      out.write("<!-- <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bxslider/4.2.15/jquery.bxslider.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<!-- <script type=\"text/javascript\"> $.noConflict(); </script> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("	\r\n");
      out.write("	$(\"#adoptBoard\").click(function(){\r\n");
      out.write("		var listBoard = \"");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("		console.log(listBoard);\r\n");
      out.write("		if(listBoard){\r\n");
      out.write("			$(\"#adoptBoard\").addClass(\"active\");\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("// 	$(\"#main\").click(function(){\r\n");
      out.write("// 		$(\"#adoptBoard\").removeClass(\"active\");\r\n");
      out.write("// 	});\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function Ac(){\r\n");
      out.write("	var listBoard = \"");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("	console.log(listBoard);\r\n");
      out.write("	if(listBoard){\r\n");
      out.write("		$(\"#adoptBoard\").addClass(\"active\");\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function ActiveBar(){\r\n");
      out.write("	let sBtn = $(\".navbar-nav > li\");    //  ul > li 이를 sBtn으로 칭한다. (클릭이벤트는 li에 적용 된다.)\r\n");
      out.write("	sBtn.find(\"a\").click(function(){   // sBtn에 속해 있는  a 찾아 클릭 하면.\r\n");
      out.write("		sBtn.removeClass(\"active\");     // sBtn 속에 (active) 클래스를 삭제 한다.\r\n");
      out.write("		$(this).parent().addClass(\"active\"); // 클릭한 li에 (active)클래스를 넣는다.\r\n");
      out.write("// 		$(this).css('backgroundColor', 'red');\r\n");
      out.write("	});	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("@import url(//fonts.googleapis.com/earlyaccess/nanumpenscript.css);\r\n");
      out.write("\r\n");
      out.write("/* .active{ */\r\n");
      out.write("/* 	background-color: red; */\r\n");
      out.write("/* } */\r\n");
      out.write("\r\n");
      out.write(".banner0 {\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-size: 30px;\r\n");
      out.write("	font-family: 'Nanum Pen Script', cursive;\r\n");
      out.write("	margin-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login {\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".banner {\r\n");
      out.write("	height: 350px;\r\n");
      out.write("	background-color: #3C6E9F;\r\n");
      out.write("	<!-- test2.jpg와 같은 색상 -->\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bannerimg {\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	/*     margin-top : 25px; */\r\n");
      out.write("	position: relative;\r\n");
      out.write("	display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menu {\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	height : 50px;\r\n");
      out.write("	box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.2);\r\n");
      out.write("	\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	display: block;\r\n");
      out.write("	padding-left: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container li:active {\r\n");
      out.write("	background-color: #eee;\r\n");
      out.write("}\r\n");
      out.write(".dropdown {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("	display: none;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	/* 			background-color: #F9F9F9; */\r\n");
      out.write("	/* 			min-width: 160px; */\r\n");
      out.write("	/* 			padding: 8px; */\r\n");
      out.write("	width : 150px;\r\n");
      out.write("	box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("	display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content li {\r\n");
      out.write("	padding : 15px 15px 15px 15px;\r\n");
      out.write("	list-style: none;\r\n");
      out.write("	display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content li:hover {\r\n");
      out.write("	background-color: #eee;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content li a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"banner0\">\r\n");
      out.write("		<span style=\"margin: 0 auto; padding-left:14%;\"> 도담 도담. 아가야 건강하고 행복하게 자라렴 </span>\r\n");
      out.write("\r\n");
      out.write("		<ul class=\"nav navbar-nav navbar-right login\">\r\n");
      out.write("			<li>\r\n");
      out.write("				<a href=\"/member/register\">\r\n");
      out.write("					<span class=\"glyphicon glyphicon-user\"></span> 회원가입</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<a href=\"#\">\r\n");
      out.write("					<span class=\"glyphicon glyphicon-log-in\"></span> 로그인</a>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"banner\" style=\"padding-top: 30px;\">\r\n");
      out.write("		<img id='bannerimg' src='../resources/images/test2.jpg' width=\"auto\" height=\"300px;\"/>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- class = navbar navbar-inverse -->\r\n");
      out.write("	<nav class=\"menu\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<ul class=\"nav navbar-nav\">\r\n");
      out.write("				<li class=\"class=\"dropdown-toggle\" data-toggle=\"dropdown\"><a href=\"/board/listAll\"><img src=\"../resources/images/pet.png\" width=\"30px;\" style=\"padding: 0 6px 3px 0;\"/>찾기,보호,분양</a></li>\r\n");
      out.write("				<li class=\"class=\"dropdown-toggle\" data-toggle=\"dropdown\"><a href=\"/board/listAll\"><img src=\"../resources/images/paw.png\" width=\"30px;\" style=\"padding: 0 6px 3px 0;\"/>TEST</a></li>\r\n");
      out.write("				<li id=\"main\" class=\"active\"><a href=\"/\">\r\n");
      out.write("					<img src=\"../resources/images/paw.png\" width=\"24px;\" style=\"padding: 0 6px 3px 0;\"/>메인</a></li>\r\n");
      out.write("				<li><a href=\"#\"><img src=\"../resources/images/notice.png\" width=\"24px;\" style=\"padding: 0 6px 3px 0;\"/>공지사항</a></li>\r\n");
      out.write("					<!--       <li><a href=\"/board/register\">게시판 만들기</a></li> -->\r\n");
      out.write("				<li id=\"adoptBoard\"><a href=\"/board/listAll?pageNo=1\"><img src=\"../resources/images/pet.png\" width=\"30px;\" style=\"padding: 0 6px 3px 0;\"/>찾기,보호,분양</a></li>\r\n");
      out.write("					<li><a href=\"/board/publicAdoptList\"><img src=\"../resources/images/publicpet.png\" width=\"30px;\" style=\"padding: 0 6px 3px 0;\"/>유기동물 공고</a>\r\n");
      out.write("				<li class=\"dropdown\"><a href=\"#\"><img src=\"../resources/images/perhospital.png\" width=\"30px;\" style=\"padding: 0 6px 3px 0;\"/>동물보호소 찾기</a>\r\n");
      out.write("					<ul class=\"dropdown-content\" style=\"padding-left: 0;\">\r\n");
      out.write("						<li><a href=\"#\">공공기관 찾기</a></li>\r\n");
      out.write("						<li><a href=\"#\">동물병원 찾기</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"dropdown\"><a href=\"#\"><img src=\"../resources/images/paw.png\" width=\"30px;\" style=\"padding: 0 6px 3px 0;\"/>반려동물 축제</a>\r\n");
      out.write("					<ul class=\"dropdown-content\" style=\"padding-left: 0;\">\r\n");
      out.write("						<li><a href=\"#\">반려동물 전시회</a></li>\r\n");
      out.write("						<li><a href=\"#\">반려동물 행사</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li><a href=\"\"><img src=\"../resources/images/paw.png\" width=\"30px;\" style=\"padding: 0 6px 3px 0;\"/>Q&A</a></li>\r\n");
      out.write("				\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<!-- <div class=\"container\"> -->\r\n");
      out.write("\r\n");
      out.write("	<!--   <h1>메인 페이지를 어떻게 꾸밀까요</h1> -->\r\n");
      out.write("	<!--   <p1> 기능구현이 주력이기 때문에 메인 페이지는 간단하고 깔끔해서 비어보이지만 않게끔 로고 블럭버튼 형식으로 꾸밀까요? ex) 건보공단 홈페이지</p1> -->\r\n");
      out.write("\r\n");
      out.write("	<!--   <h3>메인 바디</h3> -->\r\n");
      out.write("	<!--   <p> 부트스트랩 각종 폼 따와서 넣어서 메인바디 꾸미기  -->\r\n");
      out.write("	<!--       ex) 인풋 폼, 리스트 폼, 페이징 넘버 폼 etc -->\r\n");
      out.write("	<!--   </p> -->\r\n");
      out.write("	<!-- </div> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 	<div class=\"bxslider\"> --><!--\r\n");
      out.write(" 		<div> -->\r\n");
      out.write("<!-- 			<img -->\r\n");
      out.write("<!-- 				src=\"https://movie-phinf.pstatic.net/20200721_250/1595306482797hfWqC_JPEG/movie_image.jpg?type=m665_443_2\" -->\r\n");
      out.write("<!-- 				alt=\"슬라이드 이미지1\"> -->\r\n");
      out.write("<!-- 		</div> -->\r\n");
      out.write("<!-- 		<div> -->\r\n");
      out.write("<!-- 			<img -->\r\n");
      out.write("<!-- 				src=\"https://movie-phinf.pstatic.net/20200721_131/1595306483541uxv0I_JPEG/movie_image.jpg?type=m665_443_2\" -->\r\n");
      out.write("<!-- 				alt=\"슬라이드 이미지2\"> -->\r\n");
      out.write("<!-- 		</div> -->\r\n");
      out.write("<!-- 	</div> -->\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/template.jsp(24,19) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listBoard != null }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /WEB-INF/views/template.jsp(38,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listBoard != null }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      _jspx_th_c_005fout_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f1_reused);
    }
    return false;
  }
}
