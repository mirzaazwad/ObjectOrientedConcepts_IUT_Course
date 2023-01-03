package DIP.example2.solution;

import DIP.example2.problem.HTMLClient;

/**
 * Created by jubair.
 * Date: 23/9/22
 * Time: 7:37 AM
 */

public class Document {
    String html;

    Document(HTMLClient htmlClient, String url){    // we don't care about how this htmlClient instantiated.
        html = htmlClient.get(url);     // care about what the client can produce
    }

    // anything we don't save as attribute/filed, we are using some other thing to get our desired data
}
