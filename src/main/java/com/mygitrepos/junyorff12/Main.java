package com.mygitrepos.junyorff12;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/junyorff12/repos"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
        var res = response.body();

        Gson gson = new Gson();
        Repos[] repos = gson.fromJson(res, Repos[].class);

        for(Repos repo: repos) {
            System.out.println(repo.getHtml_url());
        }

    }

}
