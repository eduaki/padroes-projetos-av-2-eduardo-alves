import java.util.Arrays;
import java.util.List;

public class PassagemRodoviaria extends Passagem {

    public PassagemRodoviaria(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    @Override
    public String getModal() {
        return "Rodoviário";
    }

    @Override
    public double calcularTaxaEmbarque() {
        return getValorTarifa() * 0.03;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("Documento de identidade com foto");
    }
}