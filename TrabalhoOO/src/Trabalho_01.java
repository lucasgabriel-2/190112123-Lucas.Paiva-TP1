import java.util.Scanner;

public class Trabalho_01 {
	
	private static final Object[] String = null;

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome[] = new String[1000];
		String endereco[] = new String[1000];
		int[]  telefone = new int [1000];
		
		nome[0] = "Alice";
		nome[1] = "Lucas";
		nome[2] = "Pedro";
		nome[3] = "Vinicius";
		nome[4] = "Carlos";
		nome[5] = "Bruno";
		nome[6] = "Amanda";
		nome[7] = "Marta";
		nome[8] = "Clea";
		nome[9] = "Geovana";
		
		endereco[0] = "Cruzeiro";
		endereco[1] = "Taguatinga";
		endereco[2] = "Gama";
		endereco[3] = "Guara";
		endereco[4] = "Brasilia";
		endereco[5] = "Samambaia";
		endereco[6] = "Ceilandia";
		endereco[7] = "Plano";
		endereco[8] = "Asa";
		endereco[9] = "Candangolandia";
		
		telefone[0] = 1010;	
		telefone[1] = 0001;
		telefone[2] = 0010;
		telefone[3] = 0011;
		telefone[4] = 0100;
		telefone[5] = 0101;
		telefone[6] = 0110;
		telefone[7] = 0111;
		telefone[8] = 1000;
		telefone[9] = 1001;
		
		
		String nomeProduto[] = new String[1000];
		String descricao[] = new String[1000];
		double[]  valor = new double [1000];
		double[]  porcentagemLucro = new double [1000];
		int[]  estoque = new int [1000];
		
		nomeProduto[0] = "porta";
		nomeProduto[1] = "geladeira";
		nomeProduto[2] = "computador";
		nomeProduto[3] = "televisao";
		nomeProduto[4] = "microondas";
		nomeProduto[5] = "mouse";
		nomeProduto[6] = "celular";
		nomeProduto[7] = "caderno";
		nomeProduto[8] = "teclado";
		nomeProduto[9] = "cadeira";
		
		descricao[0]= "sala";
		descricao[1]= "prata";
		descricao[2]= "rapido";
		descricao[3]= "bom";
		descricao[4]= "branco";
		descricao[5]= "verde";
		descricao[6]= "apple";
		descricao[7]= "pratico";
		descricao[8]= "mecanico";
		descricao[9]= "gamer";
	
		
		valor[0] = 1000;
		valor[1] = 3000;
		valor[2] = 5000;
		valor[3] = 2000;
		valor[4] = 1000;
		valor[5] = 100;
		valor[6] = 6000;
		valor[7] = 30;
		valor[8] = 300;
		valor[9] = 2000;
		
		
		porcentagemLucro[0]=100;
		porcentagemLucro[1]=10;
		porcentagemLucro[2]=20;
		porcentagemLucro[3]=30;
		porcentagemLucro[4]=40;
		porcentagemLucro[5]=50;
		porcentagemLucro[6]=60;
		porcentagemLucro[7]=70;
		porcentagemLucro[8]=80;
		porcentagemLucro[9]=90;
		
		
		estoque[0] = 10;
		estoque[1] = 1;
		estoque[2] = 2;
		estoque[3] = 3;
		estoque[4] = 4;
		estoque[5] = 5;
		estoque[6] = 6;
		estoque[7] = 7;
		estoque[8] = 8;
		estoque[9] = 9;
		
		int acao;
		acao = 0;
		
		while (acao != 7) {			
			
			System.out.println("\nMenu:");
			System.out.println("Digite 1 para cadastrar novos clientes:");
			System.out.println("Digite 2 para busca por cliente:");
			System.out.println("Digite 3 para cadastro de novo produto:");
			System.out.println("Digite 4 para busca por produto:");
			System.out.println("Digite 5 para cadastro de venda:");
			System.out.println("Digite 6 para mostrar produtos em estoque:");
			System.out.println("Digite 7 para sair:\n");
			
			acao = ler.nextInt();
			
			
			int qtdClientes;
			qtdClientes = 0;
			
			if(acao == 1) {
								
				
				System.out.println("Quantos clientes deseja cadastrar?");
				qtdClientes = ler.nextInt();
				
						
				for(int i=0; i < qtdClientes; i++){
					
					ler.nextLine();
					
					System.out.println("Qual o nome do " + (i+11) + "º cliente?");
					nome [10+i] = ler.nextLine();	
					
					System.out.println("Qual o endereco do " + (i+11) + "º cliente?");
					endereco [10+i] = ler.nextLine();	
					
					System.out.println("Qual o telefone do " + (i+11) + "º cliente?");
					telefone [10+i] = ler.nextInt();	
					
				}
				
				
			}
			
			if(acao == 2) {				
				
					ler.nextLine();
					
					int verifica;
					int aux;
					verifica = 0;
					aux = 0;
					
					System.out.println("Qual o nome do cliente que deseja buscar?");
					String nomeBusca = ler.nextLine();
					
					for(int i = 0; i < 1000; i++) {
						
						if(nomeBusca.equals(nome[i])) {
							verifica = 1;
							aux = i;
						}				
						
						
					}
					
					
					if( verifica == 1 ) {
						System.out.println("Nome: " + nome[aux] + " encontrado!");
						System.out.println("Endereco: " + endereco[aux]);
						System.out.println("Telefone: " + telefone[aux]);
						
						System.out.println("Deseja alterar dados do cliente em questao? Digite 1 para sim e 0 para nao");
						int pergunt;
						pergunt = 0;
						pergunt = ler.nextInt();
						
						ler.nextLine();
						
						if(pergunt == 1) {
							
							System.out.println("Qual o novo endereco do cliente?");
							endereco [aux] = ler.nextLine();	
							
							System.out.println("Qual o novo telefone do cliente?");
							telefone [aux] = ler.nextInt();	
							
							System.out.println("Os dados foram alterados!");
							
						}
						
									
						
					}else {
						System.out.println("Cliente nao encontrado!");			
						
					}
						
			 }
			
			
			int qtdProdutos;
			qtdProdutos = 0;
			
			if(acao == 3) {
				
				
				System.out.println("Quantos produtos deseja cadastrar?");
				qtdProdutos = ler.nextInt();				
						
				for(int i=0; i < qtdProdutos; i++){
					
					ler.nextLine();
					
					System.out.println("Qual o nome do " + (i+11) + "º produto?");
					nomeProduto [10+i] = ler.nextLine();	
					
					System.out.println("Qual a descricao do " + (i+11) + "º produto?");
					descricao [10+i] = ler.nextLine();	
					
					System.out.println("Qual o valor do " + (i+11) + "º produto em reais ? (obs.:utilize virgula para representar numeros decimais)");
					valor [10+i] = ler.nextDouble();
					
					System.out.println("Qual o porcentagem de lucro do " + (i+11) + "º produto em % ? (obs.:utilize virgula para representar numeros decimais)");
					porcentagemLucro [10+i] = ler.nextDouble();	
					
					System.out.println("Qual a quantidade em estoque do " + (i+11) + "º produto?");
					estoque [10+i] = ler.nextInt();	
					
				}
				
				
				
			}
			
			
			if(acao == 4) {
				
				ler.nextLine();
				
				int verific;
				int auxilia;
				verific = 0;
				auxilia = 0;
				
				System.out.println("Qual o nome do produto que deseja buscar?");
				String produtoBuscar = ler.nextLine();
				
				for(int i=0;i<1000;i++) {
					
					if(produtoBuscar.equals(nomeProduto[i])) {
						verific = 1;
						auxilia = i;
					}				
					
					
				}
				
				
				if( verific == 1 ) {
					System.out.println("Produto:" + nomeProduto[auxilia] + " encontrado!");
					System.out.println("Descricao:" + descricao[auxilia]);
					System.out.println("Valor:" + valor[auxilia]);
					System.out.println("Porcentagem:" + porcentagemLucro[auxilia] );
					System.out.println("Estoque:" + estoque[auxilia] );
					
					System.out.println("Deseja alterar dados do produto em questao? Digite 1 para sim e 0 para nao");
					int per;
					per = 0;
					per = ler.nextInt();
					
					ler.nextLine();
					
					if(per == 1) {
						
						System.out.println("Qual a nova descricao do produto?");
						descricao [auxilia] = ler.nextLine();	
						
						System.out.println("Qual o novo valor do produto?");
						valor [auxilia] = ler.nextDouble();	
						
						System.out.println("Qual a nova porcentagem de lucro do produto?");
						porcentagemLucro [auxilia] = ler.nextDouble();
						
						System.out.println("Qual o novo estoque do produto?");
						estoque [auxilia] = ler.nextInt();
						
						System.out.println("Os dados foram alterados!");
						
					}
					
								
					
				}else {
					System.out.println("Produto nao encontrado!");			
					
				}
						
			}
			
			if(acao == 5) {
				
				int continuar;
				continuar = 1;
				
				while(continuar == 1){
				
				System.out.println("Escolha um dos clientes a seguir digitando o numero correspondente");
				System.out.println("Lista de clientes:");
				
				for(int i=0; i<(10+qtdClientes); i++){
					
					System.out.println((i+1) + "º Cliente: "+ nome[i]);
					
				}
				
				int selecao;
				selecao = ler.nextInt();
				selecao = selecao - 1;
				
				
				System.out.println("Escolha um dos produtos a seguir digitando o numero correspondente");
				System.out.println("Lista de produtos:");
				
				for(int i=0; i<(qtdProdutos+10); i++){
					
					System.out.println((i+1) + "º Produto: "+ nomeProduto[i]);
					
				}
				
				int escolher;
				escolher = ler.nextInt();
				escolher = escolher - 1;
				
				System.out.println("Quantos produtos desse foram vendidos para o cliente em questao?");
				int qtdVendas;
				qtdVendas = ler.nextInt();
				
				estoque[escolher] = estoque [escolher] - qtdVendas;
				
				System.out.println("Deseja continuar comprando? Digite 1 para sim e 0 para nao");
				continuar = ler.nextInt();
				}
							
			}
			
			if(acao == 6) {
				
				System.out.println("Produtos em estoque no momento:");
				for(int i=0; i<(qtdProdutos+10); i++){
					
					System.out.println((i+1) + "º Produto: "+ nomeProduto[i] +", quantidade em estoque: " +estoque[i]);

					
				}
				
			}
			
			
		}

	
	}

}
