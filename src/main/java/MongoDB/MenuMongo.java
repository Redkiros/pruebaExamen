package MongoDB;

import Conexiones.ConexionMySQL;

import java.sql.Connection;

public class MenuMongo {
    public static void menuMDB(){

        boolean salir = false;
        int opcion;

        try (Connection conexion = ConexionMySQL.handleBD()) {

            if (conexion != null) System.out.println("conexion establecida");

            while (!salir) {

                System.out.println("1. Insertar datos MongoDB");
                System.out.println("2. Eliminar datos MongoDB");
                System.out.println("3. Mostrar datos MongoDB");
                System.out.println("4. Modificar datos MongoDB");
                System.out.println("0. Salir");

                opcion = Clases.LeerDatos.pideInt("");
                switch (opcion) {
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        MongoDB.InsertarMongo.insertarMDB();
                        break;
                    case 2:
                        MongoDB.EliminarMongo.eliminarMDB();
                        break;
                    case 3:
                        MongoDB.MostrarMongo.mostrarMDB();
                        break;
                    case 4:
                        MongoDB.ModificarMongo.modificarMDB();
                        break;
                    default:
                        System.out.println("");
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
