import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LotofacilService {

  private apiUrl = 'http://localhost:8080/api/sortear';

  constructor(private http: HttpClient) {}

  sortear(): Observable<{ numeros: number[] }> {
    return this.http.get<{ numeros: number[] }>(this.apiUrl);
  }
}
