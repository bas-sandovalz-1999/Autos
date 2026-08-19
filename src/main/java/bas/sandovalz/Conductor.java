package bas.sandovalz;

public class Conductor {
    // atributos
    private String nombre;
    private String apellido;
    private String tipoLicencia;
    private int edad;
    private boolean conducir;

    // constructores
    public Conductor(String nombre, String apellido, String tipoLicencia, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoLicencia = tipoLicencia;
        this.edad = edad;
        this.conducir = true;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String get_tipoLicencia() {
        return tipoLicencia;
    }
    public void get_tipoLicencia(String tipo_licencia) {
        this.tipoLicencia = tipo_licencia;
    }
    public int get_edad() {
        return edad;
    }
    public void set_edad(int edad) {
        this.edad = edad;
    }

    //metodos
    public void permisos() {
        if (edad < 18 || edad > 90) {
            conducir = false;
            System.out.println("Debe cumplir el requisito de edad para conducir");
        }
        System.out.println("Conductor: " + nombre + " " + apellido + "Puede conducir");
    }

    public void mostrar_conductor() {
        System.out.println("Conductor: " + nombre + " " + apellido);
        System.out.println("Tipo: " + tipoLicencia);
        System.out.println("Edad: " + edad);
        System.out.println("Puede: " + conducir);
    }

}
