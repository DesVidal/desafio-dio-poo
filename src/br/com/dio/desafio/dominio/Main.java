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
        curso2.setCargaHoraria(4);
        curso2.setDescricao("Curso de JavaScript");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso Introdutório de Desenvolvimento Java");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devJoana = new Dev();
        devJoana.setNome("Joana");
        devJoana.inscreverBottcamp(bootcamp);
        System.out.println("Contúdos inscritos Joana: " + devJoana.getConteudosInscritos());
        devJoana.progredir(); // a cada curso essa linha se repete para retirar um curso dos inscritos e incluiro nos concluídos e somar os xp
        devJoana.progredir();
        devJoana.progredir();
        System.out.println("-");
        System.out.println("Contúdos inscritos Joana: " + devJoana.getConteudosInscritos());
        System.out.println("Contúdos concluídos Joana: " + devJoana.getConteudosConcluidos());
        System.out.println("XP: " + devJoana.calcularXp());


        System.out.println("..........");


        Dev devFrancisco = new Dev();
        devFrancisco.setNome("Francisco");
        devFrancisco.inscreverBottcamp(bootcamp);
        System.out.println("Conteúdos inscritos Francisco: " + devFrancisco.getConteudosInscritos());
        devFrancisco.progredir();
        devFrancisco.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Francisco: " + devFrancisco.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Francisco: " + devFrancisco.getConteudosConcluidos());
        System.out.println("XP: " + devFrancisco.calcularXp());



    }
}
