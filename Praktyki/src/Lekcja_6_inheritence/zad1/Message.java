package Lekcja_6_inheritence.zad1;

class Message {
    String recipient;
    String sender;

    public Message(String recipient, String sender) {
        this.recipient = recipient;
        this.sender = sender;
    }


    public void sendMessage() {
        System.out.println("wiadomość wysłada do " + recipient);

    }
}
