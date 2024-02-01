import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class DadJoke {
	
	// Written for you:
	// A method to make a web request at a certain URL and return the server's response as a String. 
	public static String getResponseText(String url) throws Exception {
		HttpRequest request = HttpRequest.newBuilder(new URI(url)).headers("Accept","text/plain").GET().build();
		HttpResponse<String> response = HttpClient
				  .newBuilder()
				  .proxy(ProxySelector.getDefault())
				  .build()
				  .send(request, BodyHandlers.ofString());
		return response.body();
	}

	public static void main(String[] args) throws Exception {		
		
        //String search = args[0];
        //String url = String.format("https://icanhazdadjoke.com/search?term=%s&limit=1",search);

        if (args.length == 0)
        {
            String urlNull = "https://icanhazdadjoke.com/";
            String jokeNull = getResponseText(urlNull); // Make a web request and save the server's response in a String called joke.
            System.out.println(jokeNull);

        }
        else if (args.length == 1)
            {
                String url = String.format("https://icanhazdadjoke.com/search?term=%s&limit=1",args[0]);
                String joke = getResponseText(url); // Make a web request and save the server's response in a String called joke.
                boolean isEmpty = joke.isEmpty();
                if(!isEmpty)
                {
                    System.out.println(joke);
                }
                else
                {
                    System.out.println("Sorry, there was no joke for your search term.");
                }
            }


        else 
        {
            System.out.println("Please only search for 1 search term or no search terms.");
        }


        
		// TO DO:
		// If there is no joke returned (joke is an empty String), print "Sorry, there was no joke for your search term.",
		// otherwise, print the joke.

	}

}