public class FabricaBrasil implements FabricaArtefatosMatricula {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NFSeBrasil();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PixBrasil();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteBrasil();
    }
}