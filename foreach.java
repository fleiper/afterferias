package afterferias;
import java.util.ArrayList;
import java.util.Arrays;
public class foreach {

	public static void main(String[] args) {
		String[] disciplinas = {"matematica", "filosofia", "historia", "fisica"};
		ArrayList<String> novalista = new ArrayList <String>(Arrays.asList(disciplinas));
		novalista.add("ingles");
		novalista.add("senai");
		novalista.add("roblox");
		novalista.add("minecraft");
		for (String i: novalista)
		{
			System.out.println("disciplina: "+i);
		}


	}

}
