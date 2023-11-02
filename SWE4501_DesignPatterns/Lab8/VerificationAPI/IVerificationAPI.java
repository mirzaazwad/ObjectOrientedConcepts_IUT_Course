package Lab8.VerificationAPI;

import Lab8.ProtocolStack.IProtocol;

public interface IVerificationAPI {
    String sendOTP(String userInformation,Integer otp);
}
