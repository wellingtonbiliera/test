package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SistemaController {

	@RequestMapping(value = "/boasvindas", method = RequestMethod.GET)
	public ModelAndView boasVindas(
			@RequestParam(value = "nome", required = false, defaultValue = "wellington") String nome) {

		ModelAndView modelAndView = new ModelAndView("boasVindas");
		modelAndView.addObject("mensagem", "Olá " + nome);

		return modelAndView;
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String hello(@RequestParam(value = "name") String name,
			@RequestParam(value = "gender") String gender, @RequestParam(value = "email") String email,
			@RequestParam(value = "phone") String phone, @RequestParam(value = "city") String city) {
		System.out.println(name);
		System.out.println(gender);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(city);

		String str = "{\"user\": { \"name\": \"" + name + "\",\"gender\": \"" + gender + "\",\"email\": \"" + email
				+ "\",\"phone\": \"" + phone + "\",\"city\": \"" + city + "\"}}";
		return str;

	}

}