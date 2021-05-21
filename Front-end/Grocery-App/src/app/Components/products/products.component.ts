import { Component, OnInit } from '@angular/core';
import { CategoriesService } from 'src/app/service/categories.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products:any;

  constructor(private catService:CategoriesService) { }

  ngOnInit(): void {
   this.catService.getAllCategories()
      .subscribe(x => {
        console.log(x)
        this.products = x;
      });

    }   
}
