package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Curso;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
      Curso curso1= new Curso();
      curso1.setTitulo("curso java");
      curso1.setDescricao("descricao curso java");
      curso1.setCargaHoraria(8);

      Curso curso2= new Curso();
      curso2.setTitulo("curso js");
      curso2.setDescricao("descricao curso js");
      curso2.setCargaHoraria(6);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria de java");
      mentoria.setDescricao("descricao mentoria java");
      mentoria.setData(LocalDate.now());

      /*System.out.println(curso1);
      System.out.println(curso2);
      System.out.println(mentoria);*/



      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp java Developer");
      bootcamp.setDescricao("Descricao Bootcamp java Developer");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);

      Dev devCamila = new Dev();
      devCamila.increverBootcamp(bootcamp);

      devCamila.setNome("Camila");
      System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudoInscrito());

      devCamila.progredir();
      devCamila.progredir();


      System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudoInscrito());

      System.out.println("Conteudos concluidos Camila" + devCamila.getConteudoconcluido());
      System.out.println("XP;"+ devCamila.calcularTotalXP());

      System.out.println("...");


      Dev devJoao = new Dev();
      devJoao.increverBootcamp(bootcamp);
      devJoao.setNome("Joao");

      System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudoInscrito());

      devJoao.progredir();
      devJoao.progredir();


      System.out.println("Conteudos concluidos Joao" + devJoao.getConteudoconcluido());
      System.out.println("XP;"+ devJoao.calcularTotalXP());


      System.out.println("...");

      Dev devLaercio = new Dev();
      devLaercio.increverBootcamp(bootcamp);
      devLaercio.setNome("Laercio");

      System.out.println("Conteudos Inscritos Laercio" + devLaercio.getConteudoInscrito());
      devLaercio.progredir();
      System.out.println("Conteudos concluidos Laercio" + devLaercio.getConteudoconcluido());
      System.out.println("XP;"+ devLaercio.calcularTotalXP());



      Dev devFelipe = new Dev();
      devFelipe.increverBootcamp(bootcamp);
      devFelipe.setNome("Felipe");

      System.out.println("Conteudos Inscritos Felipe" + devFelipe.getConteudoInscrito());

      devFelipe.progredir();
      devFelipe.progredir();
      devFelipe.progredir();


      System.out.println("Conteudos concluidos Felipe" + devFelipe.getConteudoconcluido());
      System.out.println("XP;"+ devFelipe.calcularTotalXP());





    }

}
