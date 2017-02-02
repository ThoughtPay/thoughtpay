## What are they?
There are two main return types: String and ModelAndView.

## When do I use them?
**String**: to be used when you only need to return the name of the view to be rendered.
   Example:
``` java
@RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }
```

**ModelAndView**: to be used when you also need to add to or update the model. Here "UserList", the name of the new view, is passed into the constructor of the ModelAndView we return, rather than returned as a string in the previous example.
   Example:
``` java
@RequestMapping("/listUsers")
public ModelAndView listUsers() {
 
    List<User> listUser = new ArrayList<>();
 
    ModelAndView modelView = new ModelAndView("UserList");
    modelView.addObject("listUser", listUser);
 
    return modelView;
}
```

## For more information on Spring MVC controllers see [this helpful tutorial](http://www.codejava.net/frameworks/spring/14-tips-for-writing-spring-mvc-controller).