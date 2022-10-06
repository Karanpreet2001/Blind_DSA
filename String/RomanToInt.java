package String;
import java.util.HashMap;

public class RomanToInt {
    

    public static void main(String[] args) {
        
        String s = "MCMXCIV";
        int ans = romanToInt(s);

        System.out.println(ans);
    }

    private static int romanToInt(String s) {
        int result =0;

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('C', 100);
        map.put('L', 50);
        map.put('D', 500);
        map.put('M', 1000);


        for (int i = 0; i < s.length()-1; i++) {
            
            int left = map.get(s.charAt(i));
            int right = map.get(s.charAt(i+1));

            if(left >= right){
                result += left;
            }else{
                result -= left;
            }

        }



        return result + map.get(s.charAt(s.length()-1));
    }
}
