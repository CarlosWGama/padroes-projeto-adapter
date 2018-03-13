package atividade;

import atividade.classes.ClassA;
import atividade.classes.ClassAAdapter;
import atividade.classes.ClassB;

public class Main {

	public static void main(String[] args) {
		ClassAAdapter classA = new ClassAAdapter();
		ClassB classB = new ClassB();
		classB.useNomes(classA);
	}

}
