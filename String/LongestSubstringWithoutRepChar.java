package String;
import java.util.HashMap;

public class LongestSubstringWithoutRepChar{


    public static void main(String[] args) {
        
    }

    // Time Complex - O(N) Space Complex - O(N)
    public static int longestUniqueSubsttr(String str){
    
        HashMap<Character, Integer> map = new HashMap<>();

        int l=0, length = 0,  r=0, n=str.length();

        while(r< n){

            if(map.containsKey(str.charAt(r))){
                l= Math.max(map.get(str.charAt(r))+1, l);

            }

            map.put(str.charAt(r), r);
            length = Math.max(length, r-l+1);
            r++;
       
        }
        return length;

    }


    
}