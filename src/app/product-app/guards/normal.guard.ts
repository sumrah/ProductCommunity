import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { CommunityService } from '../service/community.service';

@Injectable({
  providedIn: 'root'
})
export class NormalGuard implements CanActivate {
  constructor(private service: CommunityService, private router: Router){}
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      if(this.service.isLogIn() && (this.service.getUserRole()=="NORMAL" ||this.service.getUserRole()=="ADMIN")){
        return true;
      }else{
        this.router.navigate(['home']);
        return false;
      }
    }
    

}
