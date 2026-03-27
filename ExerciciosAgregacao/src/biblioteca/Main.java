package biblioteca;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor(1,"José");
        Livro livro = new Livro(1,"O Hobbit","Tolkien");

        LocalDateTime dataEmprestimo = LocalDateTime.of(2026,03,27,10,00);
        LocalDateTime dataDevolucao = LocalDateTime.of(2026,04,27,10,00);
        Emprestimo emprestimo = new Emprestimo(dataEmprestimo,dataDevolucao,leitor,livro);
        System.out.println(emprestimo);
    }
}
