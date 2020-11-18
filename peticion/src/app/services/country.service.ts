import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  constructor(private http: HttpClient) { }

  listCountries(): Observable<any>{
    const endPoint = 'https://restcountries.eu/rest/v2/all';
    return this.http.get(endPoint);
  }

/*
  listSpain(): Observable<any>{
    const endPoint = 'https://restcountries.eu/rest/v2/all';
    return this.http.get(endPoint)
    .pipe(map(countries => {
      return countries.filter(country => {
        return country.name === 'Spain';
      });
    }));
  }
*/

  listSpainOnly(): Observable<any>{
    const endPoint = 'https://restcountries.eu/rest/v2/name/spain';
    return this.http.get(endPoint);
  }

}
