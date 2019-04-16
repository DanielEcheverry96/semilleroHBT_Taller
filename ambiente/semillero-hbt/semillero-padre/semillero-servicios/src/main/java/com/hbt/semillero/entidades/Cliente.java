package com.hbt.semillero.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase que modela un cliente de la base de datos
 * @author Daniel Echeverry
 *
 */

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

	/**
	 * Recibe el id del cliente
	 */
	@Id
	@Column(name = "cliente_id")
	private Long clienteId;
	
	/**
	 * Recibe el nombre del cliente
	 */
	@Column(name = "cliente_nombre")
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
