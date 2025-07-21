package diagramacaoClasseIphone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // 🎵 Reprodutor Musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("-----------------------------");

        // ☎️ Aparelho Telefônico
        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("-----------------------------");

        // 🌐 Navegador na Internet
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
