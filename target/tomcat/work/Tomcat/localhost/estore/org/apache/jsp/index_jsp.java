/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-09-26 01:56:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("    <title>briup电子商务-首页</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/common.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/icons.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/table.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/turn.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--顶部-->\r\n");
      out.write("<div class=\"top\">\r\n");
      out.write("    <div class=\"top_center\">\r\n");
      out.write("        <ul class=\"top_bars\">\r\n");
      out.write("            <li>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"/estore/logoutServlet\">退出</a>|</li>\r\n");
      out.write("            <li><a href=\"#\">我的订单<span class=\"jt_down\"></span></a>|</li>\r\n");
      out.write("            <li><a href=\"#\">关注杰普<span class=\"jt_down\"></span></a>|</li>\r\n");
      out.write("            <li><a href=\"#\">网站导航<span class=\"jt_down\"></span></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--头部-->\r\n");
      out.write("<div class=\"header3\">\r\n");
      out.write("    <a href=\"#\"><img src=\"images/logo.png\"></a>\r\n");
      out.write("    <div class=\"h3_center\">\r\n");
      out.write("        <div class=\"search_box\">\r\n");
      out.write("            <input type=\"text\"/>\r\n");
      out.write("            <span>搜索</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <p>\r\n");
      out.write("            <a href=\"#\">文学类</a>|\r\n");
      out.write("            <a href=\"#\">教育类</a>|\r\n");
      out.write("            <a href=\"#\">计算机</a>|\r\n");
      out.write("            <a href=\"#\">儿童类</a>|\r\n");
      out.write("            <a href=\"#\">漫画类</a>|\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"h3_right\">\r\n");
      out.write("        <div class=\"myyy\">\r\n");
      out.write("            个人信息\r\n");
      out.write("            <span class=\"sj_down\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tsc\">\r\n");
      out.write("            <a href=\"shopCart.html\">去购物车结算</a>\r\n");
      out.write("            <span class=\"sj_right\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--头部导航-->\r\n");
      out.write("<div class=\"nav_top\">\r\n");
      out.write("    <div class=\"nav_top_center\">\r\n");
      out.write("        <div>\r\n");
      out.write("            全部图书分类\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"#\">文学类</a></li>\r\n");
      out.write("            <li><a href=\"#\">教育类</a></li>\r\n");
      out.write("            <li><a href=\"#\">计算机</a></li>\r\n");
      out.write("            <li><a href=\"#\">儿童类</a></li>\r\n");
      out.write("            <li><a href=\"#\">漫画类</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container3\">\r\n");
      out.write("    <div class=\"c3_b1\">\r\n");
      out.write("        <div class=\"c3_b1_left\">\r\n");
      out.write("            <dl>\r\n");
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </dl>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"c3_b1_center\">\r\n");
      out.write("            <!-- <div>\r\n");
      out.write("                <a href=\"#\"><img src=\"images/ad1.png\"></a>\r\n");
      out.write("            </div> -->\r\n");
      out.write("            <!-- 图片伦伯 -->\r\n");
      out.write("            <div class=\"carousel\" id=\"carousel\">\r\n");
      out.write("                <div class=\"btns\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"leftBtn\" id=\"leftBtn\"></a>\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"rightBtn\" id=\"rightBtn\"></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"m_unit\" id=\"m_unit\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\"><img src=\"images/ad1.png\" alt=\"\" /></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><img src=\"images/ad1.png\" alt=\"\" /></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><img src=\"images/ad1.png\" alt=\"\" /></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><img src=\"images/ad1.png\" alt=\"\" /></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><img src=\"images/ad1.png\" alt=\"\" /></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"circles\" id=\"circles\">\r\n");
      out.write("                    <ol>\r\n");
      out.write("                        <li class=\"cur\"></li>\r\n");
      out.write("                        <li></li>\r\n");
      out.write("                        <li></li>\r\n");
      out.write("                        <li></li>\r\n");
      out.write("                        <li></li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"c3_b1_c_bottom\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"viewBook.html\"><img src=\"images/p01.png\"/></a>\r\n");
      out.write("                        <a href=\"viewBook.html\">Java从入门到精通</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"viewBook.html\"><img src=\"images/p01.png\"/></a>\r\n");
      out.write("                        <a href=\"viewBook.html\">Java从入门到精通</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"viewBook.html\"><img src=\"images/p01.png\"/></a>\r\n");
      out.write("                        <a href=\"viewBook.html\">Java从入门到精通</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"c3_b1_right\">\r\n");
      out.write("            <h1>杰普快报<a href=\"#\">更多</a></h1>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("                <li><a href=\"#\">〈加措〉相信这一切都是对我们最好的安排  </a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"clear:both\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"c3_b2\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"c20\"></div>\r\n");
      out.write("\r\n");
      out.write("<!--脚部-->\r\n");
      out.write("<div class=\"footer3\">\r\n");
      out.write("    <div class=\"f3_top\">\r\n");
      out.write("        <div class=\"f3_center\">\r\n");
      out.write("            <div class=\"ts1\">品目繁多 愉悦购物</div>\r\n");
      out.write("            <div class=\"ts2\">正品保障 天天低价</div>\r\n");
      out.write("            <div class=\"ts3\">极速物流 特色定制</div>\r\n");
      out.write("            <div class=\"ts4\">优质服务 以客为尊</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"f3_middle\">\r\n");
      out.write("        <ul class=\"f3_center\">\r\n");
      out.write("            <li class=\"f3_mi_li01\">\r\n");
      out.write("                <h1>购物指南</h1>\r\n");
      out.write("                <p>常见问题</p>\r\n");
      out.write("                <p>找回密码</p>\r\n");
      out.write("                <p>会员介绍</p>\r\n");
      out.write("                <p>购物演示</p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"f3_mi_li01\">\r\n");
      out.write("                <h1>配送方式</h1>\r\n");
      out.write("                <p>常见问题</p>\r\n");
      out.write("                <p>找回密码</p>\r\n");
      out.write("                <p>会员介绍</p>\r\n");
      out.write("                <p>购物演示</p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"f3_mi_li01\">\r\n");
      out.write("                <h1>支付方式</h1>\r\n");
      out.write("                <p>常见问题</p>\r\n");
      out.write("                <p>找回密码</p>\r\n");
      out.write("                <p>会员介绍</p>\r\n");
      out.write("                <p>购物演示</p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"f3_mi_li01\">\r\n");
      out.write("                <h1>售后服务</h1>\r\n");
      out.write("                <p>常见问题</p>\r\n");
      out.write("                <p>找回密码</p>\r\n");
      out.write("                <p>会员介绍</p>\r\n");
      out.write("                <p>购物演示</p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"f3_mi_li01\">\r\n");
      out.write("                <h1>服务保障</h1>\r\n");
      out.write("                <p>常见问题</p>\r\n");
      out.write("                <p>找回密码</p>\r\n");
      out.write("                <p>会员介绍</p>\r\n");
      out.write("                <p>购物演示</p>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"f3_mi_li06\">\r\n");
      out.write("                <h1>客服中心</h1>\r\n");
      out.write("                <img src=\"images/qrcode_jprj.jpg\" width=\"80px\" height=\"80px\">\r\n");
      out.write("                <p>抢红包、疑问咨询、优惠活动</p>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"f3_bottom\">\r\n");
      out.write("        <p class=\"f3_links\">\r\n");
      out.write("            <a href=\"#\">关于我们</a>|\r\n");
      out.write("            <a href=\"#\">联系我们</a>|\r\n");
      out.write("            <a href=\"#\">友情链接</a>|\r\n");
      out.write("            <a href=\"#\">供货商入驻</a>\r\n");
      out.write("        </p>\r\n");
      out.write("        <p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司 </p>\r\n");
      out.write("        <img src=\"images/police.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/animate-2.0.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/turn.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /index.jsp(20,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty customer}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                     <li><a>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</a>|</li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <li ><a href=\"#\">登录</a>|</li>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /index.jsp(82,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(82,16) '${CategoryList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${CategoryList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /index.jsp(82,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("category");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                   <dd>\r\n");
          out.write("                       <h1>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h1>\r\n");
          out.write("                       <p>\r\n");
          out.write("                        ");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                       </p>\r\n");
          out.write("                   </dd>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /index.jsp(86,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(86,24) '${category.categories}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${category.categories}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /index.jsp(86,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("child");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <a href=\"list.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${child.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /index.jsp(164,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/index.jsp(164,12) '${Books}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${Books}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /index.jsp(164,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("book");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <li class=\"no_mr\">\r\n");
          out.write("                <div class=\"c3_b2_txt\">\r\n");
          out.write("                    <h1>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h1>\r\n");
          out.write("                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.author}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("                    <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h2>\r\n");
          out.write("                    <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.category.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h2>\r\n");
          out.write("                    <p><a href=\"/estore/bookInfo?bookId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">更多精彩，点击进入</a></p>\r\n");
          out.write("                </div>\r\n");
          out.write("                <div style=\"float:right ;position: relative ;top:-170px;right: 50px\">\r\n");
          out.write("                    <a href=\"/estore/bookInfo?bookId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" width=\"100px\" height=\"120px\" >\r\n");
          out.write("                    </a>\r\n");
          out.write("                </div>\r\n");
          out.write("            </li>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }
}