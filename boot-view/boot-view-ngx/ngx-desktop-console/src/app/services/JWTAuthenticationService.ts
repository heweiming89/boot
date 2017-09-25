import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable()
export class JWTAuthenticationService {

  // constructor(private http: HttpClient){}

  tokenPrefix: String = "Bearer ";

  getToken() {
    return this.tokenPrefix +
      "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1ZCI6WyJhZG1pbiIsInVzZXIiXSwibmJmIjoxNTA2MzI5NTI2LCJpc3MiOiJzc20iLCJleHAiOjE1MDYzMzEzMjYsImlhdCI6MTUwNjMyOTUyNiwianRpIjoiYWM3ZTc5NmMtN2RhMS00MTBiLWFlYTQtY2ZiMTQ3MDRkZWEzIn0.heIbBvGo7lsL9H4Mgsexvk7DktbMO0_oQfNb5XquLR92_Ao2C6_Fft4h3o7ce5zs7bHv3gG5SYz7fBQth1WYqp6_LGQjS7HOs7xKtrpE4kpLHfJZQuP7tc_ASy1Je9O621I5cn5eUS61oTUuckGOomFiA-OAd4309xRqRxRy5Qs";
  }

}
