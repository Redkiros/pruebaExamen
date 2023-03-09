package MongoDB;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class EliminarMongo {

    public static void eliminarMDB() {
        // Crear una conexión a la base de datos "FPFactoriaProyecto"
        try {
            MongoDatabase database = Conexiones.ConexionMongoDB.getDatabase();

            // Se pide al usuario el nombre de la colección
            String coleccion = Clases.LeerDatos.pideCadena("Introduce el nombre de la coleccion que quieras eliminar: \n" +
                    "entidades\n" +
                    "estados\n" +
                    "favoritos\n" +
                    "participaciones\n" +
                    "proyectos\n" +
                    "roles\n" +
                    "tags\n" +
                    "usuarios");

            // Se obtiene la colección
            MongoCollection<Document> collection = database.getCollection(coleccion);

            // Se pide al usuario el valor del _id del documento a eliminar
            String id = Clases.LeerDatos.pideCadena("Introduce el valor del _id del documento a eliminar:");

            // Se crea el filtro para encontrar el documento a eliminar
            Bson filtro = Filters.eq("_id", new ObjectId(id));

            // Se realiza la eliminación del documento
            DeleteResult result = collection.deleteOne(filtro);

            System.out.println(result.getDeletedCount() + " documento(s) eliminado(s).");

        } catch (MongoException e) {
            System.out.println("Error: " + e);
        }
    }

}
