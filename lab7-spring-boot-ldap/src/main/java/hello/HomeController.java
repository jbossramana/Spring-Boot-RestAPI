package hello;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home()
	{
		return "Home page";
	}
	
    @GetMapping("/")
    public String index() {
        // Get the authentication object from SecurityContextHolder
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // Check if the user is authenticated
        if (authentication != null && authentication.isAuthenticated()) {
            // Retrieve the principal (user details) from the authentication object
            Object principal = authentication.getPrincipal();

            // Check if the principal is an instance of UserDetails
            if (principal instanceof UserDetails) {
                UserDetails userDetails = (UserDetails) principal;

                // Access the user details properties such as username
                String username = userDetails.getUsername();
                return "Welcome, " + username + "! This is the home page for authenticated users.";
            } else {
                // Handle the case where principal is not an instance of UserDetails
                return "Welcome to the home page!"; // Modify the return value as needed
            }
        } else {
            // Handle the case where the user is not authenticated
            return "Welcome to the home page!"; // Modify the return value as needed
        }
    }
}
