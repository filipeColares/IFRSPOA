/* 
 * Arquivo: lista_1b_simples_insere_fim.c
 * Autor: Alex Dias Gonsales
 *
 * Objetivos:
 * Este programa mostra a criação de uma lista encadeada com insercao
 * de registros no final da lista.
 *
 * O programa cria uma lista com 3 nodos, inserindo cada nodo sempre no final da lista.
 *
 * Apos criar a lista, o programa percorre toda a lista (do inicio para o fim)
 * e imprime os nodos na tela.
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct nodo Nodo;

struct nodo{
	int valor;
	Nodo *proximo;
};

int main(int argc, char *argv[]) {

  //Variáveis que apontam para o início e o fim da lista.
  Nodo *nodo_ini, *nodo_fim;

  //Variável auxiliar para trabalhar com um nodo.
  Nodo *nodo_aux;

  //Inicializando a lista encadeada:
  nodo_ini = NULL;
  nodo_fim = NULL;

  //Criando o primeiro nodo:
  nodo_ini = (Nodo*)malloc(sizeof(Nodo));
  if (nodo_ini) {
    //Preenche os dados do nodo com um valor qualquer para teste.
    nodo_ini->valor = 5;

    //Como é o primeiro nodo, então ainda não existe um proximo.
    nodo_ini->proximo = NULL;
    //Como é o primeiro nodo da lista, então a variável nodo_fim também aponta para esse nodo.
    nodo_fim = nodo_ini;
  }

  //Criando o segundo nodo e colocando no final da lista:
  nodo_aux = (Nodo*)malloc(sizeof(Nodo));
  if (nodo_aux) {
    //Preenche os dados do nodo com um valor qualquer para teste.
    nodo_aux->valor = 6;
    //Como esse nodo será colocado no final da lista, então não tem nenhum nodo após ele.
    nodo_aux->proximo = NULL;
    //O nodo anterior (nodo_fim), que era o último nodo da lista, 
    //tem que apontar para o nodo_aux recém criado.
    nodo_fim->proximo = nodo_aux;
    //O final da lista agora é esse nodo_aux recém criado.
    nodo_fim = nodo_aux;
  }

  //Criando o terceiro nodo e colocando no final da lista: Tem que fazer o if pois o malloc pode n�o ter mais espa�o e ir� retornar "0"n
  nodo_aux = (Nodo*)malloc(sizeof(Nodo));
  if (nodo_aux) {
    //Preenche os dados do nodo com um valor qualquer para teste.
    nodo_aux->valor = 7;
    //Como esse nodo será colocado no final da lista, então não tem nenhum nodo após ele.
    nodo_aux->proximo = NULL;
    //O nodo anterior (nodo_fim), que era o último nodo da lista, 
    //tem que apontar para o nodo_aux recém criado.
    nodo_fim->proximo = nodo_aux;
    //O final da lista agora é esse nodo_aux recém criado.
    nodo_fim = nodo_aux;
  }

  //Usando um laço para percorrer toda a lista:
  nodo_aux = nodo_ini;
  while (nodo_aux) {
    printf("Valor do nodo = %d\n", nodo_aux->valor);
    nodo_aux = nodo_aux->proximo;
  }

  system("pause");
	return 0;
}
