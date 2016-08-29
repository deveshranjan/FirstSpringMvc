package com.booktheticket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository

public class MoviesDao extends JdbcDaoSupport{

	@Autowired
	public MoviesDao(JdbcTemplate jdbcTemplate)
	{
		super.setJdbcTemplate(jdbcTemplate);
	}
	public List<Movie> getAllMovies()
	{
		String qsql = "select moviename as movieName, movie_duration as movieDuration from movies";
		List<Movie> movies = getJdbcTemplate().query(qsql,new BeanPropertyRowMapper<Movie>(Movie.class));
		return movies;
	}
}
