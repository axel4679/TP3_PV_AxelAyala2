package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormClientController {
	@GetMapping("/form-cliente")
	public String getFormCliente() {
		return "Form-Cliente";
	}
}
