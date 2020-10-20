package Exercise4;

public class TelephoneParser {
    private String code;
    private String firstTres;
    private String secondTres;
    private String quattuor;

    public TelephoneParser(String number) {
        if (number.matches("^(\\+\\d{11}|\\d{11})$")) {
            if (number.length() == 12) {
                code = String.valueOf(number.charAt(1));
                firstTres = number.substring(2, 5);
                secondTres = number.substring(5, 8);
                quattuor = number.substring(8, 12);
            } else {
                code = String.valueOf((Integer.parseInt(String.valueOf(number.charAt(0))) - 1));
                firstTres = number.substring(1, 4);
                secondTres = number.substring(4, 7);
                quattuor = number.substring(7, 11);
            }
        } else {
            throw new IllegalArgumentException("Wrong phone number");
        }
    }

    @Override
    public String toString(){
        return "+" + code + " " + firstTres + "-" + secondTres + "-" + quattuor;
    }
}
