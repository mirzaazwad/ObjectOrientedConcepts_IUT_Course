package CodeSmellB;

//Feature Envy: Mail is more reliant on features of EmailService
// Lazy Class: Mail acts as a container class with no extra benefits provided
// Conceptual Duplication: There is duplicated methods in the Mail class that could be avoided
public class EmailService {
    //just pass false to sendImmediately instead of having 2 different method calls
    public void Send(String subject,String body,String to,String from,String cc,boolean sendImmediately){

    }
}
