import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../../services/user.service';
import { User } from '../../models/user.model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  loginMessage: string = '';
  errorMessage: string = ''; // New error message field

  constructor(private fb: FormBuilder, private userService: UserService, private router: Router) {
    this.loginForm = this.fb.group({
      login: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  ngOnInit(): void { }

  login() {
    if (this.loginForm.invalid) {
      this.loginMessage = '';
      this.errorMessage = 'Please fill in all fields.';
      return;
    }
  
    const credentials = this.loginForm.value;
    console.log('1');
  
    this.userService.login(credentials).subscribe({
      next: (response) => {
        if (response) {
          this.loginMessage = 'Authentication successful. Redirecting...';
          this.errorMessage = ''; // Clear error message on success
          console.log('Navigating to home page...');
          this.router.navigate(['/home']);
          console.log('Navigation to home page completed.');
        } else {
          this.loginMessage = '';
          this.errorMessage = 'Authentication failed. Please check your login credentials.';
        }
      },
      error: (error) => {
        this.loginMessage = '';
        this.errorMessage = 'An error occurred while trying to authenticate.';
      }
    });
  }
  

}
