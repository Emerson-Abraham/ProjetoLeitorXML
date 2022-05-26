package aula__2;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XMLConversor {

	public static void main(String[] args) {

		String xmlDeTeste = "<list><cliente><nome>EMERSON</nome>"
				+ "<codigo>123</codigo> + <dataNascimento>2022-04-12 01:32:15.806 UTC</dataNascimento>" + "</cliente></list>";

		XMLConversor leitor = new XMLConversor();
		 List<Cliente> clientes = leitor.carrega(new StringReader(xmlDeTeste));

		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}


	}

	public List<Cliente> carrega(Reader fonte) {
		XStream stream = new XStream(new DomDriver());
		stream.alias("cliente", Cliente.class);
		return (List<Cliente>) stream.fromXML(fonte);
	}

}
