package studentController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineAdmissionSystem.SpringbootProject.Entity.Student;


//restcontroller - controller and response body( refers to the content that a server sends back to a client as part of an HTTP response)
@RestController
public class studentController {
	// map methods to handle the incoming data from postman
	@PostMapping("/api")
	public void saveStudent(@RequestBody Student student){//responsebody makes the fields mandatory no null values 
		System.out.println(student);
	}

}
