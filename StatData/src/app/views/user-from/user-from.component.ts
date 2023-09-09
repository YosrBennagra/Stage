import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { User } from 'src/app/models/user.model';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user-from',
  templateUrl: './user-from.component.html',
  styleUrls: ['./user-from.component.css'],
})
export class UserFromComponent implements OnInit {
  userForm: FormGroup = new FormGroup({});

  constructor(private formBuilder: FormBuilder, private userService: UserService) {}

  ngOnInit() {
    this.userForm = this.formBuilder.group({
      name: ['', Validators.required],
      last_name: ['', Validators.required],
      login: ['', Validators.required],
      password: ['', Validators.required],
    });
  }

  submitForm() {
    if (this.userForm.valid) {
      const user: User = {
        id: 0,
        first_name: this.userForm.get('name')?.value,
        last_name: this.userForm.get('last_name')?.value,
        login: this.userForm.get('login')?.value,
        password: this.userForm.get('password')?.value,
      };
      
      this.userService.addUser(user).subscribe({
        next: () => {
          console.log('User added successfully');
          // Optionally, perform any additional actions after adding the user
        },
        error: (error) => {
          console.log('Error adding user:', error);
          // Handle the error appropriately
        },
      });
    }
  }
  
}
