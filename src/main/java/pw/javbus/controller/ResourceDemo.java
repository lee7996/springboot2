package pw.javbus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pw.javbus.dto.ServiceDto;

@RestController
public class ResourceDemo {

	@Autowired
	private ServiceDto serviceDto;
	
	@GetMapping("serviceInfo")
	public Object getServiceObj() {
		return serviceDto;
	}
}
