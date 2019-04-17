import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from './template.service';
import { PlatoDTO } from '../capa/principal/pedido/modelo/platoDTO';

/**
 * Servicio que permite consultar los servcios del plato
 */
@Injectable({
    providedIn: 'root'
})
export class ConsultaPlatoService extends AbstractService {

    /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  /**
   * Permite consultar un plato por el ID
   * @param idPlato 
   */
  public consultarBebida(idPlato: string): Observable<PlatoDTO> {
    return this.get<PlatoDTO>('/semillero-servicios', '/ConsultasRest/consultarPlatoPorId',
    {
        'idPlato': idPlato
    });
  }

}
