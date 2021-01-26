package task2;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Открытие документа DOC");
    }

    @Override
    public void create() {
        System.out.println("Создание документа DOC");
    }

    @Override
    public void change() {
        System.out.println("Изменение документа DOC");

    }

    @Override
    public void save() {
        System.out.println("Сохранение документа DOC");
    }
}
