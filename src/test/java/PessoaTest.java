import org.junit.Test;

import java.util.List;

public class PessoaTest {

    @Test
    public void testListaContemNomesFemininos() {
        List<String> nomes = Pessoa.listaDeNomes();
        boolean possuiNomesFemininos = nomes.stream().anyMatch(nome -> nome.toLowerCase().endsWith("- f"));
                   if (possuiNomesFemininos == true){
                       System.out.println("Há nomes femininos");
                   } else System.out.println("Não há nomes femininos");


    }
}
