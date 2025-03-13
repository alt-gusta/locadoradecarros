package com.gustavo.locadoradecarros;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_cliente")
class ClienteModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  private String nome;
  private String email;
  private String senha;
}