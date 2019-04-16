package com.hbt.semillero.servicios.interfaces;

import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.ResultadoDTO;

public interface IGestionPedidoBeanLocal {
	
	/**
	 * Permite crear un pedido
	 * @param facturaDetalleDTO
	 * @return Resultado de la operacion
	 */
	public ResultadoDTO crearPedido(FacturaDetalleDTO facturaDetalleDTO);

}
