public class Automovil {
    private String marca;
    private String modelo;
    private String color = "negro";
    private int cilindraje;

    //constructores


    // el metodo debe ser publico para acceder a los atributos privados

    //como es constructor no devuelve ningun valor porque solo reserva memoria
    public Automovil() {
    }

    //se uso un constructor para parametros y ya no se uso el setMarca en este caso
    public Automovil(String marca){
        this.marca = marca;
    }

    public Automovil(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodo set y get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }


    //metodos propios y de calculo

    public String verDetalle(){
        String dv = "Marca: " + this.marca + "\t" +
                "Modelo: " + getModelo() + "\t" +
                "Color: " + getColor() + "\t" +
                "Cilindraje: " + getCilindraje();
        return dv;
    }

    //modificacion de metodos nativos
}
