package mongoDB;

import com.mongodb.MongoException;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;

public class InsertarMongo {

    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017/?maxPoolSize=20&w=majority";
        // Crear una conexión a la base de datos "FPFactoriaProyecto"
        try(MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("FPFactoriaProyecto");

            // Obtener la colección entidades, proyectos y profesiones
            MongoCollection<Document> entidadesCollection = database.getCollection("entidades");
            MongoCollection<Document> proyectosCollection = database.getCollection("proyectos");
            MongoCollection<Document> profesionesCollection = database.getCollection("profesiones");

            // Crear documentos para las tablas con la info
            Document entidadesDoc = new Document("CODIGO", 1)
                    .append("NOMBRE", "Entidad 1")
                    .append("WEB", "www.entidad1.com")
                    .append("ID_PROFESION", 1)
                    .append("CONTACTO", "Juan Perez");
            Document proyectosDoc = new Document("TITULO", "Proyecto 1")
                    .append("DESCRIPCION", "Descripción del proyecto 1")
                    .append("ID_TAGS", 1)
                    .append("ID_PROFESION", 1)
                    .append("VALORACION", "5 estrellas")
                    .append("ID_ESTADO", 1)
                    .append("VISIBILIDAD", "Pública")
                    .append("FECHAINICIO", "01/01/2022")
                    .append("FECHAFIN", "31/12/2022");
            Document profesionesDoc = new Document("NOMBRE", "Profesión 1");

            // Insertamos los documentos
            entidadesCollection.insertOne(entidadesDoc);
            proyectosCollection.insertOne(proyectosDoc);
            profesionesCollection.insertOne(profesionesDoc);

            System.out.println("Documentos insertado correctamente");
        }catch(MongoException e){
            System.out.println("Error: " + e);
        }
    }
}
