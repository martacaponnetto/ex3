public class Main {
    public static void main(String[] args) {
        Autoo auto = new Autoo(1600, "aa222bb", "bmw", "x4");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());
        System.out.println("Targa: " + auto.getTarga());
        System.out.println("Cilindrata: " + auto.getCilindrata());

        auto.setCilindrata(1800);
        auto.setTarga("XY456ZW");
        System.out.println("info aggiornate:");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());
        System.out.println("Targa: " + auto.getTarga());
        System.out.println("Cilindrata: " + auto.getCilindrata());
    }
}