
import Entities.Disciplina;
import Entities.Laboratorio;
import Entities.Professor;
import Entities.Solicitacao;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;
import java.util.Optional;

import static Register.Cadastro.CadastrarLaboratorio;
import static Register.Cadastro.laboratorios;

public class Universidade {
    public static void main(String[] args) throws Exception {

        Disciplina d1 = new Disciplina("LPA", "Lógica e algoritmo");
        Professor fernando = new Professor(1, "Fernando", d1);
        Date testeDate = new Date(2024, 06, 10);
        Solicitacao solicitacao = new Solicitacao(fernando, 2, testeDate, LocalTime.of(9, 0));

        Optional<Laboratorio> testemarcacao = CadastrarLaboratorio()
                .stream()
                .filter(x -> x.getId() == solicitacao.getIdLaboratorio())
                .findFirst();

        if (testemarcacao.isPresent()) {
            testemarcacao.get().MarcarHorario(solicitacao);
        } else {
            System.out.println("Horário indisponivel");
        }

        System.out.println(testemarcacao);


    }
}
