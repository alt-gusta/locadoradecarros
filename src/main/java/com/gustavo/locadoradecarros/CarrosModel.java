package com.gustavo.locadoradecarros;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_carros")
public class CarrosModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  private String marca;
  private String nome;
  int ano;
  int KM;
}
