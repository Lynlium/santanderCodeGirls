import br.com.DIO.desafio.dominio.Bootcamp;
import br.com.DIO.desafio.dominio.Dev;
import br.com.DIO.desafio.dominio.Mentoria;
import br.com.DIO.desafio.dominio.Curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descrição curso js");
        curso1.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        mentoria1.setCargaHoraria(8);

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Code Girls");
        bootcamp.setDescricao("Processo seletivo para F1rst");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devMichelle = new Dev();
        devMichelle.setNome("Michelle");
        devMichelle.inscreverBootcamp(bootcamp);
         System.out.println("Conteúdos inscritos: " + devMichelle.getConteudosInscritos());
        devMichelle.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos: " + devMichelle.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devMichelle.getConteudosConcluidos());
        System.out.println("XP: " + devMichelle.calcularXp());

        System.out.println("-----------------------");

        Dev devSamira = new Dev();
        devSamira.setNome("Samira");
        devSamira.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devSamira.getConteudosInscritos());
        devSamira.progredir();
        devSamira.progredir();
        devSamira.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos: " + devSamira.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devSamira.getConteudosConcluidos());
        System.out.println("XP: " + devSamira.calcularXp());



    }
}