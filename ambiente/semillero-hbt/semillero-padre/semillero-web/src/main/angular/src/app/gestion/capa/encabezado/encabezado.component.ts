import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html',
  styleUrls: []
})
export class EncabezadoComponent implements OnInit {

  public title = 'Bienvenido';
  constructor() { }

  ngOnInit() {
  }

}
