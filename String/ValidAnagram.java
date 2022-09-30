package String;
import java.util.Arrays;


// Valid Anagram


//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//An Anagram is a word or phrase formed by rearranging the letters of a different word or 
//phrase, typically using all the original letters exactly once.


//Input: s = "anagram", t = "nagaram"
//Output: true


public class ValidAnagram {
    

    public static void main(String[] args) {
    
        String s= "test", t="ttew";
        boolean check = isAnagramUsingConstSpace(s, t);
        System.out.println(check);
    }


    //Time complex - 0(nlogn) and Space = 0(1)
    private static boolean isAnagram(String s, String t) {

        int n1=s.length();
        int n2 = t.length();

        if(n1 != n2){
            return false;
        }

        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();



        Arrays.sort(st);
        Arrays.sort(tt);


        for (int i = 0; i < n1; i++) {
            if(st[i] != tt[i]){
                return false;
            }
        }
        return true;
    }

    // time - 0(N)
    private static boolean isAnagramUsingConstSpace(String s, String t) {

        int n1=s.length();
        int n2 = t.length();

        if(n1 != n2){
            return false;
        }

        int[] char_count = new int[26];

        for (int i = 0; i < n1; i++) {
            char_count[s.charAt(i) - 'a']++;
            char_count[t.charAt(i) - 'a']--;
        }

        for (int i : char_count) {
            if(i != 0){
                return false;
            }
        }
        return true;
    }


}
