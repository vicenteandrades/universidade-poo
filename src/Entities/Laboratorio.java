package Entities;

import java.time.LocalTime;
import java.util.*;

public class Laboratorio {
    private int id;
    private int capacidade;
    private List<LocalTime> horariosDisponiveis;

    public Laboratorio(int id, int capacidade) throws Exception {

        if(id > 12 || id <= 0){
            throw new Exception("LAB 1 ao 12");
        }

        this.id = id;
        this.capacidade = capacidade;

        this.horariosDisponiveis = new ArrayList<>(Arrays.asList(
                LocalTime.of(8, 0),
                LocalTime.of(9, 0),
                LocalTime.of(10, 0),
                LocalTime.of(11, 0),
                LocalTime.of(12, 0),
                LocalTime.of(13, 0),
                LocalTime.of(14, 0),
                LocalTime.of(15, 0),
                LocalTime.of(16, 0),
                LocalTime.of(17, 0)
        ));
    }

    public void MarcarHorario(Solicitacao solicitacao) throws Exception {
        var horario = solicitacao.getHours();

        if(horariosDisponiveis.contains(solicitacao.getHours()) )
        {
            System.out.println("marcação realizada com sucesso!");
            horariosDisponiveis.remove(horario);
        }else {
            throw new Exception("Não podemos cadastrar, pois não o horario não está disponivel");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "id=" + id +
                ", capacidade=" + capacidade +
                ", horariosDisponiveis=" + horariosDisponiveis +
                '}';
    }
}
