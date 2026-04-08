package Exercicio2;

public class DevPleno extends Desenvolvedor {
    private int projetosEntregues;

    public DevPleno(int projetosEntregues,String nome, String linguagem, float salarioBase) {
        super(nome, linguagem, salarioBase);
        this.projetosEntregues = projetosEntregues;
    }

    @Override
    public void codar() {
        System.out.println("Pleno codando e fazendo Code Review");
    }

    public int getProjetosEntregues() {
        return projetosEntregues;
    }

    public void setProjetosEntregues(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }

    @Override
    public float calcularBonus() {
        return this.salarioBase*0.15f;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "projetosEntregues=" + projetosEntregues
                ;
    }
}
