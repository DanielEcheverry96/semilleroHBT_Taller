import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { PrincipalComponent } from './capa/principal/principal.component';
import { PedidoComponent } from './capa/principal/pedido/pedido.component';
import { ResultadosComponent } from './capa/principal/pedido/resultados/resultados.component';
import { OpcionesComponent } from './capa/principal/pedido/opciones/opciones.component';
import { ResumenComponent } from './capa/principal/pedido/resumen/resumen.component';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { CapaComponent } from './capa/capa.component';

/**
 * gestion representa el modulo que va a contener los componentes que van a
 * mover la aplicacion
 */
@NgModule({
    declarations: [PrincipalComponent, PedidoComponent, ResultadosComponent, OpcionesComponent, ResumenComponent, EncabezadoComponent, CapaComponent],
    imports: [
      CommonModule,
      RouterModule,
      FormsModule
    ],
    exports: [],
    providers: []
})
export class GestionModule {}

