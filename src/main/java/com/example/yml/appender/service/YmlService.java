package com.example.yml.appender.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.example.yml.appender.entity.DocumentDetails;
import com.example.yml.appender.entity.Documents;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

@Service
public class YmlService {
	
	private ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
	private Documents documents;
	
	public void readYml() {
		try {
			documents = mapper.readValue(new File("src/main/resources/Doc.yml"), Documents.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean writeYml(DocumentDetails documentDetails) {
		boolean success = true;
		appendYml(documentDetails);
		try {
			mapper.writeValue(new File("src/main/resources/Doc.yml"), documents);
		} catch (IOException e) {
			success = false;
			e.printStackTrace();
		}
		return success;
	}
	
	private void appendYml(DocumentDetails documentDetails) {
		documents.getDocumentDetails().add(documentDetails);
	}
}
