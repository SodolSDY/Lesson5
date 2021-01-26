package task2;

public class XMLHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Открытие документа XML");
    }

    @Override
    public void create() {
        System.out.println("Создание документа XML");
    }

    @Override
    public void change() {
        System.out.println("Изменение документа XML");
    }

    @Override
    public void save() {
        System.out.println("Сохранение документа XML");

    }
}
