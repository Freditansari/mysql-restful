package com.fredy.training.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	@Autowired
	JdbcTemplate jdbcTemp;
	
	public List<Person> findAll(){
		//return jdbcTemp.query("select * from person", new BeanPropertyRowMapper(Person.class));
		return jdbcTemp.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
		
	}

}
