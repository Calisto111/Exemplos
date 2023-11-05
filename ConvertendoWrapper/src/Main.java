public class Main {
    public static void main(String[] args) {
        ConverteValor converteValor = new ConverteValor();

        Integer a1;
        Double a2;

        converteValor.setValor1(10);
        converteValor.setValor2(20.0);
        a1 = converteValor.getValor1();
        a2 = converteValor.getValor2();

        System.out.println(a1.byteValue());
        System.out.println(a2.byteValue());



    }
}