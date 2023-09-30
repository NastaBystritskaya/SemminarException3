package au.bystritskaia.exceptions;

import java.util.Objects;

/**
 * Ошибка валидации персонажа
 */
public class PersonValidationException extends Exception {

    /**
     * Конструктор исключение
     * @param validationDescription Описания валидации
     * @param valueUnderValidation Проверяемое значение
     */
    public PersonValidationException(String validationDescription, Object valueUnderValidation) {
        super("""
                Ошибка валидации персонажа.
                Проверяемое значение: %s.
                Описание проверки:%n %s
                """.formatted(valueUnderValidation, Objects.toString(validationDescription)));
    }

    /**
     * Конструктор исключение
     * @param validationDescription Описания валидации
     * @param valueUnderValidation Проверяемое значение
     */
    public PersonValidationException(String validationDescription, Object valueUnderValidation, Object exceptedValue) {
        super("""
                Ошибка валидации персонажа.
                Проверяемое значение: %s.
                Ожидаемое значение(пример): %s
                Описание проверки:%n %s.
                """.formatted(valueUnderValidation, validationDescription, exceptedValue));
    }
}