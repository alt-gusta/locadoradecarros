package com.gustavo.locadoradecarros.Carros;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import com.gustavo.locadoradecarros.Cliente.ClienteModel;

@Entity
@Table(name = "tb_carros")
public class CarrosModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  private String marca;
  private String nome;
  private int ano;
  private int KM;

  @OneToMany
  private ClienteModel cliente;
  
}
