package au.bystritskaia.views;

public class PersonView {

    /**
     * Сообщение о вводе данных
     */
    public void printInputCommand() {
        System.out.println("""
                Введите данные персонажа через пробел:
                """);
    }

    /**
     * Вывод сообщения об удачном сохранении.
     * @param filename Имя файла
     */
    public void printSuccess(String filename) {
        System.out.println("Данные сохранены в файле: " + filename);
    }

    /**
     * Вывод сообщения об ошибке сохранениы.
     * @param message Сообщение об ошибке
     */
    public void printError(String message) {
        System.out.println("Не удалось сохранить данные.\n Сообщение:\n " + message);
    }
}
