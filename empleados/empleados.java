import javax.swing.JOptionPane;


public class empleados {

 
    public static void main(String[] args) {
      
        int opcion = 0, elemento = 0;
        cola colita = new cola();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "1. insertar un empleado\n"
                        + "2.quitar empleado\n"
                        + "3.¿hay emplados?\n"
                        + "4.cual es el primer empleado\n"
                        + "5.cuantos emplados hay\n"
                        + "6.salir", "Menu de opciones\n",
                        JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if (colita.estavacia()) {
                            colita.quitar();
                        } else {
                            System.out.print("no hay empleados");
                        }
                        break;
                    case 3:
                        if (colita.estavacia()) {
                            System.out.print("si tiene empleados");
                        } else {
                            System.out.print("hay que contratar");
                        }
                        break;
                    case 4:
                        if (!colita.estavacia()) {
                            System.out.print("el premer empleado de la empresa es" + colita.iniciocola());
                        } else {
                            System.out.print(" no hay empleados ");
                        
                        }
                        break;
                    case 5:
                        System.out.print("hay"+colita.tamañocola());
                       
                        break;
                    case 6:
                        System.out.print("   aplicacion finalizada  ");

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "error" + n.getMessage());
            }
        } while (opcion != 6);
    }

}
