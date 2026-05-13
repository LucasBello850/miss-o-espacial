// =========================
// Classe MissaoEspacial
// =========================

public class MissaoEspacial {

    private Foguete foguete;
    private Satelite satelite;
    private CentroDeControle centroComunicacao;
    private boolean emMissao;

    // Construtor
    public MissaoEspacial(Foguete foguete,
                          Satelite satelite,
                          CentroDeControle centroComunicacao) {

        this.foguete = foguete;
        this.satelite = satelite;
        this.centroComunicacao = centroComunicacao;
        this.emMissao = false;
    }

    // Iniciar missão
    public void iniciarMissao() {

        if (foguete.getStatus().equals("Lançado")
                && satelite.isEmOperacao()
                && centroComunicacao.isEmOperacao()) {

            emMissao = true;

            System.out.println(
                    "A missão espacial foi iniciada!");

        } else {

            System.out.println(
                    "Não é possível iniciar a missão.");
        }
    }

    // Finalizar missão
    public void finalizarMissao() {

        emMissao = false;

        System.out.println(
                "A missão espacial foi finalizada.");
    }

    // Relatório da missão
    public void relatorioMissao() {

        System.out.println(
                "===== RELATÓRIO DA MISSÃO ESPACIAL =====");

        System.out.println(
                "Status da Missão: "
                        + (emMissao
                        ? "Em andamento"
                        : "Finalizada"));

        System.out.println(
                "Foguete: "
                        + foguete.getNome()
                        + " - Status: "
                        + foguete.getStatus());

        System.out.println(
                "Satélite: "
                        + satelite.getNome()
                        + " - Status: "
                        + (satelite.isEmOperacao()
                        ? "Em operação"
                        : "Desligado"));

        System.out.println(
                "Centro de Comunicação: "
                        + centroComunicacao.getNome()
                        + " - Status: "
                        + (centroComunicacao.isEmOperacao()
                        ? "Em operação"
                        : "Desligado"));

        System.out.println(
                "=====================================");
    }

    // GETTERS

    public Foguete getFoguete() {
        return foguete;
    }

    public Satelite getSatelite() {
        return satelite;
    }

    public CentroDeControle getCentroComunicacao() {
        return centroComunicacao;
    }

    public boolean isEmMissao() {
        return emMissao;
    }
}