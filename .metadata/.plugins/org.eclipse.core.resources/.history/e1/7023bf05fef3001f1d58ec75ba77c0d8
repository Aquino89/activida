package com.mx.Microservicios.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "HU_EMPLS")
@Data
public class HUEMPLS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NUM_CIA", nullable = false)
	private Integer numCia;
	
	@Column(name = "NUM_EMP", nullable = false)
	private Integer numEmp;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	
	@Column(name = "CALVE_MONEDA", nullable = false)
	private String claveMoneda;
	
	@Column(name = "APELLIDO_PATERNO", nullable = false)
	private String apellidoPaterno;
	
	@Column(name = "APELLIDO_MATERNO", nullable = false)
	private String apellidoMaterno;
	
	@Column(name = "PUESTO", nullable = false)
	private String puesto;
	
}
