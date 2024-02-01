import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class DadJoke {

    // Written for you:
    // A method to make a web request at a certain URL and return the server's
    // response as a String.
    public static String getResponseText(String url) throws Exception {
        HttpRequest request = HttpRequest.newBuilder(new URI(url)).headers("Accept", "text/plain").GET().build();
        HttpResponse<String> response = HttpClient
                .newBuilder()
                .proxy(ProxySelector.getDefault())
                .build()
                .send(request, BodyHandlers.ofString());
        return response.body();
    }

    public static void main(String[] args) throws Exception {

        String urlNull = "https://icanhazdadjoke.com/";
        String jokeNull = getResponseText(urlNull);

        if (args.length == 0) {
            System.out.println(jokeNull);
        } else if (args.length == 1) {
            String url = String.format("https://icanhazdadjoke.com/search?term=%s&limit=1", args[0]);
            String joke = getResponseText(url);

            boolean isEmpty = joke.isEmpty();
            if (!isEmpty) {
                System.out.println(joke);
            } else {
                System.out.println("Sorry, there was no joke for your search term.");
                System.out.println(jokeNull);
            }
        } else {
            System.out.println("Please only search for 1 search term or no search terms.");
        }
    }

}
