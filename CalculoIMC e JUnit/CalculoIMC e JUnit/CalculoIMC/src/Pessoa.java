
public class Pessoa {

    double altura;
    double peso;
    String nome;
    char sexo;
    Calculo c1 = new Calculo();

    public void Calcular() {
        c1.calcularIMC(peso, altura, nome, sexo);
    }

    public Pessoa() {
    }

    public Pessoa(double altura, double peso, String nome, char sexo) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
