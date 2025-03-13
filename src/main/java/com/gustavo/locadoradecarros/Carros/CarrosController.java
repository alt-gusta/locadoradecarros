package com.gustavo.locadoradecarros.Carros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CarrosController {

  @GetMapping("/carros")
  public String Carros() {
    return "Rodando...";
  }
  
}
