package com.gustavo.locadoradecarros.Cliente;

import java.util.List;
import com.gustavo.locadoradecarros.Carros.CarrosModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  private String nome;
  private String email;
  private String senha;
  @ManyToOne
  @JoinColumn
  private List<CarrosModel> carros;
}