package Lekcja_6_inheritence.zad1;


public class zad_1 {
    public static void main(String[] args) {
        Message[] message = new Message[3];
        message[0] = new Message("Jan","Andrzej");
        message[1] = new WhatsAppMessage("Karol","Adam");
        message[2] = new PushNotification("Kacper","Krzysztof");

        for (Message messag : message) {
            messag.sendMessage();
        }
    }
}
