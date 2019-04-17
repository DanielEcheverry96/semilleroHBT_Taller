
/**
 * Interface que mapea la informacion de la factura detalle transferida al servicio Rest
 */
export interface FacturaDetalle {
    idFacturaDetalle: number;
    idFactura: number;
    idPlato: number;
    idBebida: number;
}
