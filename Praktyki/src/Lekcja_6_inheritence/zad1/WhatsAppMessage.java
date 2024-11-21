package Lekcja_6_inheritence.zad1;

class WhatsAppMessage extends Message {
    public WhatsAppMessage(String recipient, String sender) {
        super(recipient, sender);
    }

    @Override
    public void sendMessage() {
        System.out.println("wiadomość wysłada do " + recipient + " przez WhatsApp");
    }
}
