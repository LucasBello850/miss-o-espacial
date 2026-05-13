// =========================
// Classe Satelite
// =========================

public class Satelite {

    private String nome;
    private String tipo;
    private boolean emOperacao;

    // Construtor
    public Satelite(String nome, String tipo) {

        this.nome = nome;
        this.tipo = tipo;
        this.emOperacao = true;
    }

    // Método desligar
    public void desligar() {

        emOperacao = false;

        System.out.println(
                "O satélite " + nome + " foi desligado.");
    }

    // Método ligar
    public void ligar() {

        emOperacao = true;

        System.out.println(
                "O satélite " + nome + " foi ligado.");
    }

    // Relatório
    public void relatorio() {

        System.out.println(
                "===== RELATÓRIO DO SATÉLITE =====");

        System.out.println("Nome: " + nome);

        System.out.println("Tipo: " + tipo);

        System.out.println(
                "Status de Operação: "
                        + (emOperacao ? "Em operação" : "Desligado"));

        System.out.println(
                "=================================");
    }

    // GETTERS

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isEmOperacao() {
        return emOperacao;
    }
}