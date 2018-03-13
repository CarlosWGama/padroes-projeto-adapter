package atividade;

import atividade.classes.ClassA;
import atividade.classes.ClassB;

public class Main {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		classB.useNomes(classA);
	}

}
