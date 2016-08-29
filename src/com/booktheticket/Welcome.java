
package com.booktheticket;

import javax.inject.Inject;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Welcome {
	
@Autowired
MoviesDao movies;

@RequestMapping("/")
public ModelAndView showWelcomePage()
{
	ModelAndView model = new ModelAndView("Welcome");
	model.addObject("user","Devesh");
	return model;
}
@RequestMapping("/movies")
public ModelAndView showWelcome()
{
	ModelAndView model = new ModelAndView("MovieList");
	List<Movie> movie = movies.getAllMovies();
    model.addObject("movie",movie);
    return model;
}
}

