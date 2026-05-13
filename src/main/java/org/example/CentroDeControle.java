// =========================
// Classe CentroDeControle
// =========================

public class CentroDeControle {

    private String nome;
    private String localizacao;
    private boolean emOperacao;

    // Construtor
    public CentroDeControle(String nome, String localizacao) {

        this.nome = nome;
        this.localizacao = localizacao;
        this.emOperacao = true;
    }

    // Método desligar
    public void desligar() {

        emOperacao = false;

        System.out.println(
                "O Centro de Comunicação " + nome + " foi desligado.");
    }

    // Método ligar
    public void ligar() {

        emOperacao = true;

        System.out.println(
                "O Centro de Comunicação " + nome + " foi ligado.");
    }

    // Verificar comunicação
    public void verificarComunicacao(Satelite satelite) {

        if (emOperacao && satelite.isEmOperacao()) {

            System.out.println(
                    "Comunicando com o satélite "
                            + satelite.getNome() + "...");

        } else {

            System.out.println(
                    "Não é possível estabelecer comunicação com o satélite "
                            + satelite.getNome());
        }
    }

    // Relatório
    public void relatorio() {

        System.out.println(
                "===== RELATÓRIO DO CENTRO DE COMUNICAÇÃO =====");

        System.out.println("Nome: " + nome);

        System.out.println("Localização: " + localizacao);

        System.out.println(
                "Status de Operação: "
                        + (emOperacao ? "Em operação" : "Desligado"));

        System.out.println(
                "=============================================");
    }

    // GETTERS

    public boolean isEmOperacao() {
        return emOperacao;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}