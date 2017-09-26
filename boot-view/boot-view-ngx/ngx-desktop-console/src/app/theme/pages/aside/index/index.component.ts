import {AfterViewInit, Component, OnInit, ViewEncapsulation} from '@angular/core';
import {ScriptLoaderService} from '../../../../_services/script-loader.service';
import {HttpClient} from "@angular/common/http";


@Component({
  selector: '.m-grid__item.m-grid__item--fluid.m-wrapper',
  templateUrl: './index.component.html',
  encapsulation: ViewEncapsulation.None,
})
export class IndexComponent implements OnInit, AfterViewInit {

  json: any;
  currentUser: any;
  token: any;

  constructor(private _script: ScriptLoaderService, private http: HttpClient) {

  }

  ngOnInit() {
    this.currentUser = localStorage.getItem("currentUser");
    this.http.get("/api/hello").subscribe(data => {
        this.json = JSON.stringify(data);
      }
    )
  }

  ngAfterViewInit() {
    this._script.load('.m-grid__item.m-grid__item--fluid.m-wrapper',
      'assets/app/js/dashboard.js');

  }

}
