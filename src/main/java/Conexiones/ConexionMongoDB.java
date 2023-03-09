package Conexiones;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class ConexionMongoDB {
    private static String SERVER = "mongodb://localhost:27017/?maxPoolSize=20&w=majority";
    private static String DATABASE = "FPFactoriaProyecto";

    private static MongoClient mongoClient = null;

    static {
        MongoClientURI uri = new MongoClientURI(SERVER);
        mongoClient = new MongoClient(uri);
    }

    public static MongoDatabase getDatabase() {
        return mongoClient.getDatabase(DATABASE);
    }
    public static void close() {
        mongoClient.close();
    }
}
