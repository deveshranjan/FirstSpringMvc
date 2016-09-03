package com.booktheticket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.STRING;
import javax.sql.DataSource;
import javax.xml.registry.infomodel.User;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository

public class UsersDao extends NamedParameterJdbcDaoSupport{

	@Autowired
	public UsersDao(BasicDataSource datasource)
	{
		super.setDataSource(datasource);
	}
	public boolean checkValidUser(Users user)
	{
		Users u=null;
		Map<String,String> m = new HashMap<String,String>();
		m.put("user",user.getUsername());
		m.put("password", user.getPassword());
		String qsql = "select username,password from users where username=:user and password=:password";
		try
		{
		 u = (Users) getNamedParameterJdbcTemplate().queryForObject(qsql,m,new BeanPropertyRowMapper<Users>(Users.class));
		}
		catch(Exception e){}
		if(u!=null) return true; else return false;
	}
	public String saveUser(Users user)
	{
		String cntsql = "select count(1) as cnt from users where username = ?" ;
		String inssql = "Insert into users values(?,?)";
		try
		{
			String username = user.getUsername();
			int cnt=getJdbcTemplate().queryForObject(cntsql,Integer.class,username);
			if(cnt>0) return "Username Already exist";
		}		catch(Exception e){}
		getJdbcTemplate().update(inssql,user.getUsername(),user.getPassword());
		return "Signup Successfull. Please login to continue";
	}
}
