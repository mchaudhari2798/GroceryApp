import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './login/login.component';
import {RegistrationComponent} from './registration/registration.component'

const routes: Routes = [
  { path:'', redirectTo:"/Registration", pathMatch :'full'},
  { path:'registerpage', component:RegistrationComponent},
  { path:'loginpage', component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
