
import java.util.Arrays;
import java.util.List;

public class PassagemAerea extends Passagem {

    public PassagemAerea(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    @Override
    public String getModal() {
        return "Aéreo";
    }

    @Override
    public double calcularTaxaEmbarque() {
        return getValorTarifa() * 0.08;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList(
                "Documento de identidade com foto",
                "Bilhete eletrônico (e-ticket)"
        );
    }
}
