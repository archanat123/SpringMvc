package apex.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "greeting")
public class GreetingController {
	
	
	@GetMapping(path = "/helloWorld")
	public String helloWorld()
	{
		System.out.println("helloWorld.helloWorld()");
		return "hello";
	}
	@GetMapping(path = "/howAreYou")
	public String howAreYou()
	{
		System.out.println("helloWorld.helloWorld()");
		return "howAreYou";
	}
	
	

}
