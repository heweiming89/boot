import {Injectable} from "@angular/core";
import {Http} from "@angular/http";
import {LocalStorageService, SessionStorageService} from "ng2-webstorage";
import {Observable} from "rxjs/Observable";

@Injectable()
export class JWTAuthenticationService {

  tokenName: string = "authenticationToken";
  tokenPrefix: string = "Bearer ";

  constructor(private http: Http, private $localStorage: LocalStorageService, private $sessionStorage: SessionStorageService) {
  }


  getToken() {
    let token = this.tokenPrefix +
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1ZCI6WyJhZG1pbiIsInVzZXIiXSwibmJmIjoxNTA2MzI5NTI2LCJpc3MiOiJzc20iLCJleHAiOjE1MDYzMzEzMjYsImlhdCI6MTUwNjMyOTUyNiwianRpIjoiYWM3ZTc5NmMtN2RhMS00MTBiLWFlYTQtY2ZiMTQ3MDRkZWEzIn0.heIbBvGo7lsL9H4Mgsexvk7DktbMO0_oQfNb5XquLR92_Ao2C6_Fft4h3o7ce5zs7bHv3gG5SYz7fBQth1WYqp6_LGQjS7HOs7xKtrpE4kpLHfJZQuP7tc_ASy1Je9O621I5cn5eUS61oTUuckGOomFiA-OAd4309xRqRxRy5Qs";
    this.$localStorage.store(this.tokenName, token);
    return this.$localStorage.retrieve(this.tokenName) || this.$sessionStorage.retrieve(this.tokenName);
  }

  login(credentials): Observable<any> {

    const data = {
      username: credentials.username,
      password: credentials.password,
      rememberMe: credentials.rememberMe
    };
    return this.http.post('api/authenticate', data).map(authenticateSuccess.bind(this));

    function authenticateSuccess(resp) {
      const bearerToken = resp.headers.get('Authorization');
      if (bearerToken && bearerToken.slice(0, 7) === 'Bearer ') {
        const jwt = bearerToken.slice(7, bearerToken.length);
        this.storeAuthenticationToken(jwt, credentials.rememberMe);
        return jwt;
      }
    }
  }

  loginWithToken(jwt, rememberMe) {
    if (jwt) {
      this.storeAuthenticationToken(jwt, rememberMe);
      return Promise.resolve(jwt);
    } else {
      return Promise.reject('auth-jwt-service Promise reject'); // Put appropriate error message here
    }
  }

  storeAuthenticationToken(jwt, rememberMe) {
    if (rememberMe) {
      this.$localStorage.store(this.tokenName, jwt);
    } else {
      this.$sessionStorage.store(this.tokenName, jwt);
    }
  }

  logout(): Observable<any> {
    return new Observable((observer) => {
      this.$localStorage.clear(this.tokenName);
      this.$sessionStorage.clear(this.tokenName);
      observer.complete();
    });
  }

}
