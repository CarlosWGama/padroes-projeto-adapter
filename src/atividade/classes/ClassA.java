package atividade.classes;

import java.util.ArrayList;

public class ClassA {

	protected ArrayList<String> nomes = new ArrayList<String>();
	
	public ClassA () {
		nomes.add("Carlos");
		nomes.add("José");
	}
	
	public ArrayList<String> getNomes() {
		return nomes;
	}
}


