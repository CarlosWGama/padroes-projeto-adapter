package atividade.classes;

public class ClassB {

	protected String[] nomes;
	
	public void useNomes(ClassAAdapter obj) {
		//Retorna ArrayList, quando esperado um vetor[]
		this.nomes = obj.getNomesVetor();
	}
}
