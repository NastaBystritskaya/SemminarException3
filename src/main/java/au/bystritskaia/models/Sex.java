package au.bystritskaia.models;

/**
 * Пол
 */
public enum Sex {
    /**
     * Женский
     */
    F ("Женщина"),
    /**
     * Мужской
     */
    M ("Мужчина");

    /**
     * Описание перечисления
     */
    private String value;

    /**
     * Получить описание
     * @return Описание
     */
    public String value() {
        return this.value;
    }

    /**
     * Конструктор перечисления
     * @param val Текущее описание
     */
    Sex(String val) {
        this.value = val;
    }
}
