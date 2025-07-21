package diagramacaoClasseIphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos do Reprodutor Musical
    public void tocar() {
        System.out.println("🎵 Tocando música...");
    }

    public void pausar() {
        System.out.println("⏸️ Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("🎶 Música selecionada: " + musica);
    }

    // Métodos do Aparelho Telefônico
    public void ligar(String numero) {
        System.out.println("📞 Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("✅ Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("📬 Iniciando correio de voz...");
    }

    // Métodos do Navegador Internet
    public void exibirPagina(String url) {
        System.out.println("🌐 Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("🆕 Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("🔄 Página atualizada.");
    }
}
