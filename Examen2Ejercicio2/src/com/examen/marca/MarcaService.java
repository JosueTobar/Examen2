package com.examen.marca;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class MarcaService {
	@Autowired MarcaRepository repo;
	
	public void save(Marca marca) {
		repo.save(marca);
	}
	
	public List<Marca> listAll(){
		return (List<Marca>) repo.findAll();
	}
	
	public Marca get(Integer id) {
		
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
	
	
}
