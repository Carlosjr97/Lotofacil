// O que é a pasta controller?
// É a porta de entrada da API. Recebe as requisições HTTP que chegam do frontend e decide qual service chamar.

// O que esse arquivo faz?
// Expõe o endpoint GET /api/sortear. Quando o Angular chamar essa URL, o controller pede ao service os números e devolve como JSON.

package com.lotofacil.backend.controller; // Eu pertenco ao pacote com.lotofacil.backend.controller

import com.lotofacil.backend.dto.SorteioResponse; // Estou importando a classe SorteioResponse, que será usada para devolver os números sorteados para o cliente.
import com.lotofacil.backend.service.SorteioService; // Estou importando a classe SorteioService, que contém a lógica de sorteio.
import org.springframework.web.bind.annotation.*; // Estou importando várias anotações do Spring, como @RestController, @GetMapping, @RequestMapping e @CrossOrigin
import java.util.List; // Estou importando a interface List, que representa uma lista de elementos.

@RestController // Estou avisando ao Spring que sou um Controller REST.
@RequestMapping("/api") // Estou definindo que todas as minhas rotas começam com /api
@CrossOrigin(origins = {"http://localhost:4200", "https://carlosjr97.github.io"}) // Permitindo localhost e GitHub Pages
public class SorteioController { // Eu sou uma classe pública chamada SorteioController

    private final SorteioService sorteioService; // Eu possuo uma referência para um objeto SorteioService

    public SorteioController(SorteioService sorteioService) { // Este é meu construtor. Quando o Spring me cria, ele me entrega um objeto SorteioService
        this.sorteioService = sorteioService; // Estou guardando o objeto recebido dentro do meu atributo.
    }

    @GetMapping("/sortear") // Estou criando uma rota GET chamada /sortear
    public SorteioResponse sortear() { // Este é o método executado quando alguém chama /api/sortear
        List<Integer> numeros = sorteioService.sortear(); // Estou chamando o método sortear() da classe SorteioService para gerar os números.
        return new SorteioResponse(numeros); // Estou criando um objeto SorteioResponse contendo os números sorteados e devolvendo-o para o cliente.
    }
}