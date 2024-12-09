package technic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Truck extends Technique {

    private final String vinCode;
    private static final String VIN_CODE_PATTERN = "^[A-Z0-9]{17}$";//шаблон(паттерн) для vin кода



    public Truck(boolean isBroken, String vinCode, String model) {
        super(isBroken,model);
        this.model = model;
        //проверка вин кода на корректность( если он не правильный , то выбрасывает исключение)
        if (isValidVIN(vinCode)) {
            this.vinCode = vinCode;
        } else {
            throw new IllegalArgumentException("Неверный VIN код: " + vinCode);
        }
    }
    // Метод для проверки корректности VIN кода
    private static boolean isValidVIN(String vinCode) {
        Pattern pattern = Pattern.compile(VIN_CODE_PATTERN);
        Matcher matcher = pattern.matcher(vinCode);
        return matcher.matches();
    }

    public String getModel() {
        return model;
    }

    public String getVinCode() {
        return vinCode;
    }
}
