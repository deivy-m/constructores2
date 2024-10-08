//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil bmw = new Automovil("BMW");
        
        //bmw.setMarca("BMW");
        bmw.setModelo("320i");
        bmw.setColor("Blanco"); //toma el color blanco ya que cada objeto tiene sus propias caracteristicas
        bmw.setCilindraje(2000);

        System.out.println("bmw.verDetalle() = " + bmw.verDetalle());

        Automovil bmw2 = new Automovil("Mercedes", "c200");
        //bmw2.setMarca("BMW");
        //bmw2.setModelo("Clase G");
        bmw2.setColor("Blanco");
        bmw2.setCilindraje(2000);

        System.out.println("bmw2.verDetalle() = " + bmw2.verDetalle());

        System.out.println(bmw.equals(bmw2));

    }
}