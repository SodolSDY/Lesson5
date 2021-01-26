package task2;

public class TXTHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Открытие документа TXT");
    }

    @Override
    public void create() {
        System.out.println("Создание документа TXT");
    }

    @Override
    public void change() {
        System.out.println("Изменение документа TXT");
    }

    @Override
    public void save() {
        System.out.println("Сохранение документа TXT");
    }
}
