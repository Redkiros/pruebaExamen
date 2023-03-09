package MongoDB;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MostrarMongo {

    public static void mostrarMDB() {
        try {
            MongoDatabase database = Conexiones.ConexionMongoDB.getDatabase();

            // Se pide al usuario el nombre del proyecto y después se muestran los datos de ese proyecto
            String coleccion = Clases.LeerDatos.pideCadena("Introduce el nombre de la colección que quieras mostrar: \n" +
                    "entidades\n" +
                    "estados\n" +
                    "favoritos\n" +
                    "participaciones\n" +
                    "proyectos\n" +
                    "roles\n" +
                    "tags\n" +
                    "usuarios");
            String campo = Clases.LeerDatos.pideCadena("Introduce el nombre del campo que quieres buscar en la colección " + coleccion + ": ");
            String valor = Clases.LeerDatos.pideCadena("Introduce el valor del campo " + campo + " que quieres buscar en la colección " + coleccion + ": ");

            //Se hace una busqueda en la coleccion que se ha introducido usando un filtro a traves del valor que se ha dado y guarda los resultados en un documento para mostrarlos despues
            FindIterable<Document> iterDoc = database.getCollection(coleccion).find(new Document(campo, valor));

            for(Document doc : iterDoc) {
                System.out.println(doc.toJson());
            }

        }catch(MongoException e){
            System.out.println("Error: " + e);
        }
    }
}
