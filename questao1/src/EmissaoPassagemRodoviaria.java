
public class EmissaoPassagemRodoviaria extends EmissaoPassagem {

    @Override
    protected Passagem criarPassagem(String nomePassageiro, double valorTarifa) {
        return new PassagemRodoviaria(nomePassageiro, valorTarifa);
    }
}
