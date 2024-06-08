package com.example.demo;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import io.github.cdimascio.dotenv.Dotenv;

public class MongoDBConnection {

    public static void main(String[] args) {
        // Cargar variables de entorno desde el archivo .env
        Dotenv dotenv = Dotenv.load();

        // Obtener la URI de MongoDB desde las variables de entorno
        String mongoURI = dotenv.get("MONGODB_URI");

        // Conectar a MongoDB
        try (MongoClient mongoClient = MongoClients.create(mongoURI)) {
            MongoDatabase database = mongoClient.getDatabase("mydatabase");
            System.out.println("MongoDB connected successfully to database: " + database.getName());
        } catch (Exception e) {
            System.err.println("An error occurred while connecting to MongoDB: " + e.getMessage());
        }
    }
}

