import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;





    public class ApiConversor {

        private String valor;
        private String url;
        private String apiKey = "319b50175a35980b7a27c4a6";
        private String moedaBase;
        private String moedaAlvo;
        Mensagens mensagens = new Mensagens();


        public String conversao (String valor, String moedaBase, String moedaAlvo) throws IOException, InterruptedException {
            try{
            this.valor = valor;
            this.moedaBase = moedaBase;
            this.moedaAlvo = moedaAlvo;
            this.url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moedaBase + "/" + moedaAlvo + "/" + valor;

                Gson gson = new GsonBuilder().create();
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();


                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());


                String json = response.body();



                Conversor meuConversor = gson.fromJson(json, Conversor.class);
                Moeda minhaMoeda = new Moeda(meuConversor);

                return mensagens.valor() + valor + mensagens.espaco() + minhaMoeda.getMoedaBase() + mensagens.valorFinal() + minhaMoeda.getConversao() + mensagens.espaco() + moedaAlvo;
            }catch (Exception e){
                System.out.println(mensagens.erroValor());

                return "";
            }
        }

    }

