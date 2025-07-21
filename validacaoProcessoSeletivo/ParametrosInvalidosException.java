package validacaoProcessoSeletivo;

// Agora é uma exceção válida porque estende Exception
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
