import { Component, OnInit, Input } from '@angular/core';
import { from } from 'rxjs';
import { CountryService } from '../../services/country.service';

import {} from '../../services/country.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  @Input() listaData;

  constructor() { }

  ngOnInit(): void { }

}
