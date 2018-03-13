package exemplo;

import exemplo.classes.PlugAmericano;
import exemplo.classes.TomadaBrasileira;

public class Main {

	public static void main(String[] args) {
		PlugAmericano plug = new PlugAmericano();
		TomadaBrasileira tomada = new TomadaBrasileira();
		tomada.ligaTomada(plug);
	}
}
