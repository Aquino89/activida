package com.mx.Microservicios.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "HU_CAT_MONEDA")
@Data
public class HUCATMONEDA {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NUM_CIA", nullable = false)
	private Long numCia;
	
	@Column(name = "CLAVE_MONEDA", nullable = false, unique = true)
	private String claveMoneda;
	
	@Column(name = "DESCRIPCION", nullable = false)
	private String discripcion;
	
	@Column(name = "SIMBOLO", nullable = false)
	private String sinbolo;
	
	@Column(name = "ESTATUS", nullable = false)
	private String estatus;

}
