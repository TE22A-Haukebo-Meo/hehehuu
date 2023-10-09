import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Droppa ett feeeetttt tal");
        Scanner tb = new Scanner(System.in);
        int tal = tb.nextInt();
        int rund = tal+500;
        int split = rund/1000;
        int klar = split*1000;

        System.out.println(tal+" avrundat till närmaste tuental blir: "+klar);
        
        tb.nextLine();

        System.out.println("Droppa en såndär täljare");
        int täljare = tb.nextInt();
        System.out.println("Droppa en nämnare");
        int nämnare = tb.nextInt();

        int blandad = täljare/nämnare;
        int modulo = täljare%nämnare;

        System.out.println(täljare+"/"+nämnare+"="+blandad+" "+modulo+"/"+nämnare);


    }
}
