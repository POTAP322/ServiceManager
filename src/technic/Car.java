package technic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Technique {
    private final String vinCode;

    private static final String VIN_CODE_PATTERN = "^[A-Z0-9]{17}$";//регулярное выражение проверяет, что строка состоит ровно из 17 символов, каждый из которых является буквой от A до Z или цифрой от 0 до 9.

    // Конструктор класса Car
    public Car(boolean isBroken, String vinCode, String model) {
        super(isBroken,model);

        //проверка вин кода на корректность( если он не правильный , то выбрасывает исключение)
        if (isValidVIN(vinCode)) {
            this.vinCode = vinCode;
        } else {
            throw new IllegalArgumentException("Неверный VIN код: " + vinCode);
        }
    }
    // Метод для проверки корректности VIN кода
    private static boolean isValidVIN(String vinCode) {
        Pattern pattern = Pattern.compile(VIN_CODE_PATTERN); // Компилирует регулярное выражение для VIN кода
        Matcher matcher = pattern.matcher(vinCode); // Создает объект Matcher для проверки VIN ко
        return matcher.matches(); // Возвращает true, если VIN код соответствует шаблону, иначе false
    }

    public String getModel() {
        return model;
    }

    public String getVinCode() {
        return vinCode;
    }
}
