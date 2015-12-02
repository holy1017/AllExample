package com.JspServlet;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class JspServletController {

	private static final Logger logger = LoggerFactory.getLogger(JspServletController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/adder")
	@ResponseBody
	public int adder(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res) {
		logger.debug("adder");

		// model.getParameter("result", toInt("num1", req) + toInt("num2",
		// req));

		// return "result";

		return toInt("num1", req) + toInt("num2", req);
	}

	public int toInt(String num, HttpServletRequest req) {
		logger.debug(req.getParameter(num));
		// String n=req.getParameter(num);
		return Integer.parseInt((String) req.getParameter(num));
	}

	@RequestMapping(value = "/bbs-post")
	@ResponseBody
	public Map<String, String> bbsPost(Locale locale, Model model, HttpServletRequest req, HttpServletResponse res) {
		logger.debug("bbsPost");

		Map<String,String> map = new HashMap();
		reqToMap(req,"name", map);
		reqToMap(req,"title", map);
		reqToMap(req,"content", map);

		return map;
	}

	private void reqToMap(HttpServletRequest req, String name,Map<String, String> map) {
		map.put(name, req.getParameter(name));
	}

}
