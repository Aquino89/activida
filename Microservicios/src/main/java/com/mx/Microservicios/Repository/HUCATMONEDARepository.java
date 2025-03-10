package com.mx.Microservicios.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Microservicios.Entity.HUCATMONEDA;

@Repository
public interface HUCATMONEDARepository extends JpaRepository<HUCATMONEDA, Long> {
	
	HUCATMONEDA findBynumCiaAndClaveMoneda(Integer numCia, String claveMoneda);

}
