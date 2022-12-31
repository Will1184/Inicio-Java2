package ciclos;

public class For {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.println("i = "+i);
        }
        System.out.println("------------------------");
        for (int i=10; i>=0; i--){
            System.out.println("i = "+i);
        }
        for (int i=1,j=90,k=100; i<j|j>k;i++,j--,k--){
            System.out.println(i+"-"+j+"-"+k);
        }
        System.out.println("------------------------");
        for (int i=0;i<=10;i++) {
            if (!(i % 2 == 0)) {
                continue;

            }

            System.out.println("i ="+i);
        }
    }
}

