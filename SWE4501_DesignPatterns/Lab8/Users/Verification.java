package Lab8.Users;

import Lab8.ProtocolStack.IProtocol;
import Lab8.VerificationAPI.IVerificationAPI;

public abstract class Verification {
    protected IVerificationAPI verificationAPI;
    protected IProtocol protocolStack;
    protected Verification(IVerificationAPI verificationAPI,IProtocol protocolStack){
        this.verificationAPI=verificationAPI;
        this.protocolStack=protocolStack;
    }

    public abstract String send_verification();
}
