public class CompareNumber{

    public String compare(String input, String answer) {
        int a = 0, b = 0;
        for(int i = 0; i < answer.length(); i++) {
            if(input.charAt(i) == answer.charAt(i)) {
                a++;
            } else if(answer.indexOf(input.charAt(i)) != -1) {
                b++;
            }
        }
        return String.format("%dA%dB", a, b);
    }
}
