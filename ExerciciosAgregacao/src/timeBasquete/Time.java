package timeBasquete;

import java.util.ArrayList;

public class Time {
    private String nome,tecnico;
    private int id;
    private ArrayList<Atleta> atletas = new ArrayList<Atleta>();

    public Time(String nome, String tecnico, int id) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.id = id;
        this.atletas = atletas;
    }

    public void contratarAtleta(Atleta atleta){
        atletas.add(atleta);
    }

    public ArrayList<Atleta> getAtletas() {
        System.out.println("Atletas: ");
        return atletas;
    }
}
