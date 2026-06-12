// O que é a pasta service?
// É onde fica a lógica de negócio da aplicação. O controller chama o service, o service faz o trabalho.
//O que esse arquivo faz?
// Cria uma lista de 1 a 25, embaralha aleatoriamente e retorna os 15 primeiros — esse é o sorteio.

package com.lotofacil.backend.service; // Eu pertenço ao pacote com.lotofacil.backend.service

import org.springframework.stereotype.Service; //Estou importando a anotação @Service do Spring. Ela serve para avisar ao Spring que eu sou uma classe de serviço.
import java.util.ArrayList; // Estou importando a classe ArrayList, que me permite criar listas dinâmicas
import java.util.Collections; // Estou importando a classe Collections, que possui métodos utilitários para trabalhar com listas, como embaralhar elementos.
import java.util.List; // Estou importando a interface List, que representa uma coleção ordenada de elementos.

@Service // Estou me identificando como um Service para o Spring
public class SorteioService { // Eu sou uma classe pública chamada SorteioService. Minha responsabilidade é realizar o sorteio dos números.

    public List<Integer> sortear() { // Eu tenho um método chamado sortear. Quando alguém me chamar, vou devolver uma lista de números inteiros.
        List<Integer> numeros = new ArrayList<>(); // Estou criando uma lista vazia chamada numeros
        for (int i = 1; i <= 25; i++) { // Vou executar um laço de repetição. Começo em 1 e vou até 25.
            numeros.add(i); // A cada repetição, adiciono o valor de i dentro da lista.
        }
        Collections.shuffle(numeros); // Agora embaralho todos os números da lista aleatoriamente.
        return numeros.subList(0, 15); // Vou devolver apenas os primeiros 15 números da lista embaralhada.
    }
}