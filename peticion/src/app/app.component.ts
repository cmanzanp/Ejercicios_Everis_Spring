import { Component, OnInit } from '@angular/core';
import { CountryService } from './services/country.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  spain: any[];
  countries: any[];

  constructor(private countryService: CountryService) {}

  ngOnInit(): void {

    this.countryService.listCountries()
    .subscribe(
      (response) => {
        this.countries = response;
      },
      (error) => {
        console.log(error);
      }
    );

    this.countryService.listSpainOnly()
    .subscribe(
      (response) => {
        this.spain = response;
      },
      (error) => {
        console.log(error);
      }
    );
  }
}
