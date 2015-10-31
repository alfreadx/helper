package helper.webapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	
	
	@RequestMapping("/greeting")
	public String greeting(
			@RequestParam(value = "name",defaultValue = "world") String name
			){
		
		return "Hello, "+name;
	}
	
	
	
}
