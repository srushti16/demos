import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-param-parent',
  templateUrl: './param-parent.component.html',
  styleUrls: ['./param-parent.component.css']
})
export class ParamParentComponent implements OnInit {

  nextId = '';
  nextName = '';

  constructor() { }

  ngOnInit() {
  }

}
