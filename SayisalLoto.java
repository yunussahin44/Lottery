package the_lottery;


import java.util.Scanner;

public class SayisalLoto {


    static int [] bilett;

    static  int[] tahminiSayi;



    /*

           Create  n random numbers with user to generated for the ticket.
           Create  n random numbers  for the result of the lottery.
           There should be no repeated numbers in the numerical lottery.
           Take the min and max from user to use in the lottery...

           Compare the result and ticket than print  how many matches is there

*/

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String cikis;


        do{
            System.out.println("lutfen alacaginiz biletin hane sayisini giriniz...");
            int haneSayisi=sc.nextInt();

            System.out.println("Lutfen gireceginiz bilette bulunacak maksimum degeri giriniz ....");
            int maksimumDeger= sc.nextInt();

            System.out.println("Lutfen gireceginiz bilette bulunacak minimum degeri giriniz ....");
            int minimumDeger=sc.nextInt();


            Sayimatik bilet = new Sayimatik(haneSayisi,minimumDeger,maksimumDeger);

            bilett=bilet.sayiArray;


            Sayimatik pcnininTahmini= new Sayimatik(haneSayisi,minimumDeger,maksimumDeger);

            tahminiSayi=pcnininTahmini.sayiArray;


            System.out.println("Cikis icin q, devam etmek icin herhangi bir tus");

            cikis = sc.next();



        }while (!cikis.equalsIgnoreCase("q"));




    }



}
