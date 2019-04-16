package com.hbt.semillero.dto;

import com.hbt.semillero.entidades.Cliente;

public class FacturaDTO {

	private Long facturaId;
	
	/**
	 * Recibe el cliente de la factura
	 */
	private ClienteDTO cliente;
	
	/**
	 * Recibe el iva de la factura
	 */
	private double iva;
	
	/**
	 * Recibe el total de la factura
	 */
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
	public ClienteDTO getCliente() {
		return cliente;
	}

	/**
	 * Asigna el cliente a la factura
	 * @param cliente
	 */
	public void setCliente(ClienteDTO cliente) {
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
