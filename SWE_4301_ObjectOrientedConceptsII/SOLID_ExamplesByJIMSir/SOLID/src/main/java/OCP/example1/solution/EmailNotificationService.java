package OCP.example1.solution;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 6:27 PM
 */

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        // write logic to send otp to email
    }

    @Override
    public void sendTransactionReport(String medium) {
        // write logic to integrate with email api
    }
}
