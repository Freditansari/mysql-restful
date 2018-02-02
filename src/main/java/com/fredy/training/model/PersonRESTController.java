package com.fredy.training.model;

//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@RestController
public class PersonRESTController {
	
//	@Autowired
//	PersonDAO dao;
//	
//	@RequestMapping(method = RequestMethod.GET, path= "/getAllPerson")
//	public List<Person> getAllPerson()
//	{
//		return dao.findAll();
//	}
	
	@GetMapping(path="/hello-world")
	public String HelloWorld()
	{
		return "Hello World";
	}

}
