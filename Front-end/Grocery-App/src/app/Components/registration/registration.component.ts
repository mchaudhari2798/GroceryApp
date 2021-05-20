import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Registration } from '../../classesTS/registration';
import { RegistrationService } from '../../service/registration.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  registration = new Registration();
  
  constructor(private router:Router,
    private regService:RegistrationService) { }

  ngOnInit(): void {
       
  }
  onSubmit(){
    let obj = {
      "user_Id" : this.registration.user_Id,
      "userName" : this.registration.userName,
      "email": this.registration.email,  
      "password": this.registration.password,   
      "phoneNo": this.registration.phoneNo,
      "address":this.registration.address
    }
  }
  
  }

