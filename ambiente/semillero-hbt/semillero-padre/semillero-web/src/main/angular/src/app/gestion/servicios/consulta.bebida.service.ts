import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from './template.service';
import { BebidaDTO } from '../capa/principal/pedido/modelo/bebidaDTO';

/**
 * Servicio que permite consultar los servcios de la bebida
 */
@Injectable({
    providedIn: 'root'
})
export class ConsultaBebidaService extends AbstractService {

    /**
   * Constructor
   */
  constructor(injector: Injector) {
    super(injector);
  }

  /**
   * Permite consultar una bebida por el ID
   * @param idBebida 
   */
  public consultarBebida(idBebida: string): Observable<BebidaDTO> {
    return this.get<BebidaDTO>('/semillero-servicios', '/ConsultasRest/consultarBebidaPorId',
    {
        'idBebida': idBebida
    });
  }

}
