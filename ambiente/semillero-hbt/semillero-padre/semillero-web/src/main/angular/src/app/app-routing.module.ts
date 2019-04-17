import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PedidoComponent } from './gestion/capa/principal/pedido/pedido.component';

const routes: Routes = [
  { path: 'pedido', component: PedidoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
