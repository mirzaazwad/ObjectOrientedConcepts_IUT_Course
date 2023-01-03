package LSP.example1.problem;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 6:34 PM
 */

public abstract class SocialMedia {
    // @support Facebook/Instagram/Whatsapp
    public abstract void chatWithFriend();

    // @support Facebook/Instagram
    public abstract void publishPost(Object post);

    // @support Facebook/Instagram/Whatsapp
    public abstract void sendPhotosAndVideos();

    // @support Whatsapp/Facebook
    public abstract void groupVideoCall(String... users);
}
