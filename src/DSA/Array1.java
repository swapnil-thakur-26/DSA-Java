package DSA;

public class Array1 {
    public static void main(String[] args) {
       //declaring an array
        int [] arrayname = {12, 22, 15, 1};

        //changing index value of an array
        arrayname[1] = 44;

        //getting array
        System.out.println(arrayname[1]);

        //traversing in an array
        for(int i = 0; i<arrayname.length ; i++){
            System.out.println(arrayname[i]);
        }
    }
}
