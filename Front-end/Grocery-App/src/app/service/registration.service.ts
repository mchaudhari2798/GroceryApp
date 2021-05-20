import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  
  private baseUrlall = "http://localhost:8080/Registration/";

  constructor(private http:HttpClient) { }

}
