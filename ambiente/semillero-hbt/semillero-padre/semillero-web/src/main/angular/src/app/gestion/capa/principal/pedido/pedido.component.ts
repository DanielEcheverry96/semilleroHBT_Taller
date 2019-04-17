import { Component, OnInit } from '@angular/core';
import { FacturaDetalle } from './modelo/facturaDetalle';
import { PlatoDTO } from './modelo/platoDTO';
import { BebidaDTO } from './modelo/bebidaDTO';
import { ResultadoDTO } from './modelo/resultadoDTO';
import { ConsultaFacturaDetalleService } from '../../../servicios/consulta.factura-detalle.service';

@Component({
  selector: 'app-pedido',
  templateUrl: './pedido.component.html',
  styleUrls: []
})
export class PedidoComponent implements OnInit {

  public resultado: ResultadoDTO;

  /**
   * Informacion que vienen de los servicios Pedidos, para luego enviarlos al componente
   * hijo opciones
   */
  public platos: PlatoDTO[];
  public bebidas: BebidaDTO[];
  public tipoPedidos: string[];

  /**
   * Variables para asignar la informacion que viene del componente hijo opciones
   */
  public idPlato: string;
  public idBebida: string;
  public tipoPedido: string;

  /**
   *
   * Informacion para mandar al componente hijo resumen
   */
  public facDetalle: FacturaDetalle;


  /**
   * Metodos para asignar la informacion que viene del componente hijo opciones
   */
  asignarPlato($event) {
    this.idPlato = $event;
  }

  asignarBebida($event) {
    this.idBebida = $event;
  }

  asignarTipoPedido($event) {
    this.tipoPedido = $event;
  }

  constructor(
    private consultaFacturaDetalleService: ConsultaFacturaDetalleService
  ) { }

  ngOnInit() {
    this.tipoPedidos = ['Sitio', 'Llevar'];
  }

  CrearPedido() {
    // Servicio para actualizar el Plato
    // Servicio para actualizar la bebida
    // Servicio para actualizar la factura detalle
    this.crearFactura();

  }

  crearFactura() {
    this.consultaFacturaDetalleService.crearFacturaDetalle(this.facDetalle).subscribe(
      resultado => {
        this.resultado = resultado;
      },
      error => {
        console.log('Error crear pedido', error);
      }
    );
  }

}
