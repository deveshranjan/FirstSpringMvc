
package com.booktheticket;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Welcome {
	
@Autowired
MoviesDao movies;
@Autowired
UsersDao usertest;
@RequestMapping(value={"/"},method=RequestMethod.GET)
public ModelAndView showLoginPage()
{
	Users user = new Users();
	ModelAndView model = new ModelAndView("Welcome");	
	model.addObject(user);
	return model;
}


@RequestMapping(value={"/ShowMovies"},method=RequestMethod.GET)
public String showMoviePage()
{
	return "ShowMovies";
}

@RequestMapping(value={"/login"},method=RequestMethod.POST)
public ModelAndView processLoginPage(@ModelAttribute("users")  Users users ,HttpServletRequest req)
{	
	if(!usertest.checkValidUser(users))
	{
		req.setAttribute("inv_msg", "Invalid Credentials");
		return showLoginPage();
	}
	else
	{
		return new ModelAndView("redirect:ShowMovies");
	}
}

@RequestMapping(value={"/SignUp"},method=RequestMethod.POST)
public String processSignUpPage(@Valid Users users, BindingResult res,HttpServletRequest req)
{	
	System.out.println(res.hasErrors());
	if(res.hasErrors())
	{
		return "Welcome";
	}
	else
	{
		String result=usertest.saveUser(users);		
		req.setAttribute("msg", result);
		return "Welcome";
	}
}
}

