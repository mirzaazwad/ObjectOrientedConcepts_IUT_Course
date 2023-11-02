package Lab8.VerificationAPI;

public class EmailVerificationAPI implements IVerificationAPI{

    public String sendOTP(String userInformation,Integer otp){
        return String.format("Sending to email: %s, otp: %s",userInformation,otp);
    }

    public Integer generateOTP(){
        return (int) ((Math.random() * (999999-100000)) + 100000);
    }

}
