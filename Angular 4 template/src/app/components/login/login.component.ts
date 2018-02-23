import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import { CookieService } from 'angular2-cookie/services/cookies.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  credential = {
    username: '',
    password: ''
  };

  constructor(private client: HttpClient, private cookie: CookieService) { }

  ngOnInit() {
  }

  login() {
    this.client.post(`${environment.context}login`, this.credential,
    {withCredentials: true})
      .subscribe(
        (succ: any) => {
          alert(`${succ.username} you have logged in`);
          this.cookie.putObject('user', succ);
        },
        (err) => {
          alert('failed to log in');
        }
      );
  }

}
