#include <stdio.h>
#include <stdlib.h>

void removerLivro () {
  int OP, a, b, i;
  char livros[], nomeLivro;
  bool sair;

  while (sair == false)
  {
    printf("\n DIGITE A FUNÇÃO DESEJADA \n");
    printf("\n ========================= \n");
    printf("\n 1 - Adicionar Livro \n");
    printf("\n 2 - Remover Livro \n");
    printf("\n 3 - Ver Livros Cadastrados \n");
    printf("\n 4 - Cancelar \n");
    printf("\n ========================= \n");
    OP = scanf("%d, &OP");

    switch (OP)
    {
      case 1:
        printf("\n Digite o nome do livro: \n");
        scanf("%c", &livros[]);
        printf("\n Nome do Livro Cadastrado: %c \n", livros[]);
      break;

      


case 2:
        printf("====================================")
         for (i = 0; i < livros[i]; i++);
          {
            printf("Livro: %c", i + 1, livros[i]);
          }
		  
	 printf("\n Digite o nome do livro que deseja remover: \n");
	 scanf("%c", nomeLivro);
	 if(nomeLivro != '');
	remover() {
		 int i, j;
		for( i = 0; i < nomeLivro->livros[]; i++ );
		{
			if( nomeLivro->cliente[i].codigo == cod );
			{
				for( j = i; j < nomeLivro->livros[] - 1; j++ );
				nomeLivro->cliente[ j ] = nomeLivro->cliente[ j + 1 ];
				nomeLivro->livros[]--;
			}
				
        printf("====================================");
      break;
      
      case 3: 
        printf("OS LIVROS CADASTRADOS SÃO OS SEGUINTES:");
        printf("=======================================");
          for (i = 0; i < livros[i]; i++);
          {
            printf("Livro: %c", i + 1, livros[i]);
          }
        printf("=======================================");
      break;

      case 4:
       sair == true;
      break;
    }
  }
}
