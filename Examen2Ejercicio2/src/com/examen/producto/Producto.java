package com.examen.producto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id; 
	 private String nombre;
	 private Float precio;
     private Integer idMarca;
	 private Integer idCatalogo;
	 private String descripcion; 
	 private Integer existencia;
	 
	public Producto() {
		
		}
		 
	public Producto(Integer id, String nombre, Float precio, Integer idMarca, Integer idCatalogo, String descripcion, Integer existencia) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.idMarca = idMarca;
		this.idCatalogo = idCatalogo;
		this.descripcion = descripcion;
		this.existencia = existencia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public Integer getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(Integer idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getExistencia() {
		return existencia;
	}

	public void setExistencia(Integer existencia) {
		this.existencia = existencia;
	}
	 
	
	


	
	 
}
