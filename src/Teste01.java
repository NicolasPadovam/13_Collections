import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste01 {
    public static void main(String[] args) {

        List<Aluno> lista = new ArrayList<>();

        lista.add(new Aluno(5000,"Nicolas", "SI"));
        lista.add(new Aluno(5001,"BRKsEdu", "Gamer"));
        lista.add(new Aluno(5002,"CEGA ELES", "Vovó"));
        lista.add(new Aluno(5003,"Selmini", "SI"));
        lista.add(new Aluno(5004,"Selmini", "Professor"));

        //utilizar forEach
        lista.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("------Ordenado------");
        //Comparator.comparing(Classe::atributo).depoisCompare(Classe::Atributo);
        lista.sort(Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getCurso));

        lista.forEach(aluno -> System.out.println(aluno));


    }
}
