package Lekcja_6_inheritence.zad1;

class PushNotification extends Message {
    public PushNotification(String recipient, String sender) {
        super(recipient, sender);
    }

    @Override
    public void sendMessage() {
        System.out.println("wysłano powiadomienie do " + recipient);
    }
}
