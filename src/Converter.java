public class Converter {

    static int romanToArabic(String romanNumber) {
        String[] romanNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int arabicNumber = 0;

        for (int i = 0; i < romanNumbers.length; i++) {
            if (romanNumbers[i].equals(romanNumber)) {
                arabicNumber = i + 1;
                break;
            }
        }

        return arabicNumber;
    }

    static String arabicToRoman(int arabicNumber) {
        String romanNumber = "";
        int[] keyArabicNumbers = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] keyRomanNumbers = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < keyArabicNumbers.length; i++) {
            while (arabicNumber >= keyArabicNumbers[i]) {
                romanNumber = romanNumber.concat(keyRomanNumbers[i]);
                arabicNumber -= keyArabicNumbers[i];
            }
        }

        return romanNumber;
    }
}
