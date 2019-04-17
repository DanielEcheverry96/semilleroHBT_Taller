import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from './template.service';
import { FacturaDetalle } from '../capa/principal/pedido/modelo/facturaDetalle';
import { ResultadoDTO } from '../capa/principal/pedido/modelo/resultadoDTO';

/**
 * Servicio que permite consultar los servcios de la FacturaDetalle
 */
@Injectable({
    providedIn: 'root'
})
export class ConsultaFacturaDetalleService extends AbstractService {

    /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  /**
   * Crear Factura del pedido
   * Retorna un objeto resultadoDTO que responde si el proceso fue exitoso o no
   * @param facDetalle
   */
  public crearFacturaDetalle( facDetalle): Observable<ResultadoDTO> {
    return this.post<ResultadoDTO>('/semillero-servicios', '/ConsultasRest/crearFacturaDetalle',
    {
        'facDetalle': facDetalle
    });
  }
}
