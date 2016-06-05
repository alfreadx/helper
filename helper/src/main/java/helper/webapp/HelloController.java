package helper.webapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloController {

	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String defaultResponse(){
		return "Hello , how are you?";
		
	}
	
	
	@RequestMapping("/{name}")
	public String greeting(
			@PathVariable String name
			){
		
		return "Hello, "+name;
	}
	
	
	
}
