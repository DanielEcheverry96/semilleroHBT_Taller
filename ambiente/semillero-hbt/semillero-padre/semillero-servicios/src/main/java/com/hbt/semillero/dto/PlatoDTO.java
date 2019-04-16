package com.hbt.semillero.dto;

public class PlatoDTO {

	/**
	 * Recibe el id del plato
	 */
	private Long plato_id;
	
	/**
	 * Recibe el nombre del plato
	 */
	private String nombre;
	
	/**
	 * Recibe el precio del plato
	 */
	private double precio;
	
	/**
	 * Recibe la descripcion del plato
	 */
	private String plato_descripcion;

	/**
	 * Retorna el id del plato
	 * @return Id del plato
	 */
	public Long getPlato_id() {
		return plato_id;
	}

	/**
	 * Asigna el id al plato
	 * @param plato_id
	 */
	public void setPlato_id(Long plato_id) {
		this.plato_id = plato_id;
	}

	/**
	 * Retorna el nombre del plato
	 * @return Nombre del plato
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre al plato
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Retorna el precio del plato
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Asigna el precio al plato
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Retorna la descripcion del plato
	 * @return
	 */
	public String getPlato_descripcion() {
		return plato_descripcion;
	}

	/**
	 * Asigna la descripcion al plato
	 * @param plato_descripcion
	 */
	public void setPlato_descripcion(String plato_descripcion) {
		this.plato_descripcion = plato_descripcion;
	}
}
