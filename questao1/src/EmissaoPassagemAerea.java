
public class EmissaoPassagemAerea extends EmissaoPassagem {

    @Override
    protected Passagem criarPassagem(String nomePassageiro, double valorTarifa) {
        return new PassagemAerea(nomePassageiro, valorTarifa);
    }
}
