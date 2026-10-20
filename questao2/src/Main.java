public class Main {

    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula("Ana Silva", new FabricaBrasil());
        matriculaBrasil.emitir();

        Matricula matriculaChile = new Matricula("Camila Rojas", new FabricaChile());
        matriculaChile.emitir();
    }
}
