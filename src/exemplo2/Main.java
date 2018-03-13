package exemplo2;

import exemplo2.classes.API;
import exemplo2.classes.APIAdapter;

public class Main {
	
	public static void main(String args[]) {
		
		APIAdapter api = new APIAdapter();
		
		System.out.println(api.ola());
		System.out.println(api.mundo());
		//Locais diferentes do código
		System.out.println(api.ola());
		System.out.println(api.mundo());
		//Locais diferentes do código
		System.out.println(api.ola());
		System.out.println(api.mundo());
		//Locais diferentes do código
		System.out.println(api.ola());
		System.out.println(api.mundo());
		//Locais diferentes do código
		System.out.println(api.ola());
		System.out.println(api.mundo());
	}
}
