package cibertec.edu.pe.PruebaGitHub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;
@Data
@Entity
@Table(name="prueba")
public class Prueba {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	@Column(name="nombre")
	private String nombre;
}
