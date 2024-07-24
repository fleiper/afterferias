package afterferias;
import java.util.ArrayList;
import java.util.Random;
public class second {

	public static void main(String[] args) {
		ArrayList<Integer> dez = new ArrayList<>();
		
		Random random = new Random();

		for(int a =0; a<10; a++) {
			int ran = random.nextInt(50);
			dez.add(ran);
			
		}
		System.out.println(dez);
		
		
		for (int num : dez) {
			System.out.println(num*2);
		
		
	}
	}
}
