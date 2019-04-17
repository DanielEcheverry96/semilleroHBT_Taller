import { BebidaDTO } from './bebidaDTO';
import { PlatoDTO } from './platoDTO';
import { FacturaDTO } from './facturaDTO';

/**
 * Interface que mapea la informacion transferida de la factura detalle en el servicio Rest
 */
export interface FacturaDetalleDTO {
    idFacturaDetalle: number;
    factura: FacturaDTO;
    plato: PlatoDTO;
    bebida: BebidaDTO;
}
