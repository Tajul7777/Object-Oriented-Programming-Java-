/**
 * Created by swakkhar on 6/19/16.
 */
public class LocalClassExample{
    static String regularExpression = "[^0-9]";
    public static void validatePhoneNumber(
            String... args) {
        final int numberLength = 11;
        class PhoneNumber {
            String formattedPhoneNumber = null;
            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(
                        regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
            }
            public String getNumber() {
                return formattedPhoneNumber;
            }
        }
        for(String arg: args) {
            PhoneNumber myNumber = new PhoneNumber(arg);
            if(myNumber.getNumber() == null)
                System.out.println(arg+" is invalid");
            else
                System.out.println(arg+" is valid");
        }
    }
    public static void main(String... args) {
        validatePhoneNumber("01512-327508", "01512-32750");
    }
}


