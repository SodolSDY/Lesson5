package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractHandler xml = new XMLHandler();
        AbstractHandler doc = new DOCHandler();
        AbstractHandler txt = new TXTHandler();
        String formatDocum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой формат документа?");
        formatDocum = sc.next();

        if (formatDocum.equals("xml")) {
            xml.open();
            xml.create();
            xml.change();
            xml.save();
        } else if (formatDocum.equals("doc")) {
            doc.open();
            doc.create();
            doc.change();
            doc.save();
        } else if (formatDocum.equals("txt")) {
            txt.open();
            txt.create();
            txt.change();
            txt.save();
        }
    }
}
