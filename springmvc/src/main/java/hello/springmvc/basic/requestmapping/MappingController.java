package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {
	private Logger log = LoggerFactory.getLogger(getClass());
	
	
	@RequestMapping("/hello-basic")
	public String helloBasic() {
		log.info("hellobasic");
		
		return "ok";
	}
	@GetMapping("/mapping/users/{userId}/orders/{orderId}")
	public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
		 log.info("mappingPath userId={}, orderId={}", userId, orderId);
		 return "ok";
	}
}
