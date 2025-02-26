package com.mx.Microservicios.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Microservicios.Entity.HUEMPLS;
import com.mx.Microservicios.Repository.HUEMPSRepository;

@Service
public class HUEMPLSServiceImp {

	@Autowired
	private HUEMPSRepository dao;
	
	
	public List<HUEMPLS> getAllHUEMPLS() {
		return dao.findAll();
	}

	
	public HUEMPLS getHUEMPLSById(Long id) {
		return dao.findById(id).orElse(null);
	}


	public HUEMPLS createHUEMPLS(HUEMPLS huempls) {
		return dao.save(huempls);
	}

	
	public HUEMPLS updateHUEMPLS(Long id, HUEMPLS updatedHUEMPLS) {
		HUEMPLS huempls = dao.findById(id).orElse(null);
		if(huempls != null) {
			huempls.setNumCia(updatedHUEMPLS.getNumCia());
			huempls.setNumEmp(updatedHUEMPLS.getNumEmp());
			huempls.setNombre(updatedHUEMPLS.getNombre());
			huempls.setClaveMoneda(updatedHUEMPLS.getClaveMoneda());
			huempls.setApellidoPaterno(updatedHUEMPLS.getApellidoPaterno());
			huempls.setApellidoMaterno(updatedHUEMPLS.getApellidoMaterno());
			huempls.setPuesto(updatedHUEMPLS.getPuesto());
			return dao.save(huempls);
		}
		return null;
	}

	
	public void deleteHUEMPLS(Long id) {
		dao.deleteById(id);
	}
	
	//---------------------consultas---------------------
	
	
	public List<HUEMPLS> getHUEMPLSByHUCATMONEDA(Integer numCia, String cveMoneda) {
		return dao.findHUEMPLSByHUCATMONEDA(numCia, cveMoneda);
	}


	public HUEMPLS getHUEMPLSByFilters(Integer numCia, Integer numEmp) {
		return dao.findBynumCiaAndNumEmp(numCia, numEmp);
	}


	
}
