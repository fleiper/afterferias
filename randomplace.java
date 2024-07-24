package afterferias;
import java.util.ArrayList;
import java.util.Random;
public class randomplace {

	public static void main(String[] args) {
		ArrayList<Integer> ale = new ArrayList<>();

		Random random = new Random();

		for(int i =0; i<5; i++) {
			int numeroAleatorio = random.nextInt(100);
			ale.add(numeroAleatorio);
		}
		for (int num : ale) {
			System.out.println(num);
		

		}
	}


}

