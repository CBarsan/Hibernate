package presentation;

import dao.ServiceManager;
import metier.Service;

public class Main {

	public static void main(String[] args) {
		
		ServiceManager Service = new ServiceManager ();
		Service serv = new Service();
		Service s = new Service(2,"toto", "titi");
		Service.save(s);
		
		serv = ServiceManager.serviceGet(2);
		
		System.out.println(serv.getInterlocuteur());

	}

}
