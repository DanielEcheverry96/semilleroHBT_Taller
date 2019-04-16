package com.hbt.semillero.servicios.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.Query;

import com.hbt.semillero.dto.BebidaDTO;
import com.hbt.semillero.dto.ClienteDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.PlatoDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidades.Bebida;
import com.hbt.semillero.entidades.Cliente;
import com.hbt.semillero.entidades.Factura;
import com.hbt.semillero.entidades.FacturaDetalle;
import com.hbt.semillero.entidades.Plato;
import com.hbt.semillero.servicios.interfaces.IGestionPedidoBeanLocal;

/**
 * EJB de gestion pedido
 * @author Daniel Echeverry
 *
 */
@Stateless
public class GestionPedidoBean implements IGestionPedidoBeanLocal{

	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * {@link com.hbt.semillero.servicios.interfaces.IGestionPedidoBeanLocal#crearPedido(FacturaDetalleDTO facturaDetalleDTO)
}}
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO crearPedido(FacturaDetalleDTO facDetalleDTO) {
		try {
			FacturaDetalle facturaDetalles = asignarAtributosFacturaDetalle(facDetalleDTO);
			
			if (facDetalleDTO.getFactura().getCliente() != null) {
				Cliente cliente = asignarAtributosCliente(facDetalleDTO.getFactura().getCliente());
				entityManager.persist(cliente);
			}
			if (facDetalleDTO.getFactura() != null) {
				Factura factura = asignarAtributosFactura(facDetalleDTO.getFactura());
				entityManager.persist(factura);
			}
			if (facDetalleDTO.getPlato() != null) {
				Plato plato = asignarAtributosPlato(facDetalleDTO.getPlato());
				entityManager.persist(plato);
			}
			
			if (facDetalleDTO.getBebida() != null) {
				Bebida bebida = asignarAtributosBebida(facDetalleDTO.getBebida());
				entityManager.persist(bebida);
			}
			
			entityManager.persist(facturaDetalles);
			
		} catch (Exception ex) {
			
		}
		
		return new ResultadoDTO(true, "Creado de forma exitosa");
	}
	
	/**
	 * Asigna los atributos básicos del cliente
	 * 
	 * @param clienteDTO
	 * @param clienteDTO
	 */
	private Cliente asignarAtributosCliente(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		cliente.setNombre(clienteDTO.getNombre());
		return cliente;
	}
	
	/**
	 * Asigna los atributos básicos de la factura
	 * 
	 * @param facturaDTO
	 * @param facturaDTO
	 */
	private Factura asignarAtributosFactura(FacturaDTO facturaDTO) {
		Factura factura = new Factura();
		factura.setCliente(asignarAtributosCliente(facturaDTO.getCliente()));
		factura.setIva(facturaDTO.getIva());
		factura.setTotal(facturaDTO.getTotal());
		return factura;
	}
	
	/**
	 * Asigna los atributos básicos de la bebida
	 * 
	 * @param bebidaDTO
	 * @param bebidaDTO
	 */
	private Bebida asignarAtributosBebida(BebidaDTO bebidaDTO) {
		Bebida bebida = new Bebida();
		bebida.setNombre(bebidaDTO.getNombre());
		bebida.setPrecio(bebidaDTO.getPrecio());
		return bebida;
	}
	
	/**
	 * Asigna los atributos básicos de la plato
	 * 
	 * @param platoDTO
	 * @param platoDTO
	 */
	private Plato asignarAtributosPlato(PlatoDTO platoDTO) {
		Plato plato = new Plato();
		plato.setNombre(platoDTO.getNombre());
		plato.setPrecio(platoDTO.getPrecio());
		return plato;
	}
}
