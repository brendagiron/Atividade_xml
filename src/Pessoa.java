package XML_JSON;

public class Pessoa
{
    private String Nome;
    private String Sobrenome;
    private int Idade;
    private double Altura;
    private double Peso;
    private String Nacionalidade;
    private String Estado;

    public Pessoa(){

    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        Nacionalidade = nacionalidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
            "Nome='" + Nome + '\'' +
            ", Sobrenome='" + Sobrenome + '\'' +
            ", Idade=" + Idade +
            ", Altura=" + Altura +
            ", Peso=" + Peso +
            ", Nacionalidade='" + Nacionalidade + '\'' +
            ", Estado='" + Estado + '\'' +
            '}';
}

}