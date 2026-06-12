import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LotofacilService {

  private apiUrl = 'https://lotofacil-0y5x.onrender.com/api/sortear';

  constructor(private http: HttpClient) {}

  sortear(): Observable<{ numeros: number[] }> {
    return this.http.get<{ numeros: number[] }>(this.apiUrl);
  }
}
