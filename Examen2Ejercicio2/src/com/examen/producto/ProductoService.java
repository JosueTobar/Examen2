package com.examen.producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductoService {
	@Autowired ProductoRespository repo;
	
	public void save(Producto producto) {
		repo.save(producto);
	}
	
	public List<Producto> listAll(){
		return (List<Producto>) repo.findAll();
	}
	
	public Producto get(Integer id) {
		
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	

}
