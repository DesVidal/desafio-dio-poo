package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Curso de Java e Orientação a Objeto");

        Curso curso2= new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setCargaHoraria(8);
        curso2.setDescricao("Curso de JavaScript");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
