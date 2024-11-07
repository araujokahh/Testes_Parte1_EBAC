
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    public static List<String> listaDeNomes() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Adriana - F");
        nomes.add("Pâmela - F");
        nomes.add("Karina - F");
        nomes.add("Beatriz - F");
        nomes.add("Gonzales - M");
        nomes.add("Isa - F");
        nomes.add("Gustavo - M");
        nomes.add("Felipe - M");

        return nomes;
    }

    public static void main(String[] args) {
        listaDeNomes().forEach(System.out::println);
    }
}