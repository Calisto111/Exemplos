public class Main {
    public static void main(String[] args) {

        CalculoMedia calculoMedia = new CalculoMedia();

        calculoMedia.setNota1(8.0);
        calculoMedia.setNota2(7.8);
        calculoMedia.setNota3(9.2);
        calculoMedia.setNota4(8.5);

        System.out.println("As notas são "+ calculoMedia.getNota1() + " " + calculoMedia.getNota2() + " " + calculoMedia.getNota3() + " " + calculoMedia.getNota4());
        System.out.println("A média é " + calculoMedia.retornaMedia());
    }
}