package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class InicioController {
	
	public ModelAndView inicio(Request request, Response response) {
		return new ModelAndView(null, "inicio.hbs");
	}
}
