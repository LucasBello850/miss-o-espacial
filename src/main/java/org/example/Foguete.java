// =========================
// Classe Foguete
// =========================

public class Foguete {

    private String nome;
    private double combustivelRestante;
    private double cargaMaxima;
    private String status;

    // Construtor
    public Foguete(String nome,
                   double combustivelRestante,
                   double cargaMaxima) {

        this.nome = nome;
        this.combustivelRestante = combustivelRestante;
        this.cargaMaxima = cargaMaxima;
        this.status = "Pronto";
    }

    // Método abastecer
    public void abastecer(double quantidade) {

        if (quantidade > 0) {

            combustivelRestante += quantidade;

            status = "Abastecido";

            System.out.println(
                    nome + " foi abastecido com "
                            + quantidade
                            + " unidades de combustível.");

        } else {

            System.out.println(
                    "Quantidade inválida para abastecimento.");
        }
    }

    // Método lançar
    public void lancar() {

        if (combustivelRestante > 0) {

            status = "Lançado";

            System.out.println(
                    "O foguete "
                            + nome
                            + " foi lançado com sucesso!");

            combustivelRestante = 0;

        } else {

            System.out.println(
                    "O foguete "
                            + nome
                            + " não possui combustível suficiente.");
        }
    }

    // Relatório
    public void relatorio() {

        System.out.println(
                "===== RELATÓRIO DO FOGUETE =====");

        System.out.println("Nome: " + nome);

        System.out.println(
                "Combustível restante: "
                        + combustivelRestante);

        System.out.println(
                "Carga máxima: "
                        + cargaMaxima);

        System.out.println("Status: " + status);

        System.out.println(
                "=================================");
    }

    // GETTERS

    public String getNome() {
        return nome;
    }

    public double getCombustivelRestante() {
        return combustivelRestante;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public String getStatus() {
        return status;
    }
}