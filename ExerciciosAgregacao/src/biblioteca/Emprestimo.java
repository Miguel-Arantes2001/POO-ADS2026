package biblioteca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestimo,dataDevolucao;
    private Leitor leitor;
    private Livro livro;



    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucao,
                      Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.leitor = leitor;
        this.livro = livro;

    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Emprestimo:" +
                "\nData do empréstimo = " + dataEmprestimo.format(dtf) +
                ",\nData de devolução = " + dataDevolucao.format(dtf) +
                ",\nleitor = " + leitor.getNome() +
                "  ID : "+ leitor.getId() +
                ",\nlivro= " + livro.getNome()
                ;
    }
}
