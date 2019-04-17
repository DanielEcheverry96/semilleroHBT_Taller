import { Component, OnInit, Input } from '@angular/core';
import { FacturaDetalleDTO } from '../modelo/facturaDetalleDTO';

@Component({
  selector: 'app-resumen',
  templateUrl: './resumen.component.html',
  styleUrls: []
})
export class ResumenComponent implements OnInit {

  /**
   * Informacion que proviene del componente padre pedidos
   */
  @Input() public facDetalle: FacturaDetalleDTO;

  constructor() { }

  ngOnInit() {
  }

}
