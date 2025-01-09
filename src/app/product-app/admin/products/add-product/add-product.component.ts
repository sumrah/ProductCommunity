import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommunityService } from 'src/app/product-app/service/community.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private service: CommunityService, private router: Router) { }

  ngOnInit(): void {
  }
  addProduct(form : any){
    let newPost = {
      productName: form.value.productName,
      brandName: form.value.brandName,
      productCode: form.value.productCode,
      id: this.service.getUser().id
    }
    
    
    this.service.addProduct(newPost).subscribe(
      (data)=>{ 
        this.router.navigate(['admin/products']);
      },
      (err)=>{console.log(err)}
    )
  }

}
