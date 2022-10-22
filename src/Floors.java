public class Floors {
    public static void main(String[] args) {
        int count=0;
        int lift = 0 ;
        for (int i = 0; i <= 163; i++) {

            if (lift==5){
                lift=0;
                i=i-2;
                count++;
            }
            lift++;
            System.out.println(i);
        }
        System.out.println(count);
    }
}
