package alphaBank.aml.controller;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AmlController {
	
	
	@GetMapping("/alphaBank/amlAprovement")
	public boolean amlAprovement() {
		return ThreadLocalRandom.current().nextBoolean();
	}

}
