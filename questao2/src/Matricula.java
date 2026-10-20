public class Matricula {

    private final String nomeAluno;
    private final DocumentoFiscal documentoFiscal;
    private final Pagamento pagamento;
    private final ComprovanteMatricula comprovante;

    public Matricula(String nomeAluno, FabricaArtefatosMatricula fabrica) {
        this.nomeAluno = nomeAluno;
        this.documentoFiscal = fabrica.criarDocumentoFiscal();
        this.pagamento = fabrica.criarPagamento();
        this.comprovante = fabrica.criarComprovanteMatricula();
    }

    public void emitir() {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Documento fiscal: " + documentoFiscal.descricao());
        System.out.println("Pagamento: " + pagamento.descricao());
        System.out.println("Comprovante: " + comprovante.descricao());
        System.out.println("---");
    }
}
