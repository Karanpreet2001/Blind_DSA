package String;
public class IntToRoman {
    

    public static void main(String[] args) {
        

        String result = intToRoman(1994);
        System.out.println(result);
    }

    private static String intToRoman(int number) {

        int[] intCode = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] code = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        
        for (int j = 0; j < intCode.length; j++) {
            while( number >= intCode[j]){
                sb.append(code[j]);
                number -= intCode[j];
            }
        }
        return sb.toString();
    }


}
