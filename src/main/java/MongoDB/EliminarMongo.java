package mongoDB;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.Scanner;

public class EliminarMongo {

    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017/?maxPoolSize=20&w=majority";
        // Crear una conexión a la base de datos "FPFactoriaProyecto"
        try(MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("FPFactoriaProyecto");

            // Obtener la colección entidades, proyectos y profesiones
            MongoCollection<Document> entidadesCollection = database.getCollection("entidades");
            MongoCollection<Document> proyectosCollection = database.getCollection("proyectos");
            MongoCollection<Document> profesionesCollection = database.getCollection("profesiones");

            Scanner scanner = new Scanner(System.in);
            // Eliminamos los documentos a partir del codigo
            System.out.print("Introduzca el código de las entidades a eliminar: ");
            int codigoEntidad = scanner.nextInt();
            entidadesCollection.deleteOne(Filters.eq("CODIGO", codigoEntidad));

            System.out.print("Introduzca el nombre de las profesiones a eliminar: ");
            String nombreProfesion = scanner.nextLine();
            profesionesCollection.deleteOne(Filters.eq("NOMBRE", nombreProfesion));

            System.out.print("Introduzca el código de los proyectos a eliminar: ");
            int codigoProyecto = scanner.nextInt();
            proyectosCollection.deleteMany(Filters.eq("ID_TAGS", codigoProyecto));

            // Imprimir la confirmación de inserción
            System.out.println("Documento eliminado correctamente");
        }catch(MongoException e){
            System.out.println("Error: " + e);
        }
    }

}
