public class Main {
    public static void main(String[] args) {

        double s=0.0;
        for (double a=1.0;a<=97.0; a =a+2 ){
                s =s+ a/(a+2);
            //System.out.println(a);
        }
        System.out.println("Serii: 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + " +
                        " ... + 95 / 97 + 97 / 99");
        System.out.println("suma= "+s);
    }
}