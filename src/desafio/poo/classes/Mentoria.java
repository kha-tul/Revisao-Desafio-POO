package desafio.poo.classes;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String getTitulo() {
        return null;
    }

    @Override
    public void setTitulo(String titulo) {

    }

    @Override
    public String getDescricao() {
        return null;
    }

    @Override
    public void setDescricao(String descricao) {

    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
