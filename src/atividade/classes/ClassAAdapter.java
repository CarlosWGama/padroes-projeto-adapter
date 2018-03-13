package atividade.classes;

import java.util.ArrayList;

public class ClassAAdapter extends ClassA {

	
	public String[] getNomesVetor() {
		ArrayList<String> nomesArray = this.getNomes();
		String[] nomesVetor = new String[nomesArray.size()];
		
		for (int i = 0; i < nomesArray.size(); i++) 
			nomesVetor[i] = nomesArray.get(i);
		return nomesVetor;
	}
}
