package projetoSoftware;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores = new ArrayList<Programador>();

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
    }

    public void adicionarProgramador(Programador programador){
        programadores.add(programador);
    }
    public ArrayList<Programador> getProgramadores() {
        System.out.println("Programadores: ");
        return programadores;
    }
}
