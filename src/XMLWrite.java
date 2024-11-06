package XML_JSON;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class XMLWrite 
{
    public static void main(String[] args) throws ParserConfigurationException, TransformerException 
    {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.newDocument();

        Element rootElement = document.createElement("Pessoa");
        document.appendChild(rootElement);

        Element Nome = document.createElement("Nome");
        Nome.appendChild(document.createTextNode("Giovanni"));
        rootElement.appendChild(Nome);

        Element Sobrenome = document.createElement("Sobrenome");
        Sobrenome.appendChild(document.createTextNode("Zorzetto"));
        rootElement.appendChild(Sobrenome);

        Element Idade = document.createElement("Idade");
        Idade.appendChild(document.createTextNode("17"));
        rootElement.appendChild(Idade);

        Element Altura = document.createElement("Altura");
        Altura.appendChild(document.createTextNode("1.72"));
        rootElement.appendChild(Altura);

        Element Peso = document.createElement("Peso");
        Peso.appendChild(document.createTextNode("68.0"));
        rootElement.appendChild(Peso);

        Element Nacionalidade = document.createElement("Nacionalidade");
        Nacionalidade.appendChild(document.createTextNode("Brasileira"));
        rootElement.appendChild(Nacionalidade);

        Element Estado = document.createElement("Estado");
        Estado.appendChild(document.createTextNode("São Paulo"));
        rootElement.appendChild(Estado);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult("Pessoa.xml");

        transformer.transform(source, result);

        System.out.println("Arquivo XML criado com sucesso!");
    }
}
