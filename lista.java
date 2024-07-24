package afterferias;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class lista {

	public static void main(String[] args) {
		ArrayList<Integer> dez = new ArrayList<>();
		
		Random random = new Random();

		for(int a =0; a<10; a++) {
			int ran = random.nextInt(50);
			dez.add(ran);
			
		}
		
		System.out.println(dez);
		dez.remove(4);		
		
		for (int num : dez) {
			System.out.println(num);
		
		}
	}
}


