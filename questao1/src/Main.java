
public class Main {

    public static void main(String[] args) {
        EmissaoPassagem emissaoAerea = new EmissaoPassagemAerea();
        emissaoAerea.emitir("Ana Silva", 1000.00);

        EmissaoPassagem emissaoRodoviaria = new EmissaoPassagemRodoviaria();
        emissaoRodoviaria.emitir("Bruno Souza", 200.00);

        EmissaoPassagem emissaoFerroviaria = new EmissaoPassagemFerroviaria();
        emissaoFerroviaria.emitir("Carla Lima", 300.00);
    }
}
