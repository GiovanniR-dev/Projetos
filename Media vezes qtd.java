import java.util.Scanner;

public class Curso {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        final int QTD = 10;

        int [] Altura=new int[QTD];

       int media;

       media = 0;

       for(int i=0 ;i<QTD; i++){
           System.out.println("Informe a altura"+i+":");
           Altura[i]= sc.nextInt();
           media = media+Altura[i] ;
       }
       media=media/QTD;

       System.out.println("A medida das altura");
       for (int i = 0; i<QTD;i++){
           System.out.println(Altura[i]+";");
       }

       System.out.println("E:"+media);


    }
}
