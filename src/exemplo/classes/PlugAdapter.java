package exemplo.classes;

public class PlugAdapter 
					extends PlugAmericano 
					implements IPlugBrasil {

	@Override
	public void usaTomada3Pinos() {
		this.usaTomada2Pinos();
	}
}


