
public abstract class EmissaoPassagem {

    public final void emitir(String nomePassageiro, double valorTarifa) {
        Passagem passagem = criarPassagem(nomePassageiro, valorTarifa);
        imprimirResumo(passagem);
    }

    protected abstract Passagem criarPassagem(String nomePassageiro, double valorTarifa);

    private void imprimirResumo(Passagem passagem) {
        System.out.println("Modal: " + passagem.getModal());
        System.out.println("Passageiro: " + passagem.getNomePassageiro());
        System.out.printf("Taxa de embarque: R$ %.2f%n", passagem.calcularTaxaEmbarque());
        System.out.println("Documentos exigidos: " + String.join(", ", passagem.getDocumentosExigidos()));
        System.out.println("---");
    }
}
