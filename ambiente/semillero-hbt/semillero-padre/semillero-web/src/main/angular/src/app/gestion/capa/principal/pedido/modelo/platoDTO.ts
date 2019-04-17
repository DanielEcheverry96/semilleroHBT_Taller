/**
 * Interface que mapea la informacion transferida del plato en el servicio Rest
 */
export interface PlatoDTO {
    idPlato: number;
    nombre: string;
    precio: number;
    descripcion: string;
}
