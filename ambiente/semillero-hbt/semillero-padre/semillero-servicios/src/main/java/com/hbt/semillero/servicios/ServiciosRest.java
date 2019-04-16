package com.hbt.semillero.servicios;

import javax.ejb.EJB;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.servicios.interfaces.IGestionPedidoBeanLocal;

/**
 * Expone las consultas a la base de datos de la aplicación
 * por medio de un servicio Rest 
 * @author Daniel Echeverry
 *
 */
@Path("/ServiciosRest")
public class ServiciosRest {
	
	/**
	 * Interface que encapsula los metodos de consulta a la base de datos
	 */
	@EJB
	private IGestionPedidoBeanLocal GestionPedidoBean;

	/**
	 * Permite crea personas para almacenarlas en la base de datos
	 * El acceso al metodo POST por el servicio Rest se hace por medio del pathServer/crearPersona 
	 * @param personaDTO Objeto de tipo Persona
	 * @return Objeto de tipo ResultadoDTO que contiene el resultado de la consulta
	 * {
	 * 		exitoso: false,
	 * 		mensaje: "No se pudo ingresar a la persona"
	 * }
	 */
	@POST
	@Path("/crearPedido")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearPersona(FacturaDetalleDTO facturaDetalleDTO) {
		ResultadoDTO retorno = new ResultadoDTO();
		retorno.setExitoso(true);
		try {
			GestionPedidoBean.crearPedido(facturaDetalleDTO);			
		}
		catch (Exception ex) {
			retorno.setExitoso(false);
			retorno.setMensajeEjecucion("No se pudo ingresar el pedido");
		}
		return retorno;
	}
}
