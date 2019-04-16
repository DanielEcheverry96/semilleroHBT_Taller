package com.hbt.semillero.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Clase que modela una Factura de la base de datos
 * @author Daniel Echeverry
 *
 */
@Entity
@Table(name = "FACTURA")
public class Factura implements Serializable{
	
	
	/**
	 * Recibe el id de la factura
	 */
	@Id
	@Column(name = "facturaId")
	private Long facturaId;
	
	/**
	 * Recibe el cliente de la factura
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	/**
	 * Recibe el iva de la factura
	 */
	@Column(name = "iva")
	private double iva;
	
	/**
	 * Recibe el total de la factura
	 */
	@Column(name = "total")
	private double total;

	/**
	 * Retorna el id de la factura
	 * @return
	 */
	public Long getFactura_id() {
		return facturaId;
	}

	/**
	 * Asigna el id a la Factura
	 * @param facturaId
	 */
	public void setFactura_id(Long facturaId) {
		this.facturaId = facturaId;
	}

	/**
	 * Retorna el cliente de la factura
	 * @return
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * Asigna el cliente a la factura
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Retorna el iva de la factura
	 * @return
	 */
	public double getIva() {
		return iva;
	}

	/**
	 * Asigna el iva a la factura
	 * @param iva
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}

	/**
	 * Retorna el total de la factura
	 * @return
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * Asigna el total a la factura
	 * @param total
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
