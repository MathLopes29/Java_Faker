package gerador.mathlopes.dados;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DadosPessoais {

    private int id;
    private String Nome;
    private String Nasc;
    private String EnderCity;
    private String Telefone;
}
