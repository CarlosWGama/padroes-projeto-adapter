package atividade.classes;

public class ClassB {

	protected String[] nomes;
	
	public void useNomes(ClassA obj) {
		//Retorna ArrayList, quando esperado um vetor[]
		this.nome = obj.getNomes();
	}
}
