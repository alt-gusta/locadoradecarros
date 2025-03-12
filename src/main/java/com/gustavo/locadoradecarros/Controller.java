package com.gustavo.locadoradecarros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

  @GetMapping("/carros")
  public String Carros() {
    return "Rodando...";
  }
  
}
