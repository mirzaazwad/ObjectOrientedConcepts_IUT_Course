package DIP.example2.solution2;

import DIP.example2.problem.HTMLClient;

/**
 * Created by jubair.
 * Date: 23/9/22
 * Time: 7:47 AM
 */

public class DocumentFactory {
    HTMLClient htmlClient;

    DocumentFactory(HTMLClient htmlClient){
        this.htmlClient = htmlClient;
    }

    Document build(String url){
        return new Document(htmlClient.get(url));
    }
}
