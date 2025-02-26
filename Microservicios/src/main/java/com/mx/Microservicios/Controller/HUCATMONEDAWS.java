package com.mx.Microservicios.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Microservicios.Entity.HUCATMONEDA;
import com.mx.Microservicios.Service.HUCATMONEDAServiceImp;

@RestController
@RequestMapping("/api/HU_CAT_MONEDA")
@CrossOrigin("*")
public class HUCATMONEDAWS {
	
	@Autowired
	private HUCATMONEDAServiceImp service;
	
	// Listar
	// http://localhost:8001/api/HU_CAT_MONEDA/listar
	@GetMapping("/listar")
	public ResponseEntity<List<HUCATMONEDA>> getAllHUCATMONEDA() { 
		List<HUCATMONEDA> lista = service.getAllHUCATMONEDA();
		if(lista.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(lista);	
	}
	
	// Buscar por id
	// http://localhost:8001/api/HU_CAT_MONEDA/buscar/1
	@GetMapping("/buscar/{id}")
	public ResponseEntity<HUCATMONEDA> getHUCATMONEDAById(@PathVariable Long id) {
		HUCATMONEDA hucat = service.getHUCATMONEDAById(id);
		if(hucat == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(hucat);
	}
	
	// Crear
	// http://localhost:8001/api/HU_CAT_MONEDA/crear
	@PostMapping("/crear")
	public ResponseEntity<HUCATMONEDA> createHUCATMONEDA(@RequestBody HUCATMONEDA hucatmoneda) {
		HUCATMONEDA hucat = service.createHUCATMONEDA(hucatmoneda);
		if(hucat == null) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
	}
		return ResponseEntity.status(HttpStatus.OK).body(hucat);
	}
	
	
	// Editar
	// http://localhost:8001/api/HU_CAT_MONEDA/editar
	@PutMapping("editar/{id}")
	public ResponseEntity<HUCATMONEDA> updateHUCATMONEDA(@RequestBody HUCATMONEDA hucatmoneda) {
		HUCATMONEDA hucat = service.updateHUCATMONEDA(hucatmoneda.getId(), hucatmoneda);
		if(hucat == null) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(hucat);
	}
	
	
	// Eliminar 
	// http://localhost:8001/HU_CAT_MONEDA/eliminar
	@DeleteMapping("/eliminar/{idnuCia}")
	public ResponseEntity<Void> deleteHUCATMONEDA(@PathVariable Long id) {
		service.deleteHUCATMONEDA(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
/*
	// Buscar por filtro
	// http://localhost:8001/api/HU_CAT_MONEDA/filter?numCia=1&claveMoneda=USD
	@GetMapping("/filter")
	public ResponseEntity<HUCATMONEDA> getHUCATMONEDAByFilters(@RequestParam Integer numCia, @RequestParam String claveMoneda) {
		HUCATMONEDA hucat = service.getHUCATMONEDAByFilter(numCia, claveMoneda);
		if(hucat == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(hucat);
	}
*/
	 
	// Buscar por filtro
	// http://localhost:8001/HU_CAT_MONEDA/buscar/1/USD
	@GetMapping("/buscar/{numCia}/{claveMoneda}")
	public ResponseEntity<HUCATMONEDA> getHUCATMONEDAByFilters(@RequestParam Integer numCia, @RequestParam String claveMoneda) {
		HUCATMONEDA hucat = service.getHUCATMONEDAByFilter(numCia, claveMoneda);
		if(hucat == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(hucat);
	}
	


}
