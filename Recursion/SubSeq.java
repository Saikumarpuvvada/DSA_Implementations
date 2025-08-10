package DSA_Implementations.Recursion;
public class SubSeq {
    public static void main(String[] args) {
        String s="abc";
        seq("",s);
    }
    static void seq(String ans,String s){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        seq(ans+ch, s.substring(1));
        seq(ans, s.substring(1));

    }
}
