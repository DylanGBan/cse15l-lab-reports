import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {

    StringBuilder searchString = new StringBuilder();


    public String handleRequest(URI url) {

        if(url.getPath().contains("/add-message")){

        String[] temp = url.getQuery().split("=");

        if(temp[0].equals("s")){

        searchString.append(temp[1]);
        searchString.append("\n");

        }

        return searchString.toString();
        }
            return "404 Not Found!";
        }
    }


class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        newServer.start(port, new Handler());
    }
}
