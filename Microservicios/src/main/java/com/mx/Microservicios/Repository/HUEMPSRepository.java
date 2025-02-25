package com.mx.Microservicios.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.Microservicios.Entity.HUEMPLS;

@Repository
public interface HUEMPSRepository extends JpaRepository<HUEMPLS, Long> {
	
	HUEMPLS findBynumCiaAndNumEmp(Integer numCia, Integer numEmp);
	
	@Query("SELECT e FROM HUEMPLS e WHERE e.numCia = :numCia AND e.claveMoneda = :claveMoneda")
	List<HUEMPLS> findHUEMPLSByHUCATMONEDA(Integer numCia, String claveMoneda);

}
