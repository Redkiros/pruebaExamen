package MongoDB;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class ModificarMongo {

    // Modificar un documento de la colección "entidades" según su código
    public static void modificarMDB() {
        // Crear una conexión a la base de datos "FPFactoriaProyecto"
        try {
            MongoDatabase database = Conexiones.ConexionMongoDB.getDatabase();

            // Se pide al usuario el nombre de la colección
            String coleccion = Clases.LeerDatos.pideCadena("Introduce el nombre de la coleccion que quieras modificar: \n" +
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

            // Se pide al usuario el valor del _id del documento a modificar
            String id = Clases.LeerDatos.pideCadena("Introduce el valor del _id del documento a modificar:");

            // Se crea el filtro para encontrar el documento a modificar
            Bson filtro = Filters.eq("_id", new ObjectId(id));

            // Se pide al usuario el nombre del campo a modificar y su nuevo valor
            String campo = Clases.LeerDatos.pideCadena("Introduce el nombre del campo a modificar:");
            String valor = Clases.LeerDatos.pideCadena("Introduce el nuevo valor:");

            // Se crea el documento con el campo y valor actualizados
            Document updateDoc = new Document(campo, valor);

            // Se realiza la actualización del documento
            UpdateResult result = collection.updateOne(filtro, new Document("$set", updateDoc));

            System.out.println(result.getModifiedCount() + " documento(s) modificado(s).");

        } catch (MongoException e) {
            System.out.println("Error: " + e);
        }
    }
}
