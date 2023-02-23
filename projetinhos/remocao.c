#include <stdio.h>
#include <stdlib.h>

void retirapilha() {

int i, confrem, continuar;

do{ cabec();

printf(“\n Retira livro do topo da pilha \n”);

if (tampilha != 0) {// verifica se tem elementos na pilha

printf(“\n\nCodigo Titulo Editora\n”);

printf(“---------------------------------------------------\n”);

printf(“%6d %-20s \n”, livro[tampilha-1].codigo, livro[tampilha-1].titulo);

printf(“---------------------------------------------------\n”);

printf(“\n\nconfirma retirada do livro (1-sim, 2-nao)? “);

scanf(“%d”,&confrem);

if (confrem ==1) { // confirma que quer remover

tampilha--;

printf(“\n\n Retirado da Pilha com sucesso!!!!\n\n”);

}

else // cancelou a remocao

printf(“\n\n Retirada cancelada\n\n”);

}

else // pilha vazia

printf(“\n\nPilha vazia!!\n\n”);

printf(“\n\nDeseja retirar outro livro(1-sim, 2-nao)? “);

scanf(“%d”,&continuar);

}while (continuar ==1); // continuar retirando livro da pilha