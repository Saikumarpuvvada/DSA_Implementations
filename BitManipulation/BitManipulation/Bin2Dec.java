package BitManipulation;

public class Bin2Dec {
    public static void main(String[] args) {
        String s="1000";
        int n=0;
        int mul=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1') n+=mul;
            mul*=2;
        }
        System.out.println(n);
        System.out.println(~-6);
    }
}
