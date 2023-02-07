import java.util.Scanner;

public class newtest {
	public static void main(String arg[]) {
		
		Scanner ler = new Scanner(System.in);
		double altura, massa;
		

		System.out.println("==================================================");
		System.out.println(                        "AÇÕES"                     );
		System.out.println("==================================================");
		System.out.println("[1] Medir O IMC"                                   );
		System.out.println("--------------------------------------------------");
		System.out.println("[2] Dias da semana"                                );
		System.out.println("--------------------------------------------------");
		System.out.println("[3] DOAÇÕES"                                       );
		System.out.println("--------------------------------------------------");
		System.out.println("[4] CANCELAR"                                      );
		System.out.println("==================================================");
		int inicio = ler.nextInt();

		// -------------------------------------------------------------------------------------	
		
        switch (inicio) {
			case 1:
			
				System.out.println("==================================================");
				System.out.println("               DIGITE A MASSA (Kg)"                );
				System.out.println("==================================================");
				massa = ler.nextFloat();
				System.out.println("==================================================");
				System.out.println("               DIGITE A ALTURA (m)"                );
				System.out.println("==================================================");
				altura = ler.nextFloat();
				
				double imc = massa / (Math.pow(altura, 2));  
				
				System.out.printf("O IMC é de %.2f.", imc);
				
			break;	// -------------------------------------------------------------------------
				
			case 2: 

				int dia;
			
				System.out.println("=================================================");
				System.out.println(                "DIGITE UM DIA"                    );
				System.out.println("=================================================");
				System.out.println("[1] para domingo.                                ");
				System.out.println("-------------------------------------------------");
				System.out.println("[2] para Segunda.                                ");
				System.out.println("-------------------------------------------------");
				System.out.println("[3] para Terça.                                  ");
				System.out.println("-------------------------------------------------");
				System.out.println("[4] para Quarta.                                 ");
				System.out.println("-------------------------------------------------");
				System.out.println("[5] para Quinta.                                 ");
				System.out.println("-------------------------------------------------");
				System.out.println("[6] para Sexta.                                  ");
				System.out.println("-------------------------------------------------");
				System.out.println("[7] para Sábado.                                 ");
				System.out.println("=================================================");
				dia = ler.nextInt();
				
				switch (dia) {
					
					case 1:
						System.out.println("Domingo.");
					break;
					
					case 2: 
						System.out.println("Segunda-Feira.");
					break;

					case 3: 
						System.out.println("Terça-Feira.");
					break;
					
					case 4: 
						System.out.println("Quarta-Feira.");
					break;
					
					case 5: 
						System.out.println("Quinta-Feira.");
					break;
					
					case 6: 
						System.out.println("Sexta-Feira.");
					break;
					
					case 7: 
						System.out.println("Sábado.");
					break;
					
				} // Fim switch dentro do case 2
				
				break; // -------------------------------------------------------------------------	

			case 3: 
				
				int doacao, valor;
				
				System.out.println("=================================================");
				System.out.println("                    BOAS AÇÕES                   ");
				System.out.println("=================================================");
				System.out.println("[1] Para doar R$10"                               );
				System.out.println("-------------------------------------------------");
				System.out.println("[2] Para doar R$15"                               );
				System.out.println("-------------------------------------------------");
				System.out.println("[3] Para doar R$20"                               );
				System.out.println("-------------------------------------------------");
				System.out.println("[4] Para doar outro valor"                        );
				System.out.println("-------------------------------------------------");
				System.out.println("[5] Para Cancelar"                                );
				System.out.println("=================================================");
				doacao = ler.nextInt();

				switch (doacao) {

					
					case 1: 
						valor = 10;
						System.out.printf("Você doou R$%.2f.", valor);
					break;
					
					case 2:
						valor = 15;
						System.out.printf("Você doou R$%.2f.", valor);
					break;

					case 3:
						valor = 20;
						System.out.printf("Você doou R$%.2f.", valor);
					break;

					case 4:
						System.out.println("Quanto você pretende doar? ");
						valor = ler.nextInt();
						System.out.printf("Você doou R$%.2f.", valor);
					break;

					case 5:
						valor = 10;
						System.out.printf("Você doou R$%.2f.", valor);
					break;
				}
				
				
				
			} // Fim switch main
			ler.close();	
		} // Fim main	
	} // Fim class
	
	