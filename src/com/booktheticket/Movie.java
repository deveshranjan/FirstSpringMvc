package com.booktheticket;

import javax.inject.Inject;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@Component
public class Movie {
 String movieName;
 int movieDuration;
public int getMovieDuration() {
	return movieDuration;
}
public void setMovieDuration(int movieDuration) {
	this.movieDuration = movieDuration;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
}
