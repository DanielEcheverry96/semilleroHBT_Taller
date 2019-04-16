package com.hbt.semillero.entidades;

import java.io.Serializable;

/**
 * Clase que modela el detalle de la factura de la base de datos
 * @author Daniel Echeverry
 *
 */
public class FacturaDetalle implements Serializable{

	/**
	 * Recibe el id de la factura detalle
	 */
	private Long detalleId;
	
	/**
	 * Recibe la Factura asociada a la factura detalle
	 */
	private Factura factura;
	
	/**
	 * Recibe el plato asociado a la factura detalle
	 */
	private Plato plato;
	
	/**
	 * Recibe la bebida asociada a la factura detalle
	 */
	private Bebida bebida;
	
	/**
	 * Recibe el precio unitario de la factura detalle
	 */
	private double precioUnitario;

	/**
	 * @return Retorna el id de la factura detalle
	 */
	public Long getDetalleId() {
		return detalleId;
	}

	/**
	 * @param  Asigna el id a la factura detalle
	 */
	public void setDetalleId(Long detalleId) {
		this.detalleId = detalleId;
	}

	/**
	 * @return Retorna la factura asociada a la factura detalle
	 */
	public Factura getFactura() {
		return factura;
	}

	/**
	 * @param Asigna la factura asociada a la factura detalle
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	/**
	 * @return Retorna el plato asociado a la factura detalle
	 */
	public Plato getPlato() {
		return plato;
	}

	/**
	 * @param Asigna el plato asociado a la factura detalle
	 */
	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	/**
	 * @return Retorna la bebida asociada a la factura detalle
	 */
	public Bebida getBebida() {
		return bebida;
	}

	/**
	 * @param Asigna la bebida a asociada a la factura detalle
	 */
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	/**
	 * @return Retorna el precio unitario de la factura detalle
	 */
	public double getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * @param  Asigna el precio unitario de la factura detalle
	 */
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
}
