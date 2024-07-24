package afterferias;
import java.util.ArrayList;
public class threeonethree {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
	
		
		numeros.add(10); //saiuda:10
		numeros.add(20); //saiuda:20
		
		System.out.println("primeiro adicionado: "+numeros.get(0));
		System.out.println("segundo adicionado: "+numeros.get(1));
		
		numeros.set(1,25); //saiuda: 25
		System.out.println("trocando o valor da caixa 1 para: "+numeros.get(1));
		
		numeros.remove(0); //saiuda: 25
		System.out.println("agora o valor da 0 será é: "+numeros.get(0)+" pois o antigo valor foi deletado");
		
		
		System.out.println("ao total sobrou "+numeros.size()+" valor"); //saida: 2
		
		

	}

}
