import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../models/user';
import { CommunityService } from '../service/community.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  user: User=new User();
  msg:any;
  constructor(private service: CommunityService, private router: Router) { }

  ngOnInit(): void {
   
  }

  registerUser(){
   
    this.service.registerUser(this.user).subscribe(
      data => {console.log("Success!")
      this.service.setUser(data);
      this.service.isLoggedIn = true;
      this.router.navigate(['login']);
      },
      err => {
        console.log("Error!"),
       this.msg = "Please Check Your Email | Password"}
       )
      
    
  }
  }


