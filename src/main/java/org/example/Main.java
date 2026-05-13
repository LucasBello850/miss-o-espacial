// =========================
// Classe Main
// =========================

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Criando instâncias
        Foguete foguete = new Foguete("Apollo", 100, 5000);

        Satelite satelite =
                new Satelite("Hubble", "Órbita terrestre");

        CentroDeControle centroComunicacao =
                new CentroDeControle("Centro de Comunicação NASA", "EUA");

        // Criando missão
        MissaoEspacial missao =
                new MissaoEspacial(foguete, satelite, centroComunicacao);

        // Relatórios iniciais
        foguete.relatorio();
        satelite.relatorio();
        centroComunicacao.relatorio();

        // Preparando missão
        foguete.abastecer(50);

        foguete.lancar();

        centroComunicacao.verificarComunicacao(satelite);

        // Iniciando missão
        missao.iniciarMissao();

        // Relatório final
        missao.relatorioMissao();

        // =========================
        // GERANDO ARQUIVO JSON
        // =========================

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (FileWriter writer = new FileWriter("missao.json")) {

            gson.toJson(missao, writer);

            System.out.println("\nArquivo JSON gerado com sucesso!");

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}