import { Component, OnInit, Input, Output } from '@angular/core';
import { EventEmitter } from 'events';
import { PlatoDTO } from '../modelo/platoDTO';
import { BebidaDTO } from '../modelo/bebidaDTO';

/**
 * Seccion que muestra las opciones del pedido
 */
@Component({
  selector: 'app-opciones',
  templateUrl: './opciones.component.html',
  styleUrls: []
})
export class OpcionesComponent implements OnInit {

  /**
   * Informacion que proviene del componente padre que permiten rellenar los campos
   * que se muestran en la seccion
   */
  @Input() public platos: PlatoDTO[];
  @Input() public bebidas: BebidaDTO[];
  @Input() public tipoPedidos: string[];

  /**
   * Variables que permiten saber cual fue la opcion seleccionada en cada campo
   */
  public platoSelecc: string;
  public bebidaSelecc: string;
  public tipoPedidoSelecc: string;

  /**
   * Mandar datos al padre
   */
  @Output() platoEmitter = new EventEmitter();
  @Output() bebidaEmitter = new EventEmitter();
  @Output() tipoPedidoEmitter = new EventEmitter();

  actualizarPlato(e) {
    this.platoEmitter.emit(e.target.value);
  }

  actualizarBebida(e) {
    this.bebidaEmitter.emit(e.target.value);
  }

  actualizarTipoPedido(e) {
    this.bebidaEmitter.emit(e.target.value);
  }

  constructor() { }

  ngOnInit() {
  }

}
