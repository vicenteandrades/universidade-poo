package Entities;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;


public class Solicitacao {

    private Professor professor;
    private int idLaboratorio;
    private Date date;
    private LocalTime hours;

    public Solicitacao(Professor professor, int idLaboratorio, Date date, LocalTime hours) {
        this.professor = professor;
        this.idLaboratorio = idLaboratorio;
        this.date = date;
        this.hours = hours;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getHours() {
        return hours;
    }

    public void setHours(LocalTime hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Solicitacao{" +
                "professor=" + professor +
                ", idLaboratorio=" + idLaboratorio +
                ", date=" + date +
                ", hours=" + hours +
                '}';
    }
}
