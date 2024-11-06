package XML_JSON;

import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory; 
import org.w3c.dom.Document; 
import org.w3c.dom.Element; 
import org.w3c.dom.NodeList; 

public class XMLRead 
{
    public static void main(String[] args) 
    {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("Pessoa.xml");
            document.getDocumentElement().normalize();
            Element root = document.getDocumentElement();
            
            System.out.println("Elemento raiz: " + root.getNodeName());
           
            NodeList NomeList = document.getElementsByTagName("Nome");
            System.out.println("Nome: " + NomeList.item(0).getTextContent());
            
            NodeList SobrenomeList = document.getElementsByTagName("Sobrenome");
            System.out.println("Sobrenome: " + SobrenomeList.item(0).getTextContent());
            
            NodeList IdadeList = document.getElementsByTagName("Idade");
            System.out.println("Idade: " + IdadeList.item(0).getTextContent());
         
            NodeList AlturaList = document.getElementsByTagName("Altura");
            System.out.println("Altura: " + AlturaList.item(0).getTextContent());
           
            NodeList PesoList = document.getElementsByTagName("Peso");
            System.out.println("Peso: " + PesoList.item(0).getTextContent());
           
            NodeList NacionalidadeList = document.getElementsByTagName("Nacionalidade");
            System.out.println("Nacionalidade: " + NacionalidadeList.item(0).getTextContent());
            
            NodeList EstadoList = document.getElementsByTagName("Estado");
            System.out.println("Estado: " + EstadoList.item(0).getTextContent());
            
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
    }
}
