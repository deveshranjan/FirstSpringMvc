package com.booktheticket;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\deranjan.ORADEV\\workspace\\FirstSpringMvc\\WebContent\\WEB-INF\\booktheshow-servlet.xml");
	    DataSource dataSource = (DataSource) ac.getBean("dataSource");
	    // DataSource mysqlDataSource = (DataSource) ac.getBean("mysqlDataSource");

	    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

	    jdbcTemplate.update("update users set password = ?","cracked");
	}

}
