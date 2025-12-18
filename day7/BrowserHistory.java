import java.util.*;

public class BrowserHistory {
    public static void main(String[] args) {
        LinkedList<String> history = new LinkedList<>();

        history.add("google.com");
        history.add("youtube.com");
        history.add("openai.com");

        history.removeLast();

        for (String url : history)
            System.out.println(url);
    }
}
/*
google.com
youtube.com
*/
