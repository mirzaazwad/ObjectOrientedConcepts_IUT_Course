package Lab8;
import Lab8.ProtocolStack.SMTP;
import Lab8.ProtocolStack.VoIP;
import Lab8.Users.Customer;
import Lab8.Users.Manager;
import Lab8.VerificationAPI.EmailVerificationAPI;
import Lab8.VerificationAPI.MobileVerification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VerificationTest {
    @Test
    public void testEmailVerification(){
        EmailVerificationAPI emailVerificationAPI=new EmailVerificationAPI();
        Integer otp=emailVerificationAPI.generateOTP();
        SMTP smtp=new SMTP("mirzaazwad8@gmail.com","123","smtp.brevo.com",568,"Brevo");
        Customer verifyUser=new Customer("mirzaazwad8@gmail.com",emailVerificationAPI,smtp,otp);
        assertEquals(String.format("Sending to email: mirzaazwad8@gmail.com, otp: %s\n" +
                "Sending email by Brevo using Configuration mirzaazwad8@gmail.com:123@smtp.brevo.com:568",otp),verifyUser.send_verification());
    }

    @Test
    public void testPhoneVerification(){
        MobileVerification mobileVerificationAPI=new MobileVerification();
        Integer otp=mobileVerificationAPI.generateOTP();
        VoIP voip=new VoIP("mirzaazwad@iut-dhaka.edu","123","firebase.google.com",3433,"firebase");
        Manager verifyUser=new Manager("01991681338",mobileVerificationAPI,voip,otp);
        assertEquals(String.format("Calling phone number: 01991681338, otp: %s\n" +
                "Starting call by firebase using Configuration mirzaazwad@iut-dhaka.edu:123@firebase.google.com:3433",otp),verifyUser.send_verification());
    }
}
