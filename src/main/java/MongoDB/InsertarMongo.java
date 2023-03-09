package MongoDB;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;
import java.util.Date;

public class InsertarMongo {

    public static void insertarMDB() {

        // Crear una conexión a la base de datos "FPFactoriaProyecto"
        try {
            MongoDatabase database = Conexiones.ConexionMongoDB.getDatabase();
            MongoCollection<Document> entidadesCol = database.getCollection("ENTIDADES");
            MongoCollection<Document> estadosCol = database.getCollection("ESTADOS");
            MongoCollection<Document> participacionesCol = database.getCollection("PARTICIPACIONES");
            MongoCollection<Document> profesionesCol = database.getCollection("PROFESIONES");
            MongoCollection<Document> proyectosCol = database.getCollection("PROYECTOS");
            MongoCollection<Document> rolesCol = database.getCollection("ROLES");
            MongoCollection<Document> tagsCol = database.getCollection("TAGS");
            MongoCollection<Document> usuariosCol = database.getCollection("USUARIOS");

            Document tag = new Document("DESCRIPCION", "descripcionTag");

            Document profesion = new Document("DESCRIPCION", "descripcionProfesion");

            Document proyecto = new Document("TITULO", "tituloProyecto")
                    .append("DESCRIPCION", "descripcionProyecto")
                    .append("ID_TAGS", Arrays.asList(tag))
                    .append("ID_PROFESION", Arrays.asList(profesion))
                    .append("VALORACION", "valoracion")
                    .append("FECHA_INICIO", new Date(01/01/2000))
                    .append("FECHA_FIN", new Date(01/01/2020));

            Document rol = new Document("DESCRIPCION", "descripcionProyecto");

            Document entidad = new Document("CODIGO", 1)
                    .append("NOMBRE", "entidad1")
                    .append("WEB", "http://www.entidad1.com")
                    .append("ID_PROFESION", Arrays.asList(profesion))
                    .append("CONTACTO", "608232323");

            Document estado = new Document("DESCRIPCION", "descripcionEstado");

            Document usuario = new Document("ID_ROL", Arrays.asList(rol))
                    .append("NOMBRE_USUARIO", "nombreUsuario")
                    .append("NOMBRE", "nombre")
                    .append("APELLIDO", "apellido")
                    .append("PASSWORD", "password")
                    .append("ID_PROFESION", Arrays.asList(profesion))
                    .append("CONTACTO", "608232323")
                    .append("PUNTUACION", "puntuacion")
                    .append("ID_ENTIDAD", Arrays.asList(entidad))
                    .append("ID_ESTADO", Arrays.asList(estado))
                    .append("ID_FAVORITOS", "favoritos");

            Document participacion = new Document("ID_ROL", Arrays.asList(rol))
                    .append("ID_USUARIO", Arrays.asList(usuario))
                    .append("ID_ENTIDAD", Arrays.asList(entidad))
                    .append("ID_PROYECTO", Arrays.asList(proyecto))
                    .append("FECHA_INICIO", new Date(01/01/2000))
                    .append("FECHA_FIN", new Date(01/01/2020));

            // Insertar el nuevo documento en la colección "ENTIDADES"
            entidadesCol.insertOne(tag);
            profesionesCol.insertOne(profesion);
            proyectosCol.insertOne(proyecto);
            rolesCol.insertOne(rol);
            entidadesCol.insertOne(entidad);
            estadosCol.insertOne(estado);
            usuariosCol.insertOne(usuario);
            tagsCol.insertOne(tag);
            participacionesCol.insertOne(participacion);

        }catch(MongoException e){
            System.out.println("Error: " + e);
        }
    }
}
