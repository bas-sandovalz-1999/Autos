package bas.sandovalz;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Auto auto1 = new Auto("Yaris", "Toyota", "Rojo", 2020, 35000, "Sedan");
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Marca: " + auto1.getMarca());
        auto1.toggleEncendido();
        auto1.avanzar(120);
        auto1.retroceder(20);
        auto1.detenerse();
        auto1.toggleEncendido();
        auto1.mostrar();
    }
}

