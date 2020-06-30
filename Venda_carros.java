package dipinho;
import java.util.Scanner;

public class Venda_carros {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		String nome;
		double total,golf,polo,virtus,corolla,hilux,prius,x3,x1,x6,cruze,prisma,onix;
		int marca,modelo, pag;
		
		System.out.println("==========    Seja bem-vindo    ==========");
		System.out.print("Digite seu nome: ");
		nome = i.next();
		System.out.println("");
		System.out.println("1 - Volkswagem");
		System.out.println("2 - Toyota");
		System.out.println("3 - BMW");
		System.out.println("4 - Chevrolet");
		System.out.println("");
		System.out.print("Escolha a marca desejada :");
		marca = i.nextInt();
		
		switch(marca) {
		case 1:
			System.out.println("Você escolheu Volksvagem");
			System.out.println(" - Modelos Disponíveis-");
			System.out.println("");
			System.out.println("1 - Golf TSI - R$ 123.110,00");
			System.out.println("2 - Polo 1.6 - R$ 49.999,00");
			System.out.println("3 - Virtus   - R$ 79.999,00");
			System.out.println("");
			System.out.print("Escolha o modelo desejado: ");
			modelo = i.nextInt();
			
				switch(modelo) {
				case 1: 
					System.out.println("Golf TSI");
					golf = 123.110;
					System.out.println("");
					System.out.println("1 - À vista com desconto de 14%");
					System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
					System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
					System.out.println("");
					System.out.print("Forma de Pagamento ");
					pag = i.nextInt();
							switch(pag) {
							case 1: 
								System.out.println("À vista");
								total = golf-(0.14*golf);
								System.out.print("Preço final do seu automóvel é: R$"+total);
								break;
							case 2: 
								System.out.println("Financiado em 48x");
								total = (golf+(0.16*golf))/48;
								System.out.print("Preço final do seu automóvel é: R$"+total);
								break;
							case 3: 
								System.out.println("Financiado em 60x");
								total = (golf+(0.18*golf))/60;
								System.out.print("Preço final do seu automóvel é: R$"+total);
								break; } //break do case 3
					break; //break do modelo GOLF
				
				case 2: 
					System.out.println("Polo 1.6");
					polo = 49.999;
					System.out.println("");
					System.out.println("1 - À vista com desconto de 14%");
					System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
					System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
					System.out.println("");
					System.out.print("Forma de Pagamento ");
					pag = i.nextInt();
							switch(pag) {
							case 1: 
								System.out.println("À vista");
								total = polo-(0.14*polo);
								System.out.print("Preço final do seu automóvel é: R$"+total);
								break;
							case 2: 
								System.out.println("Financiado em 48x");
								total = (polo+(0.16*polo))/48;
								System.out.print("Preço final do seu automóvel é: R$"+total);
								break;
							case 3: 
								System.out.println("Financiado em 60x");
								total = (polo+(0.18*polo))/60;
								System.out.print("Preço final do seu automóvel é: R$"+total);
								break; }
					break; //break do modelo POLO
					
				case 3: 
					System.out.println("Virtus");
					virtus = 79.999;
					System.out.println("");
					System.out.println("1 - À vista com desconto de 14%");
					System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
					System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
					System.out.println("");
					System.out.print("Forma de Pagamento ");
					pag = i.nextInt();
							switch(pag) {
							case 1: 
								System.out.println("À vista");
								total = virtus-(0.14*virtus);
								System.out.print("Preço final do seu automóvel é: R$"+total);
								break;
							case 2: 
								System.out.println("Financiado em 48x");
								total = (virtus+(0.16*virtus))/48;
								System.out.print("Preço final do seu automóvel é: R$"+total);
								break;
							case 3: 
								System.out.println("Financiado em 60x");
								total = (virtus+(0.18*virtus))/60;
								System.out.print("Preço final do seu automóvel é: R$"+total);
								break; } //break Pagamento
					
							break; //break do modelo VIRTUS
					//fim Volksvagem
				}
				break;
				case 2:		// inicio Toyota
					System.out.println("--Você escolheu Toyota--");
					System.out.println(" - Modelos Disponíveis-");
					System.out.println("");
					System.out.println("1 - Corolla Aut  - R$ 114.990,00");
					System.out.println("2 - Hilux diesel - R$ 193.279,00");
					System.out.println("3 - Prius        - R$ 117.619,00");
					System.out.println("");
					System.out.print("Escolha o modelo desejado: ");
					modelo = i.nextInt();

					switch(modelo) {
					case 1: 
						System.out.println("Corolla");
						corolla = 114.990;
						System.out.println("");
						System.out.println("1 - À vista com desconto de 14%");
						System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
						System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
						System.out.println("");
						System.out.print("Forma de Pagamento ");
						pag = i.nextInt();
								switch(pag) {
								case 1: 
									System.out.println("À vista");
									total = corolla-(0.14*corolla);
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 2: 
									System.out.println("Financiado em 48x");
									total = (corolla+(0.16*corolla))/48;
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 3: 
									System.out.println("Financiado em 60x");
									total = (corolla+(0.18*corolla))/60;
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break; } //break do case 3
						break; //break do modelo Corolla
					
					case 2: 
						System.out.println("Hilux");
						hilux = 193.279;
						System.out.println("");
						System.out.println("1 - À vista com desconto de 14%");
						System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
						System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
						System.out.println("");
						System.out.print("Forma de Pagamento ");
						pag = i.nextInt();
								switch(pag) {
								case 1: 
									System.out.println("À vista");
									total = hilux-(0.14*hilux);
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 2: 
									System.out.println("Financiado em 48x");
									total = (hilux+(0.16*hilux))/48;
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 3: 
									System.out.println("Financiado em 60x");
									total = (hilux+(0.18*hilux))/60;
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break; }
						break; //break do modelo Hilux
						
					case 3: 
						System.out.println("Prius");
						prius = 79.999;
						System.out.println("");
						System.out.println("1 - À vista com desconto de 14%");
						System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
						System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
						System.out.println("");
						System.out.print("Forma de Pagamento ");
						pag = i.nextInt();
								switch(pag) {
								case 1: 
									System.out.println("À vista");
									total = prius-(0.14*prius);
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 2: 
									System.out.println("Financiado em 48x");
									total = (prius+(0.16*prius))/48;
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 3: 
									System.out.println("Financiado em 60x");
									total = (prius+(0.18*prius))/60;
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break; } //break Pagamento
						
								break; //break do modelo Prius
						//fim Toyota
					}
					break;
				case 3:		// inicio BMW
					System.out.println("--Você escolheu BMW--");
					System.out.println(" -Modelos Disponíveis-");
					System.out.println("");
					System.out.println("1 - BMW X3  - R$ 309.950,00");
					System.out.println("2 - BMW X1  - R$ 191.950,00");
					System.out.println("3 - BMW X6  - R$ 498.500,00");
					System.out.println("");
					System.out.print("Escolha o modelo desejado: ");
					modelo = i.nextInt();

					switch(modelo) {
					case 1: 
						System.out.println("BMW X3");
						x3 = 309.950;
						System.out.println("");
						System.out.println("1 - À vista com desconto de 14%");
						System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
						System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
						System.out.println("");
						System.out.print("Forma de Pagamento ");
						pag = i.nextInt();
								switch(pag) {
								case 1: 
									System.out.println("À vista");
									total = x3-(0.14*x3);
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 2: 
									System.out.println("Financiado em 48x");
									total = (x3+(0.16*x3))/48;
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 3: 
									System.out.println("Financiado em 60x");
									total = (x3+(0.18*x3))/60;
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break; } //break do case 3
					break; //break do modelo X3
					
					case 2: 
						System.out.println("BMW X1");
						x1 = 191.950;
						System.out.println("");
						System.out.println("1 - À vista com desconto de 14%");
						System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
						System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
						System.out.println("");
						System.out.print("Forma de Pagamento ");
						pag = i.nextInt();
								switch(pag) {
								case 1: 
									System.out.println("À vista");
									total = x1-(0.14*x1);
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 2: 
									System.out.println("Financiado em 48x");
									total = (x1+(0.16*x1))/48;
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 3: 
									System.out.println("Financiado em 60x");
									total = (x1+(0.18*x1))/60;
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break; }
					break; //break do modelo X1
						
					case 3: 
						System.out.println("BMW X6");
						x6 = 498.500;
						System.out.println("");
						System.out.println("1 - À vista com desconto de 14%");
						System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
						System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
						System.out.println("");
						System.out.print("Forma de Pagamento ");
						pag = i.nextInt();
								switch(pag) {
								case 1: 
									System.out.println("À vista");
									total = x6-(0.14*x6);
									System.out.print("Preço final do seu automóvel é: R$"+total);
									break;
								case 2: 
									System.out.println("Financiado em 48x");
									total = (x6+(0.16*x6))/48;
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break;
								case 3: 
									System.out.println("Financiado em 60x");
									total = (x6+(0.18*x6))/60;
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break; } //break Pagamento
						
								break; //break do modelo X6
					
					}
				break;//fim BMW
				
				case 4:		// inicio Chevrolet
					System.out.println("-Você escolheu Chevrolet-");
					System.out.println(" - Modelos Disponíveis-");
					System.out.println("");
					System.out.println("1 - Cruze Aut  - R$ 98.890,00");
					System.out.println("2 - Prisma     - R$ 59.990,00");
					System.out.println("3 - Onix Aut   - R$ 65.290,00");
					System.out.println("");
					System.out.print("Escolha o modelo desejado: ");
					modelo = i.nextInt();

					switch(modelo) {
					case 1: 
						System.out.println("Cruze");
						cruze = 98.890;
						System.out.println("");
						System.out.println("1 - À vista com desconto de 14%");
						System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
						System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
						System.out.println("");
						System.out.print("Forma de Pagamento ");
						pag = i.nextInt();
								switch(pag) {
								case 1: 
									System.out.println("À vista");
									total = cruze-(0.14*cruze);
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break;
								case 2: 
									System.out.println("Financiado em 48x");
									total = (cruze+(0.16*cruze))/48;
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break;
								case 3: 
									System.out.println("Financiado em 60x");
									total = (cruze+(0.18*cruze))/60;
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break; } //break do case 3
						break; //break do modelo Cruze
					
					case 2: 
						System.out.println("Prisma");
						prisma = 59.990;
						System.out.println("");
						System.out.println("1 - À vista com desconto de 14%");
						System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
						System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
						System.out.println("");
						System.out.print("Forma de Pagamento ");
						pag = i.nextInt();
								switch(pag) {
								case 1: 
									System.out.println("À vista");
									total = prisma-(0.14*prisma);
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break;
								case 2: 
									System.out.println("Financiado em 48x");
									total = (prisma+(0.16*prisma))/48;
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break;
								case 3: 
									System.out.println("Financiado em 60x");
									total = (prisma+(0.18*prisma))/60;
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break; }
						break; //break do modelo prisma
						
					case 3: 
						System.out.println("Onix");
						onix = 65.290;
						System.out.println("");
						System.out.println("1 - À vista com desconto de 14%");
						System.out.println("2 - Financiado em 48x, acréscimo de 16% no valor total");
						System.out.println("3 - Financiado em 60x, acréscimo de 18% no valor total");
						System.out.println("");
						System.out.print("Forma de Pagamento ");
						pag = i.nextInt();
								switch(pag) {
								case 1: 
									System.out.println("À vista");
									total = onix-(0.14*onix);
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break;
								case 2: 
									System.out.println("Financiado em 48x");
									total = (onix+(0.16*onix))/48;
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break;
								case 3: 
									System.out.println("Financiado em 60x");
									total = (onix+(0.18*onix))/60;
									System.out.print("Preço final do seu automóvel é: R$ "+total);
									break; } //break Pagamento
						
								break; //break do modelo Onix
						//fim Chevrolet
					}
					break;
			}
			
			System.out.println("\nObrigado pela preferencia Sr "+nome);
			System.out.println("Tenha um bom dia!");
		
		}

	}
