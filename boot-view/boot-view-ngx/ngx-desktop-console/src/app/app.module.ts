import {BrowserModule} from '@angular/platform-browser';
import {ErrorHandler, NgModule} from '@angular/core';
import {ThemeComponent} from './theme/theme.component';
import {LayoutModule} from './theme/layouts/layout.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ScriptLoaderService} from './_services/script-loader.service';
import {ThemeRoutingModule} from './theme/theme-routing.module';
import {AuthModule} from './auth/auth.module';
import {GlobalErrorHandler} from './_services/error-handler.service';
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {JWTAuthenticationService} from "./services/JWTAuthenticationService";
import {JWTAuthenticationInterceptor} from "./interceptor/JWTAuthenticationInterceptor";
import {LocalStorageService, SessionStorageService} from "ng2-webstorage";


@NgModule({
  declarations: [
    ThemeComponent,
    AppComponent,
  ],
  imports: [
    LayoutModule,
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    ThemeRoutingModule,
    AuthModule,
    HttpClientModule
  ],
  providers: [ScriptLoaderService,
    LocalStorageService,
    SessionStorageService,
    JWTAuthenticationService,
    {provide: ErrorHandler, useClass: GlobalErrorHandler},
    {provide: HTTP_INTERCEPTORS, useClass: JWTAuthenticationInterceptor, multi: true}],
  bootstrap: [AppComponent]
})
export class AppModule {
}
