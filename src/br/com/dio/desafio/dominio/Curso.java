package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    // modificadores de acesso (visibulidade): public, private e protected. Default, se eu ñ colocar nada, é public
    // foi criada a classe mão Conteudo que contém o título e a descrição. Por isso esses atrubutos foram suprimidos daqui
   private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
