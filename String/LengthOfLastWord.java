package String;




public class LengthOfLastWord {
    
    public static void main(String[] args) {
        System.out.println(length("Hello World  ")+"");
    }

    private static int length(String st) {
        
        st=st.trim();
        int len = st.length();
        int worldlen=0;

        for (int i = len-1; i > 0; i--) {
            if(st.charAt(i) !=' '){
                worldlen++;
            }else{
                break;
            }
        }
        return worldlen;
    }
}
