package app.service.impl;

import app.service.Printer;

public class ConsolePrinter implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }


    public void print(Message message) {

        if (message.getSender() == null || message.getSender().isEmpty()) {
            if ((message.getText() == null || message.getText().isEmpty())) {
                Printer anonymousPrinter = new Printer() {
                    public void print(Message msg) {
                        System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                    }
                };
                anonymousPrinter.print(message);
            } else {
                System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
            }
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }

    }

}