package org.example.repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.example.database.MongoDBConnection;
import org.example.model.Nave;

import java.util.ArrayList;
import java.util.List;

public class NaveRepositorio {
    private MongoCollection<Nave> collection;

    public NaveRepositorio() {
        MongoDatabase database = MongoDBConnection.getInstance().getDatabase();
        this.collection = database.getCollection("nave", Nave.class);

    }

    public void insertarNave(Nave nave) {
        collection.insertOne(nave);
    }

    public List<Nave> obtenerTodasLasNaves() {
        List<Nave> naves = new ArrayList<>();
        MongoCursor<Nave> cursor = collection.find().iterator();

        while (cursor.hasNext()) {
            naves.add(cursor.next());
        }
        return naves;
    }
}
