package aula__2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ConversorXML {

	public static void main(String args[]) {
		
		List<Cliente> lista = new ArrayList<Cliente>();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(123);
		cliente.setDataNascimento(new Date());
		cliente.setNome("EMERSON");
		
		Cliente cliente2 = new Cliente();
		cliente2.setCodigo(321);
		cliente2.setDataNascimento(new Date());
		cliente2.setNome("ADRIANE");
		
		lista.add(cliente);
		lista.add(cliente2);
		

		XStream xstream = new XStream(new DomDriver()); 
		String res = xstream.toXML(lista);
		
		System.out.println(res);
		
		
	}

}
