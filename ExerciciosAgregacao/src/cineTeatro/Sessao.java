package cineTeatro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sessao {
    private int id,sala;
    private LocalDateTime data;
    Filme filme;
    private ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();

    public Sessao(int id, int sala, LocalDateTime data) {
        this.id = id;
        this.sala = sala;
        this.data = data;

    }

    public void vinvularFilme (Filme filme){
        this.filme = filme;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco){
        Ingresso novoIngresso = new Ingresso(id,assento,tipo,preco);
        ingressos.add(novoIngresso);
    }

    public void exibirSessao(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy às hh:mm");
        System.out.println("Cinema Moviecom\n");
        System.out.println("Filme: "+filme.getTitulo());
        System.out.println("Sala: "+this.sala);
        System.out.println("data: "+this.data.format(dtf));

        System.out.println("Ingressos vendidos: ");
        for(Ingresso ingresso: ingressos){
            System.out.println(ingresso);
            System.out.println();
        }
    }
}
