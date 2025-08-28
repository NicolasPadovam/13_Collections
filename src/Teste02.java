import java.util.HashSet;
import java.util.Set;

public class Teste02 {
    public static void main(String[] args) {

        Set<Aluno> lista = new HashSet<>();

        lista.add(new Aluno(5000,"Nicolas", "SI"));
        lista.add(new Aluno(5001,"BRKsEdu", "Gamer"));
        lista.add(new Aluno(5002,"CEGA ELES", "Vovó"));
        lista.add(new Aluno(5003,"Selmini", "SI"));
        lista.add(new Aluno(5004,"Selmini", "Professor"));

        lista.forEach(aluno -> System.out.println(aluno));

    }
}
