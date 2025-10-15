package atividadealuno;

public class Gabarito {
    private char[] respostas;

    public Gabarito() {
        respostas = new char[15];
        // exemplo de gabarito (pode ser alterado)
        char[] exemplo = {'A','B','C','D','E','A','B','C','D','E','A','B','C','D','E'};
        for (int i = 0; i < 15; i++) {
            respostas[i] = exemplo[i];
        }
    }

    public char respostaQuestao(int numeroQuestao) {
        return respostas[numeroQuestao];
    }
}
