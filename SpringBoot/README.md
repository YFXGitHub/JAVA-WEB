springboot的学习！

thymeleaf: 的使用方法：
《在页面中使用thymeleaf 标签要引入  xmlns:th="http://www.thymeleaf.org"  即可》

 <!-- [[ ]] : th:text 会转义特殊字符        [( )]  : th:utext  不会转义特殊字符-->
    <div th:text="${a}"></div>
    <div th:utext="${a}"></div>

    thymeleaf 的循环 三个h1标签
     <h1 th:text="${user}" th:each="user:${b}"></h1>

<h2>标签中有三个span标签
      <h2>
         <span th:each="user:${b}">[[${user}]]</span>
     </h2>

判断标签， 使用#strings.isEmpty(?) 当不为空 p标签才生效！
  <p style="color: red;" th:text="${msg}" th:if="${not #strings.isEmpty(msg)}"></p>
