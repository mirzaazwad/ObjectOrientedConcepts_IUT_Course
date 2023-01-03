package DIP.example2.problem;

/**
 * Created by jubair.
 * Date: 23/9/22
 * Time: 7:34 AM
 */

public class Document {
    String html;

    Document(String url){
        HTMLClient htmlClient = new HTMLClient();   // instantiation for your work
        html = htmlClient.get(url);     // doing work in the constructor
    }
}
