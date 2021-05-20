import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartComponent } from './Components/cart/cart.component';

import { LoginComponent } from './Components/login/login.component';
import { ProductsComponent } from './Components/products/products.component';
import { RegistrationComponent} from './Components/registration/registration.component'

const routes: Routes = [
  { path:'', redirectTo:"/Registration", pathMatch :'full'},
  { path:'registerpage', component:RegistrationComponent},
  { path:'loginpage', component:LoginComponent},
  { path: 'viewproducts', component:ProductsComponent },
  { path: 'mycart', component:CartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
