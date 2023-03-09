package mongoDB;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ConexionMongo {

    public static void conexion(){
        // Crear una conexión a la instancia de MongoDB local (por defecto)
        String uri = "mongodb://localhost:27017/?maxPoolSize=20&w=majority";
        // Crear una conexión a la base de datos "FPFactoriaProyecto"
        try(MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("FPFactoriaProyecto");

            // Imprimir el nombre de la base de datos
            System.out.println("Conectado a la base de datos " + database.getName());
        }catch(MongoException e){
            System.out.println("Error: " + e);
        }
    }
}
