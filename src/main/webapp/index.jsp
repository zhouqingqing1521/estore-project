<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>briup电子商务-首页</title>
    <link rel="stylesheet" href="css/common.css"/>
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" href="css/icons.css" />
    <link rel="stylesheet" href="css/table.css" />
    <link rel="stylesheet" type="text/css" href="css/turn.css">
</head>
<body>
<!--顶部-->
<div class="top">
    <div class="top_center">
        <ul class="top_bars">
            <li>
                <c:choose>
                    <c:when test="${!empty customer}">
                     <li><a>${customer.name}</a>|</li>
                    </c:when>
                    <c:otherwise>
                        <li ><a href="#">登录</a>|</li>
                    </c:otherwise>
                </c:choose>
            </li>
            <li><a href="/estore/logoutServlet">退出</a>|</li>
            <li><a href="#">我的订单<span class="jt_down"></span></a>|</li>
            <li><a href="#">关注杰普<span class="jt_down"></span></a>|</li>
            <li><a href="#">网站导航<span class="jt_down"></span></a></li>
        </ul>
    </div>
</div>
<!--头部-->
<div class="header3">
    <a href="#"><img src="images/logo.png"></a>
    <div class="h3_center">
        <div class="search_box">
            <input type="text"/>
            <span>搜索</span>
        </div>
        <p>
            <a href="#">文学类</a>|
            <a href="#">教育类</a>|
            <a href="#">计算机</a>|
            <a href="#">儿童类</a>|
            <a href="#">漫画类</a>|
        </p>
    </div>
    <div class="h3_right">
        <div class="myyy">
            个人信息
            <span class="sj_down"></span>
        </div>
        <div class="tsc">
            <a href="shopCart.html">去购物车结算</a>
            <span class="sj_right"></span>
        </div>
    </div>
</div>
<!--头部导航-->
<div class="nav_top">
    <div class="nav_top_center">
        <div>
            全部图书分类
        </div>
        <ul>
            <li><a href="#">文学类</a></li>
            <li><a href="#">教育类</a></li>
            <li><a href="#">计算机</a></li>
            <li><a href="#">儿童类</a></li>
            <li><a href="#">漫画类</a></li>
        </ul>
    </div>
</div>
<div class="container3">
    <div class="c3_b1">
        <div class="c3_b1_left">
            <dl>
<%--                遍历大类--%>
                <c:forEach items="${CategoryList}" var="category">
                   <dd>
                       <h1>${category.name}</h1>
                       <p>
                        <c:forEach items="${category.categories}" var="child">
                            <a href="list.html">${child.name}</a>
                        </c:forEach>
                       </p>
                   </dd>
                </c:forEach>
            </dl>
        </div>
        <div class="c3_b1_center">
            <!-- <div>
                <a href="#"><img src="images/ad1.png"></a>
            </div> -->
            <!-- 图片伦伯 -->
            <div class="carousel" id="carousel">
                <div class="btns">
                    <a href="javascript:;" class="leftBtn" id="leftBtn"></a>
                    <a href="javascript:;" class="rightBtn" id="rightBtn"></a>
                </div>
                <div class="m_unit" id="m_unit">
                    <ul>
                        <li><a href="#"><img src="images/ad1.png" alt="" /></a></li>
                        <li><a href="#"><img src="images/ad1.png" alt="" /></a></li>
                        <li><a href="#"><img src="images/ad1.png" alt="" /></a></li>
                        <li><a href="#"><img src="images/ad1.png" alt="" /></a></li>
                        <li><a href="#"><img src="images/ad1.png" alt="" /></a></li>
                    </ul>
                </div>
                <div class="circles" id="circles">
                    <ol>
                        <li class="cur"></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                    </ol>
                </div>
            </div>
            <div class="c3_b1_c_bottom">
                <ul>
                    <li>
                        <a href="viewBook.html"><img src="images/p01.png"/></a>
                        <a href="viewBook.html">Java从入门到精通</a>
                    </li>
                    <li>
                        <a href="viewBook.html"><img src="images/p01.png"/></a>
                        <a href="viewBook.html">Java从入门到精通</a>
                    </li>
                    <li>
                        <a href="viewBook.html"><img src="images/p01.png"/></a>
                        <a href="viewBook.html">Java从入门到精通</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="c3_b1_right">
            <h1>杰普快报<a href="#">更多</a></h1>
            <ul>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                <li><a href="#">〈加措〉相信这一切都是对我们最好的安排  </a></li>
            </ul>
        </div>
        <div style="clear:both"></div>
    </div>
    <div class="c3_b2">
        <ul>
            <c:forEach items="${Books}" var="book">
            <li class="no_mr">
                <div class="c3_b2_txt">
                    <h1>${book.name}</h1>
                    <p>${book.author}</p>
                    <h2>${book.price}</h2>
                    <h2>${book.category.name}</h2>
                    <p><a href="/estore/bookInfo?bookId=${book.id}">更多精彩，点击进入</a></p>
                </div>
                <div style="float:right ;position: relative ;top:-170px;right: 50px">
                    <a href="/estore/bookInfo?bookId=${book.id}">
                        <img src="${book.image}" width="100px" height="120px" >
                    </a>
                </div>
            </li>
            </c:forEach>
        </ul>
    </div>
</div>
<div class="c20"></div>

<!--脚部-->
<div class="footer3">
    <div class="f3_top">
        <div class="f3_center">
            <div class="ts1">品目繁多 愉悦购物</div>
            <div class="ts2">正品保障 天天低价</div>
            <div class="ts3">极速物流 特色定制</div>
            <div class="ts4">优质服务 以客为尊</div>
        </div>
    </div>
    <div class="f3_middle">
        <ul class="f3_center">
            <li class="f3_mi_li01">
                <h1>购物指南</h1>
                <p>常见问题</p>
                <p>找回密码</p>
                <p>会员介绍</p>
                <p>购物演示</p>
            </li>
            <li class="f3_mi_li01">
                <h1>配送方式</h1>
                <p>常见问题</p>
                <p>找回密码</p>
                <p>会员介绍</p>
                <p>购物演示</p>
            </li>
            <li class="f3_mi_li01">
                <h1>支付方式</h1>
                <p>常见问题</p>
                <p>找回密码</p>
                <p>会员介绍</p>
                <p>购物演示</p>
            </li>
            <li class="f3_mi_li01">
                <h1>售后服务</h1>
                <p>常见问题</p>
                <p>找回密码</p>
                <p>会员介绍</p>
                <p>购物演示</p>
            </li>
            <li class="f3_mi_li01">
                <h1>服务保障</h1>
                <p>常见问题</p>
                <p>找回密码</p>
                <p>会员介绍</p>
                <p>购物演示</p>
            </li>
            <li class="f3_mi_li06">
                <h1>客服中心</h1>
                <img src="images/qrcode_jprj.jpg" width="80px" height="80px">
                <p>抢红包、疑问咨询、优惠活动</p>
            </li>
        </ul>
    </div>
    <div class="f3_bottom">
        <p class="f3_links">
            <a href="#">关于我们</a>|
            <a href="#">联系我们</a>|
            <a href="#">友情链接</a>|
            <a href="#">供货商入驻</a>
        </p>
        <p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司 </p>
        <img src="images/police.png">
    </div>
</div>
<script type="text/javascript" src="js/animate-2.0.1.js"></script>
<script type="text/javascript" src="js/turn.js"></script>
</body>
</html>
