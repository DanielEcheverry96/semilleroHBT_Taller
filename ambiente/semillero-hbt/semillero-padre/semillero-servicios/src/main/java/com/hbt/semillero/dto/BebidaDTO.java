package com.hbt.semillero.dto;

public class BebidaDTO {

	private Long bebida_id;
	
	private String nombre;
	
	private double precio;
	
	/**
	 * Retorna el id de la bebida
	 * @return Id de la bebida
	 */
	public Long getPlato_id() {
		return bebida_id;
	}

	/**
	 * Asigna el id a la bebida
	 * @param bebida_id
	 */
	public void setPlato_id(Long bebida_id) {
		this.bebida_id = bebida_id;
	}

	/**
	 * Retorna el nombre de la bebida
	 * @return Nombre de la bebida
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre a la bebida
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Retorna el precio de la bebida
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Asigna el precio a la bebida
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}

