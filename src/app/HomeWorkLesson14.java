package app;

import app.service.impl.ConsolePrinter;
import app.service.Printer;

public class HomeWorkLesson14 {
    public static void main(String[] args) {

        Printer printer = new ConsolePrinter();

        ConsolePrinter.Message message1 = new ConsolePrinter.Message("Це анонімне повідомлення", null);
        printer.print(message1);

        ConsolePrinter.Message message2 = new ConsolePrinter.Message("Привіт, як справи?", "Даша");
        printer.print(message2);

        ConsolePrinter.Message message3 = new ConsolePrinter.Message(null, null);
        printer.print(message3);
    }
}
