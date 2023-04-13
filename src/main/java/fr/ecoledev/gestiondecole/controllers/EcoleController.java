package fr.ecoledev.gestiondecole.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcoleController {

  
  @GetMapping("/hello")
  public String all() {
    return "Hello Rosita";
  }
	
}
