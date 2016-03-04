public class CompareNumber{

    public String compare(String inputNumber, String correctNumber) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < correctNumber.length(); i++) {
            if(inputNumber.charAt(i) == correctNumber.charAt(i)) {
                a++;
            }
        }
        return String.format("%dA%dB",a,b);
    }
}
