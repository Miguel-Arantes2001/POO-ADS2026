package edificio;

import java.util.ArrayList;

public class Edificio {
    private String nome,endereco;
    private ArrayList<Apartamento> apartamentos = new ArrayList<Apartamento>();

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void construirApartamento(int numero, int andar){
        Apartamento ap = new Apartamento(numero,andar);
        apartamentos.add(ap);
    }

    public ArrayList<Apartamento> getApartamentos() {
        System.out.printf("Edifício %s",nome," :\n");
        return apartamentos;
    }
}
