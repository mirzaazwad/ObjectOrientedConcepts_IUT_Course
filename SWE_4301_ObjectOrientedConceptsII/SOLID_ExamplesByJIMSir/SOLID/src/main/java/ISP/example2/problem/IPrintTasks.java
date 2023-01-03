package ISP.example2.problem;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 7:28 PM
 */

public interface IPrintTasks {
    public void printContent(String content);
    public void scanContent(String content);
    public void faxContent(String content);
    public void photoCopyContent(String content);

    // entering a new method will force all other existing classes to implement the methods
//    public void printDuplexContent(String content);
}
