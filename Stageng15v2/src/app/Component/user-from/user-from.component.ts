import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { empty } from 'rxjs';
import { User } from 'src/app/Model/user.model';
import { UService } from 'src/app/u.service';

@Component({
  selector: 'app-user-from',
  templateUrl: './user-from.component.html',
  styleUrls: ['./user-from.component.css'],
  
})
export class UserFromComponent implements OnInit {
  userForm: FormGroup = new FormGroup({}); 

  constructor(private formBuilder: FormBuilder, private uService: UService) { }

  ngOnInit() {
    this.userForm = this.formBuilder.group({
      name: ['', Validators.required],
      last_name: ['', Validators.required],
      login: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  submitForm() {
    if (this.userForm.valid) {
      const user: User = {
        id : 0,
        first_name: this.userForm.get('name')?.value,
        last_name:this.userForm.get('last_name')?.value,
        login:  this.userForm.get('login')?.value,
        password: this.userForm.get('password')?.value
      };
      this.uService.addUser(user)
        .subscribe(
          () => {
            console.log('User added successfully');
            // Optionally, perform any additional actions after adding the user
          },
          error => {
            console.log('Error adding user:', error);
            // Handle the error appropriately
          }
        );
    }
  }
  
  
}
