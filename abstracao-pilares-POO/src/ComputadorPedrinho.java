public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("FACEBOOK");
        FacebookMessenger fbc = new FacebookMessenger();
        fbc.enviarMensagem();
        fbc.receberMensagem();

        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
