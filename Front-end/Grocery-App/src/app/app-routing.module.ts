import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartComponent } from './Components/cart/cart.component';

import { LoginComponent } from './Components/login/login.component';
import { PageNotFoundComponent } from './Components/page-not-found/page-not-found.component';
import { ProductsComponent } from './Components/products/products.component';
import { RegistrationComponent} from './Components/registration/registration.component'
import { RegistrationlistComponent } from './Components/registrationlist/registrationlist.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path:'', redirectTo: "/Grocery", pathMatch :'full'},
  { path:'Grocery',component:HomeComponent},
  { path:'registerpage', component:RegistrationComponent},
  { path:'loginpage', component:LoginComponent},
  { path: 'viewproducts', component:ProductsComponent },
  { path: 'mycart', component:CartComponent},
  { path: 'registrationlist', component:RegistrationlistComponent},
  { path: '**' , component : PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
