package Exercicio2;

public class DevJunior extends Desenvolvedor {
    private String mentor;

    public DevJunior(String mentor,String nome, String linguagem, float salarioBase) {
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "mentor='" + mentor + '\''
                ;
    }

    @Override
    public void codar() {
        System.out.println("DevJunior criando código com a mentoria de "+this.mentor);
    }


    public float calcularBonus() {
        return  super.calcularBonus();
    }
}
