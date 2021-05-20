import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Registration } from '../../classesTS/categories';
import { RegistrationService } from '../../service/registration.service';

@Component({
  selector: 'app-registrationlist',
  templateUrl: './registrationlist.component.html',
  styleUrls: ['./registrationlist.component.css']
})
export class RegistrationlistComponent implements OnInit {

  users : Array<Registration> = [];

  constructor(private route : ActivatedRoute,
    private router : Router,
    private regservice:RegistrationService) {}

  ngOnInit(): void {
    
  }

}
