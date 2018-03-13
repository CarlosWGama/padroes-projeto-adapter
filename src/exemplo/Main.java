package exemplo;

import exemplo.classes.PlugAdapter;
import exemplo.classes.TomadaBrasileira;

public class Main {

	public static void main(String[] args) {
		PlugAdapter plug = new PlugAdapter();
		TomadaBrasileira tomada = new TomadaBrasileira();
		tomada.ligaTomada(plug);
	}
}
