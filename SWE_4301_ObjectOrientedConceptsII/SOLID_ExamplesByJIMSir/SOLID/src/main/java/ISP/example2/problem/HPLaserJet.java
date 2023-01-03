package ISP.example2.problem;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 7:30 PM
 */

public class HPLaserJet implements IPrintTasks{
    @Override
    public void printContent(String content) {
        System.out.println("printing..." + "\n" + content);
    }

    @Override
    public void scanContent(String content) {
        System.out.println("scanning..." + "\n" + content);
    }

    @Override
    public void faxContent(String content) {
        System.out.println("faxing..." + "\n" + content);
    }

    @Override
    public void photoCopyContent(String content) {
        System.out.println("copying..." + "\n" + content);
    }
}
