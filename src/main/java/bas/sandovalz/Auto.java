package bas.sandovalz;

public class Auto {
    // Atributos
    private String modelo;
    private String marca;
    private String color;
    private int anio;
    private double km;
    private String tipo;

    // Nuevos atributos
    private boolean encendido;     // true = motor prendido, false = apagado
    private boolean enMovimiento;  // true = está avanzando/retrocediendo, false = detenido

    // Constructor
    public Auto(String modelo, String marca, String color, int anio, double km, String tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.km = km;
        this.tipo = tipo;
        this.encendido = false;    // arranca apagado
        this.enMovimiento = false; // arranca detenido
    }

    // Getters y setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getColor() {
        return color;
    }
    public int getAnio() {
        return anio;
    }
    public double getKm() {
        return km;
    }
    public String getTipo() {
        return tipo;
    }

    // Metodo prender motor
    public void toggleEncendido() {
        encendido = !encendido;
        if (encendido) {
            System.out.println("Motor encendido.");
        } else {
            System.out.println("Motor apagado y auto detenido.");
            enMovimiento = false;  // si se apaga el motor, se detiene el vehiculo
        }
    }

    // Metodo para detener
    public void detenerse() {
        if (!encendido) {
            System.out.println("El motor está apagado, el vehículo ya está detenido.");
            return;
        }
        enMovimiento = false;
        System.out.println("Vehiculo detenido.");
    }

    // Metodo avanzar
    public void avanzar(double distancia) {
        if (!encendido) {
            System.out.println("Motor apagado. No se puede avanzar.");
            return;
        }
        km += distancia;
        enMovimiento = true;   // al avanzar, el vehiculo está en movimiento
        System.out.println("Avanzando: " + distancia + " km. Km totales: " + km);
    }

    // Metodo retroceder
    public void retroceder(double distancia) {
        if (!encendido) {
            System.out.println("Motor apagado. No se puede retroceder.");
            return;
        }
        km -= distancia;
        enMovimiento = true;   // al retroceder, tambien esta en movimiento
        System.out.println("Retrocediendo: " + distancia + " km. Km totales: " + km);
    }
    // Metodo de print de todos los atributos
    public void mostrar() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Anio: " + anio);
        System.out.println("Km: " + km);
        System.out.println("Tipo: " + tipo);
        System.out.println("Encendido: " + encendido);
        System.out.println("EnMovimiento: " + enMovimiento);
    }
}