
public class Teste {

	public static void main(String[] args) {
		
		
		
		Produto prod1 = new Produto();
		Produto prod2 = new Produto("Testando m�todos estruturados");
		Produto prod3 = new Produto("Notebook Gen�rico",1500.00);
		
		prod1.descricao = "Notebook Intel";
		prod1.valor = 7000.00;
        
		prod2.valor = 1500.00;
		
		
		System.out.println("Produto 1: " + prod1.descricao);
		System.out.printf("O valor do produto � R$ %.2f \n ", prod1.valor);
		
		System.out.println("Produto 2 : " + prod2.descricao);
		System.out.printf("O valor do produto � R$ %.2f \n ", prod2.valor);
		
		System.out.println("Produto 3: " + prod3.descricao);
		System.out.printf("O valor do produto � R$ %.2f \n ", prod3.valor);
		
	
		
		
	}

}
