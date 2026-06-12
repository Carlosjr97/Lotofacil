import { Component, ChangeDetectorRef } from '@angular/core';
import { Router } from '@angular/router';
import { LotofacilService } from '../services/lotofacil.service';

@Component({
  selector: 'app-sorteio',
  standalone: false,
  templateUrl: './sorteio.component.html',
  styleUrls: ['./sorteio.component.css']
})
export class SorteioComponent {

  numeros: number[] = [];
  carregando = false;

  constructor(
    private lotofacilService: LotofacilService,
    private router: Router,
    private cdr: ChangeDetectorRef
  ) {}

  sortear() {
    this.carregando = true;
    this.lotofacilService.sortear().subscribe({
      next: (res) => {
        this.numeros = res.numeros.sort((a, b) => a - b);
        this.carregando = false;
        this.cdr.detectChanges();
      },
      error: () => {
        this.carregando = false;
        this.cdr.detectChanges();
        alert('Erro ao conectar com o servidor. Verifique se o backend está rodando.');
      }
    });
  }

  voltar() {
    this.router.navigate(['/']);
  }
}
