package springbootrestdemo.springbootrestdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
	
@GetMapping("/useinfo")
public ResponseEntity<?> getUser() {
  User u= new  User("Amit", "Noida");
  return new ResponseEntity<>(u, HttpStatus.OK);
}
}
