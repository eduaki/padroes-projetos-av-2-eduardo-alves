public class FabricaChile implements FabricaArtefatosMatricula {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new BoletaChile();
    }

    @Override
    public Pagamento criarPagamento() {
        return new WebpayChile();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteChile();
    }
}
