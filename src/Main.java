package XML_JSON;

public class Main
{
    public static void main(String[] args) 
    {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Brenda");
        pessoa1.setSobrenome("Giron");
        pessoa1.setIdade(17);
        pessoa1.setAltura(1.56);
        pessoa1.setPeso(48.0);
        pessoa1.setNacionalidade("Brasileira");
        pessoa1.setEstado("São Paulo");

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Sobrenome: " + pessoa1.getSobrenome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Peso: " + pessoa1.getPeso());
        System.out.println("Nacionalidade: " + pessoa1.getNacionalidade());
        System.out.println("Estado: " + pessoa1.getEstado());
    }
}