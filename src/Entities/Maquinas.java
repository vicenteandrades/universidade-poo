package Entities;

import java.util.Objects;

public class Maquinas {
    private int id;
    private String marca;

    public Maquinas (int id, String marca){
        this.id = id;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Maquinas maquinas = (Maquinas) o;
        return id == maquinas.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Maquinas{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                '}';
    }
}
