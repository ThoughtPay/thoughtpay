# #25 Create Basic User Profile

#### In home.jsp:
  * How do we want our forms to look? - <label for>
  * Shak: it’s good practice to not have floating text (surround things with label tags!) 
  * name in input field maps to “label for”
  * How to organize the users form? It’s inside a foreach
  * Make them all form:inputs?
  * (we can look into it)

#### UserController
  * Separate from HomeController - responsible for different stuff (UserController interacts with 1 specific user)
  * Create user and save user should be named consistently (create user is more descriptive)
  * Do we have to have “user” in the method name? Or is it more explicit with user
    * User is already in the name of the service and controller
    * Renamed controller and service methods to not have user

#### Changed all “save” to “create” for consistency
	
#### UserRepository
  * New method to generate ID
  * Why is the hashmap using id and user if user has an id
    * Changed from array because it was annoying
    * This will get changed later anyway

#### UserRepoTest
  * Should we mock the user
  * Change any string to user.getId

#### Do we need a user constructor? Why do we have multiple?
  * Make a builder class
  * Spring has a NoArgs constructor thing maybe? (it was lombok)
