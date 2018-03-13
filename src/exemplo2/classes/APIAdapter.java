package exemplo2.classes;

public class APIAdapter extends API {
	
	private API api = new API();
	
	public String ola() {
		return api.hello();
	}
	
	public String mundo() {
		return api.world();
	}
}


