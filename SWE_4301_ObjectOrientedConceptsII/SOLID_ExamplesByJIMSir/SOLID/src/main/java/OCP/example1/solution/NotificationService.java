package OCP.example1.solution;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 6:22 PM
 */

public interface NotificationService {
    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);
}
