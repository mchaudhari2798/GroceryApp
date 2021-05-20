import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CategoriesService } from '../../service/categories.service';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {

  categories:any;

  constructor(private route : ActivatedRoute,
    private router:Router,
    private catService:CategoriesService) { }

  ngOnInit(): void {
    this.router.navigate([]);
  }

  getEmployees(){
    this.catService.getAllCategories().subscribe(data =>{
      this.categories=data;
      console.log(data);
    });
  }

}
