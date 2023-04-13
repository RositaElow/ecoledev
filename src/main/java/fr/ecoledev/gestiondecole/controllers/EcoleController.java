package fr.ecoledev.gestiondecole.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/ecoles")
public class EcoleController {

  
  @GetMapping("/hello")
  public String all() {
    return "Hello Rosita";
  }
	
}
