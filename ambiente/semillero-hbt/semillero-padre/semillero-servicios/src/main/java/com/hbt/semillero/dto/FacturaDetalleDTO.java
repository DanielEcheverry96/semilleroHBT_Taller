package com.hbt.semillero.dto;


/**
 * Clase que permite la transferencia de una factura detalle
 * @author Daniel Echeverry
 *
 */
public class FacturaDetalleDTO {

	/**
	 * Recibe el id de la factura detalle
	 */
	private Long detalleId;
	
	/**
	 * Recibe la Factura asociada a la factura detalle
	 */
	private FacturaDTO factura;
	
	/**
	 * Recibe el plato asociado a la factura detalle
	 */
	private PlatoDTO plato;
	
	/**
	 * Recibe la bebida asociada a la factura detalle
	 */
	private BebidaDTO bebida;
	
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
	public FacturaDTO getFactura() {
		return factura;
	}

	/**
	 * @param Asigna la factura asociada a la factura detalle
	 */
	public void setFactura(FacturaDTO factura) {
		this.factura = factura;
	}

	/**
	 * @return Retorna el plato asociado a la factura detalle
	 */
	public PlatoDTO getPlato() {
		return plato;
	}

	/**
	 * @param Asigna el plato asociado a la factura detalle
	 */
	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}

	/**
	 * @return Retorna la bebida asociada a la factura detalle
	 */
	public BebidaDTO getBebida() {
		return bebida;
	}

	/**
	 * @param Asigna la bebida a asociada a la factura detalle
	 */
	public void setBebida(BebidaDTO bebida) {
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
