package Register;

import Entities.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cadastro {

    public static List<Disciplina> disciplinas = new ArrayList<>();
    public static List<Curso> cursos = new ArrayList<>();
    public static List<Laboratorio> laboratorios = new ArrayList<>();

    public static List<Laboratorio> CadastrarLaboratorio() throws Exception {
        for (int i = 1; i <= 4; i++) {
            laboratorios.add(new Laboratorio(i, 20));
        }
        for (int i = 5; i <= 11; i++) {
            laboratorios.add(new Laboratorio(i, 15));
        }
        laboratorios.add(new Laboratorio(12, 30));
        return laboratorios;
    }

    public static List<Disciplina> CadastrarDisciplina() throws Exception {
        disciplinas.add(new Disciplina("BES005", "Logica de programação e algoritmos"));
        disciplinas.add(new Disciplina("BES006", "Estrutura de dados"));
        disciplinas.add(new Disciplina("BES008", "Programação orientada a objetos"));
        disciplinas.add(new Disciplina("BES011", "Bancos de dados"));
        disciplinas.add(new Disciplina("BES012", "Engenharia de requisitos"));
        disciplinas.add(new Disciplina("BES020", "Programação para dispositivos moveis"));
        disciplinas.add(new Disciplina("BES026", "Sistemas distribuidos"));
        disciplinas.add(new Disciplina("BES038", "Inteligencia artificial"));
        disciplinas.add(new Disciplina("BES049", "Programação Web"));
        disciplinas.add(new Disciplina("BES048", "Programação Front End"));
        return disciplinas;
    }

    public static Set<Professor> CadastrarProfessor() throws Exception {
        Set<Professor> professores = new HashSet<>();
        String[] nomes = {
                "Professor 1", "Professor 2", "Professor 3", "Professor 4", "Professor 5",
                "Professor 6", "Professor 7", "Professor 8", "Professor 9", "Professor 10"
        };

        for (int i = 1; i <= 10; i++) {
            professores.add(new Professor(i, nomes[i], disciplinas.get(i)));
        }
        return professores;
    }

    public static List<Curso> CadastrarCurso(){
        cursos.add(new Curso("BES", "Bacharel em Engenharia de Software", 200));
        cursos.add(new Curso("ADS", "Análise e Desenvolvimento de Sistemas", 120));
        cursos.add(new Curso("JGD", "Jogos Digitais", 90));
        cursos.add(new Curso("GTI", "Gestão da Tecnologia da Informação", 40));
        cursos.add(new Curso("INF", "Informática", 20));
        cursos.add(new Curso("RDC", "Rede de Computadores", 30));
        return cursos;
    }

    public static void cadastrarAlunos(List<Curso> cursos) throws Exception {
        long matriculaInicial = 2022001;
        for (Curso curso : cursos) {
            for (int i = 1; i <= curso.getNumeroDeAlunos(); i++) {
                curso.adicionarAluno(new Aluno(matriculaInicial, "Aluno" + String.format("%03d", i)));
                matriculaInicial++;
            }
        }
    }

    public static void cadastrarSolicitacao(){

    }

}
