###web.xml

Confusing File: [web.xml](#webxml)  

This is where you define the configuration of your web application. Also defines the dispatcher servlet. The Dispatcher Servlet handles web requests. Every web request has to go through it, and it will dispatch the web request to suitable handlers.


* `display-name`:   A name for the application.
* `servlet`:    A class which responds to a particular type of network request - most commonly an HTTP request. Run in a servlet container (like TomCat).
* `servlet-name`:   Used to match a `servlet` with one or more `servlet-mapping`s-- it's only symbolic, and can be anything you want
* `servlet-class`:  The name of the servlet class
* `load-on-startup`:    This tag specifies that the servlet should be loaded automatically when the web application is started. The value specifies the order in which servlets are loaded (we may hav multiple servlets) (lower numbers are run first)
* `servlet-mapping`:    This tag specifies a the URLs that will trigger that servlet.
* `url-pattern`:    Specifies the types of URLs that will trigger the servlet
* **unknowns**:
    * what all the `xmlns` stuff does and everything in the `web-app` opening tag
