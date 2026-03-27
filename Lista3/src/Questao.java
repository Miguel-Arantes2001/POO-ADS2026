
public class Questao {
    int numero;
    String enunciado;
    float valor;

    public Questao(int numero, String enunciado, float valor) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String toString(){
        return  "\n   Questão " + numero +
                " | Valor: " + valor +
                "\n   " + enunciado;
    }
}

