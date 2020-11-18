
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  labelButton = 'Buscar query';
  texto: string;

  setQuery(query: string): void{
    this.texto = query;
  }
}
