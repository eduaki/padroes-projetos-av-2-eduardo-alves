
import java.util.Arrays;
import java.util.List;

public class PassagemFerroviaria extends Passagem {

    public PassagemFerroviaria(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    @Override
    public String getModal() {
        return "Ferroviário";
    }

    @Override
    public double calcularTaxaEmbarque() {
        return getValorTarifa() * 0.05;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList(
                "Documento de identidade com foto",
                "Comprovante de reserva"
        );
    }
}
