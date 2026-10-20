import java.util.List;

public abstract class Passagem {
    private final String nomePassageiro;
    private final double valorTarifa;

    protected Passagem(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public double getValorTarifa() {
        return valorTarifa;
    }

    public abstract String getModal();

    public abstract double calcularTaxaEmbarque();

    public abstract List<String> getDocumentosExigidos();
}