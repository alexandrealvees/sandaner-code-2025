public class Celula {
    private int valor;
    private boolean editavel;

    public Celula(int valor, boolean editavel) {
        this.valor = valor;
        this.editavel = editavel;
    }

    public int getValor() {
        return valor;
    }

    public boolean isEditavel() {
        return editavel;
    }

    public void setValor(int valor) {
        if (editavel) {
            this.valor = valor;
        }
    }

    @Override
    public String toString() {
        return (valor == 0) ? "." : String.valueOf(valor);
    }
}
