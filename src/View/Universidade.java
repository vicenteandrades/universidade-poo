package View;

import Entities.Disciplina;
import Entities.Laboratorio;
import Entities.Professor;
import Entities.Solicitacao;
import Register.Cadastro;
import Services.IReserva;
import Services.Marcacao;
import Services.Reserva;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static Register.Cadastro.*;
import static Services.Marcacao.SolicitacaoMarcacao;

public class Universidade {
    public static void main(String[] args) throws Exception {
        System.out.println("\nLISTA DE CURSOS:\n ");

        for (var item : cursos){
            System.out.println(item);
        }

        System.out.println("\nLISTA DE DISCIPLINAS:\n ");

        for (var item : disciplinas){
            System.out.println(item);
        }

        System.out.println("\nLISTA DE LABORATORIOS:\n ");

        for (var item : laboratorios){
            System.out.println(item);
        }

        System.out.println("\nLISTA DE PROFESSORES\n");
        for (var item : professores){
            System.out.println(item);
        }

        IReserva reservaService = new Reserva();

        Solicitacao solicitacao = reservaService.solicitarReserva(professores.get(0), laboratorios.get(0), "15/04/2024", LocalTime.of(11,    15));

        System.out.println("\nProfessor, informe seu nome: " + solicitacao.getProfessor().getNome());
        System.out.println("Professor, informe qual laboratório deseja reservar: LAB" + solicitacao.getLabId());
        System.out.println("Professor, informe qual Data deseja reservar o laboratório: " + solicitacao.getDate());
        System.out.println("Horarios possiveis: " + solicitacao.getHorariosDisponiveis() );
        System.out.println("Professor informe o horário: " + solicitacao.getHours());

        SolicitacaoMarcacao(solicitacao);

    }
}
