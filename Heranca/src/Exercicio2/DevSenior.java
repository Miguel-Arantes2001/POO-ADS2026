package Exercicio2;

public class DevSenior extends Desenvolvedor {
    private float verbaLider;

    public DevSenior(float verbaLider,String nome, String linguagem, float salarioBase) {
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }

    @Override
    public void codar() {
        System.out.println("Senior define arquitetura e lidera pessoas");
    }

    @Override
    public float calcularBonus() {
        return this.salarioBase * 0.30f;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "verbaLider=" + verbaLider
                ;
    }
}
