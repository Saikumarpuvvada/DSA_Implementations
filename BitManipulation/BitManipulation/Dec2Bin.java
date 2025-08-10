package BitManipulation;

public class Dec2Bin {
    public static void main(String[] args) {
        int n=8;
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n/=2;
        }
        System.out.println(sb.reverse());
    }   
}
