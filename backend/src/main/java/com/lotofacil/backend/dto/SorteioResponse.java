// O que é a pasta DTO?
// DTO = Data Transfer object. É onde ficam as classes que representam os dados que a api envia para o frontend. Nada de lógica aqui, só estrutura de dados.

// O  que esse arquivo faz?
//Define o formato da resposta da api - um objeto com uma lista de 15 números. É isso que o angular vai receber.

package com.lotofacil.backend.dto; // Eu pertenço ao pacote com.lotofacil.backend.dto

import java.util.List; // importa a classe List do Java para poder usar listas

public class SorteioResponse { // Eu sou uma classe pública chamada SorteioResponse. Como sou public, posso ser utilizada por outras partes da aplicação.
    private List<Integer> numeros; // Eu possuo um atributo chamado numeros, que guarda uma lista de números inteiros. O modificador private significa que ninguém pode acessar essa lista diretamente; ela só pode ser manipulada através dos meus métodos.

    public SorteioResponse(List<Integer> numeros) { // Eu tenho um construtor. Quando alguém cria um objeto meu, precisa me fornecer uma lista de números.
        this.numeros = numeros; // Aqui eu pego a lista recebida como parâmetro e armazeno dentro do meu atributo numeros
    }

    public List<Integer> getNumeros() { //Eu tenho um método chamado getNumeros. Ele serve para devolver a lista de números armazenada em mim.
        return numeros; // Quando alguém chamar esse método, eu retorno minha lista de números.
    }

    public void setNumeros(List<Integer> numeros) { // Eu também tenho um método chamado setNumeros. Ele permite trocar minha lista de números por outra.
        this.numeros = numeros; // Eu pego a nova lista recebida e substituo a lista que estava armazenada em mim
    }
}