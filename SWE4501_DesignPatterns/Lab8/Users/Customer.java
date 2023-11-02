package Lab8.Users;

import Lab8.ProtocolStack.IProtocol;
import Lab8.VerificationAPI.IVerificationAPI;

public class Customer extends Verification {
    private String userInformation;
    private Integer otp;
    public Customer(String userInformation, IVerificationAPI verificationAPI, IProtocol protocolStack, Integer otp){
        super(verificationAPI,protocolStack);
        this.userInformation=userInformation;
        this.otp=otp;
    }

    public String send_verification(){
        return verificationAPI.sendOTP(this.userInformation,this.otp)+"\n"+protocolStack.provideService();
    }
}