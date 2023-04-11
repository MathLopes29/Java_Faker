package gerador.mathlopes.dados;
import java.util.Locale;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GerarDados {
    private static final Faker faker = new Faker(Locale.forLanguageTag("pt-br"));
    public static void main(String[] args){

        for (int i = 1; i < 10001; i++){
            DadosPessoais DP = new DadosPessoais();

            DP.setId(i);
            DP.setNome(faker.name().fullName());
            DP.setNasc(faker.numerify("19##"));
            DP.setEnderCity(faker.address().cityName());
            DP.setTelefone(faker.numerify("## #####-####"));

            String Lista = "Id: " + DP.getId() + " - Nome:" + DP.getNome() + " - Ano Nascimento: " + DP.getNasc() + " - Cidade: " + DP.getEnderCity() + " - Telefone: " + DP.getTelefone();
            log.info(Lista);
        }
    }
}
