###mvc-dispatcher-servlet.xml

Confusing File: [mvc-dispatcher-servlet.xml](#mvc-dispatcher-servletxml)  

It declares stuff needed for the DispatcherServlet!

* `beans`:  Java Beans are normal POJOs (Plain Old Java Objects). Spring beans are java beans managed by Spring. Here, they are used to form sort ot the backbone of your application.
* `<context:component-scan base-package="com.thoughtpay"/>` : This tells Spring that it should search the class path for all the classes under com.thoughtpay and scan those classes for spring annotations like @Controller, @Repository, @Service,  @Component. Spring will then register those classes as beans.
* `<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">...</bean>` : Tells spring how to find the view it is looking for. Sp if we're looking for the `helloworld` page, we look for prefix(`/WEB-INF/pages/`) + view name(`helloworld`) + suffix(`.jsp`) = `/WEB-INF/pages/helloworld.jsp`
* `<mvc:annotation-driven />`   : This tells Spring that beans are identified/defined with annotations (like @Controller, @Service) rather than in an xml document. 
* **unknowns**:
    * what all the schema stuff does