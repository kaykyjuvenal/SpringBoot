package org.br.edu.ifsp;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.br.edu.ifsp.models.Titulo;
import org.br.edu.ifsp.models.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite um filme para busca!");
                String nomeBusca = sc.nextLine();
                String url = "http://www.omdbapi.com/?t=" + nomeBusca.replace(" ", "+") + "&apikey=6d06693d";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response;
                {
                    try {
                        response = client.send(request,HttpResponse.BodyHandlers.ofString());
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).
                create();
        String json = response.body();
        TituloOmdb myTitle = gson.fromJson(json, TituloOmdb.class);
        Titulo meuTitulo = new Titulo(myTitle);
        System.out.println(meuTitulo);
    }
}