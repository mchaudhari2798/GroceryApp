import { Component, OnInit } from '@angular/core';
import { CategoriesService } from '../../service/categories.service';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {

  category_name: any;

  constructor(
    private catService:CategoriesService
    ) { }

  ngOnInit(): void {
   

    this.catService.getAllCategories()
      .subscribe(x => {
        console.log(x)
        this.category_name = x;
      });

  }

}
