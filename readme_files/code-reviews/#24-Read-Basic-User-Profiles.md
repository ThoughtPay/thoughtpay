# #24 Read Basic User Profile

##Notes
#### Home Controller
* `HomeService` vs `UserService`? Should services be mapped to controllers or repositories
* If we manipulate model -> should we return ModelAndView instead of String?

#### HomeService
* `@Autowired`: lets you not have to have a constructor in which you inject dependencies into the class (like `UserRepository`)

#### UserRepository
* Should we autowire test file

#### User
* Lombok?
* We overrided equals (and hashcode) to check equality with unique id instead of hashcode


##Decisions
#### Home Controller
* Keep as `HomeService`, unless we see that it should change
* Return `ModelAndView` instead of String

#### User Repository
* Move out fake user arraylist to private variable
* Don't autowire `UserRepositoryTest` as we don't yet understand the implications of doing that

#### User
* Compare id to check equality in test
* Use Lombok `@data` for properties

## Next code review:
* Look over code before and come in with questions/feedback!
