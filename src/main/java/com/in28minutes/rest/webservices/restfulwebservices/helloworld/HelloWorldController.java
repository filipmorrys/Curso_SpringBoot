package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

//	@GetMapping(path="/hello-world-interantionalized")
//	public String helloWorldInternationalized(
//			@RequestHeader(name="Accept-Language", required=false) Locale locale) {
//		return messageSource.getMessage("good.morning.message", null, locale);
//	}
	@GetMapping(path="/hello-world-interantionalized")
	public String helloWorldInternationalized() {
		return messageSource.getMessage("good.morning.message", null, 
				LocaleContextHolder.getLocale());
	}

}
