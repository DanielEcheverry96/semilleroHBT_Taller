package com.hbt.semillero.dto;

public class ClienteDTO {

	/**
	 * Recibe el id del cliente
	 */
	private Long clienteId;
	
	/**
	 * Recibe el nombre del cliente
	 */
	private String nombre;

	/**
	 * Retorna el id del cliente
	 * @return Id del Cliente
	 */
	public Long getClienteId() {
		return clienteId;
	}

	/**
	 * Asigna a el id del ciente
	 * @param clienteId
	 */
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	/**
	 * Retorna el nombre del cliente
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre del cliente
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
