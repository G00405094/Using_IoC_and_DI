package ie.atu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;
    private UserDetails userData;

    @Autowired
    public void constructorInjectedController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String registerUser(@PathVariable String name, @PathVariable String email) {
        return userService.registerUser(name, email);
    }

    @PostMapping("/registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDetails registerWithBody(@RequestBody UserDetails userDetails) {
        System.out.println(userDetails.getEmail());
        return new UserDetails();
    }
}
