/* 
 * Arquivo: lista_1b_simples_insere_fim.c
 * Autor: Filipe Colares de Souza
 *
 * Objetivos:
 * Este programa mostra a criaÃ§Ã£o de uma lista encadeada com insercao
 * de registros no início da lista.
 *
 * O programa cria uma lista com 3 nodos, inserindo cada nodo sempre no início da lista.
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

  //VariÃ¡veis que apontam para o inÃ­cio e o fim da lista.
  Nodo *nodo_ini, *nodo_fim;

  //VariÃ¡vel auxiliar para trabalhar com um nodo.
  Nodo *nodo_aux;

  //Inicializando a lista encadeada:
  nodo_ini = NULL;
  nodo_fim = NULL;

  //Criando o primeiro nodo:
  nodo_ini = (Nodo*)malloc(sizeof(Nodo));
  if (nodo_ini) {
    //Preenche os dados do nodo com um valor qualquer para teste.
    nodo_ini->valor = 5;

    //Como Ã© o primeiro nodo, entÃ£o ainda nÃ£o existe um proximo.
    nodo_ini->proximo = NULL;
    //Como Ã© o primeiro nodo da lista, entÃ£o a variÃ¡vel nodo_fim tambÃ©m aponta para esse nodo.
    nodo_fim = nodo_ini;
  }

  //Criando o segundo nodo e colocando no final da lista:
  nodo_aux = (Nodo*)malloc(sizeof(Nodo));
  if (nodo_aux) {
    //Preenche os dados do nodo com um valor qualquer para teste.
    nodo_aux->valor = 6;
    
    //nodo aux proximo recebe o nodo ini, pois ele ainda está no nodo anterior
    nodo_aux->proximo = nodo_ini;
    
	//modifico o nodo aux para ele ser o nodo inicial.
	nodo_ini = nodo_aux;
    
  }

  //Criando o terceiro nodo e colocando no final da lista: Tem que fazer o if pois o malloc pode não ter mais espaço e irá retornar "0"n
  nodo_aux = (Nodo*)malloc(sizeof(Nodo));
  if (nodo_aux) {
    //Preenche os dados do nodo com um valor qualquer para teste.
    nodo_aux->valor = 7;
    
	//nodo aux proximo recebe o nodo ini, pois ele ainda está no nodo anterior
    nodo_aux->proximo = nodo_ini;
    
	//modifico o nodo aux para ele ser o nodo inicial.
	nodo_ini = nodo_aux;
  }

  //Usando um laÃ§o para percorrer toda a lista:
  nodo_aux = nodo_ini;
  while (nodo_aux) {
    printf("Valor do nodo = %d\n", nodo_aux->valor);
    nodo_aux = nodo_aux->proximo;
  }

  system("pause");
	return 0;
}
