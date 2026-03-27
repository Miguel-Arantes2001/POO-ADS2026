package cineTeatro;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Filme batman = new Filme(1,180,"Ação","Batman");
        Filme duna = new Filme(2,190,"Aventura","Duna 3");

        LocalDateTime dataFilme = LocalDateTime.of(2026,04,05,20,00);
        Sessao sessao = new Sessao(1,01,dataFilme);
        sessao.vinvularFilme(batman);

        sessao.venderIngresso(1,"A1","Meia",15);
        sessao.venderIngresso(2,"A2","Inteira",30);
        sessao.venderIngresso(3,"A3","Meia",15);

        sessao.exibirSessao();
    }
}
