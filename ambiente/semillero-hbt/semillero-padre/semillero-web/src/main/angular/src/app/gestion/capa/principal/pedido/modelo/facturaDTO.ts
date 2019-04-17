import { ClienteDTO } from './clienteDTO';
/**
 * Interface que mapea la informacion transferida de la factuta en el servicio Rest
 */
export interface FacturaDTO {
    idFactura: number;
    cliente: ClienteDTO;
    total: number;
}
