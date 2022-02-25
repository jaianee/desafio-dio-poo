import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devJaiane = new Dev();
        devJaiane.setNome("Jaiane");
        devJaiane.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Jaiane: " + devJaiane.getConteudosInscritos());

        devJaiane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jaiane: " + devJaiane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jaiane: " + devJaiane.getConteudoConcluido());
        System.out.println("XP: " + devJaiane.calcularXp());

    }
}
