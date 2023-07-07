package com.example.yml.appender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.yml.appender.entity.DocumentDetails;
import com.example.yml.appender.service.YmlService;

@RestController
@RequestMapping("/YmlAppender/V1")
public class YmlController {
	
	@Autowired
	private YmlService service; 
	
	@PostMapping("/postendpoint")
    public String getEndpoint(@RequestBody DocumentDetails documentDetails) {
		String successMessage = "YML File updated successfully.";
		service.readYml();
        if (service.writeYml(documentDetails)) {
        	System.out.println(successMessage);
        } else {
        	successMessage = "failed to update YML File.";
        	System.out.println(successMessage);
        }
        return successMessage;
    }
}
