package Conexiones;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**********************************************************************************************************************************************
 *   APLICACIÓN: "JLC_SAM"                                                                                                                    *
 **********************************************************************************************************************************************
 *   ACCESO A DATOS - FACTORÍA DE PROYECTOS 2DAM  -  Intellij Ultimate IDE v2022.3.2                                                          *
 **********************************************************************************************************************************************
 *   @author Jorge Otin Caba, Laura Butler Gracia, Jose Manuel Sanchez del Palacio                  										  *
 *   @since 13-ENERO-2023                                                                                                                     *
 **********************************************************************************************************************************************
 *   COMENTARIOS:                                                                                                                             *
 *        - Clase ConexionMySQL.                                                                                                              *
 *        - Clase que contiene métodos para conectar con la base de datos MySQL.                                                              *
 **********************************************************************************************************************************************/
public class ConexionMySQL {

    private static String SERVER = "jdbc:mysql://fp2.croh1mygfad5.eu-west-3.rds.amazonaws.com/"; //Añadimos la ruta del servidor
    private static String BD = "BdFactoriaProyectos"; //Añadimos el nombre de la base de datos
    private static String USER = "admin"; //Añadimos el usuario
    private static String PASW = "FP2%SanAlberto"; //Añadimos la contraseña

    static DataSource poolConexiones() { //Creamos el pool de conexiones
        String URL = SERVER + BD;
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl(URL);
        bds.setUsername(USER);
        bds.setPassword(PASW);
        bds.setInitialSize(10);
        return bds;
    }

    public static Connection handleBD() throws SQLException { //Creamos la conexión
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl(SERVER);
        bds.setUsername(USER);
        bds.setPassword(PASW);
        bds.setInitialSize(10);
        Connection con = bds.getConnection();
        return con;
    }

    //Método para realizar la conexión.
    public static Connection conectar() throws SQLException { //Creamos la conexión
        return poolConexiones().getConnection();
    }

}
