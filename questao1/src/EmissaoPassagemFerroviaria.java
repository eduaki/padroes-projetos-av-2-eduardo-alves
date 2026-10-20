
public class EmissaoPassagemFerroviaria extends EmissaoPassagem {

    @Override
    protected Passagem criarPassagem(String nomePassageiro, double valorTarifa) {
        return new PassagemFerroviaria(nomePassageiro, valorTarifa);
    }
}
