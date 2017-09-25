import {Injectable} from "@angular/core";
import {HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {JWTAuthenticationService} from "../services/JWTAuthenticationService";

@Injectable()
export class JWTAuthenticationInterceptor implements HttpInterceptor {

  constructor(private jwtAuthenticationService: JWTAuthenticationService) {

  }

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    const JWT = this.jwtAuthenticationService.getToken();
    req = req.clone({
      setHeaders: {
        Authorization: JWT
      }
    });
    return next.handle(req);
  }


}
