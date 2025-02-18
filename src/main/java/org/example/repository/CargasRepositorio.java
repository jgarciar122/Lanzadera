package org.example.repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.example.database.MongoDBConnection;
import org.example.model.Carga;

import java.util.ArrayList;
import java.util.List;

public class CargasRepositorio {
    private MongoCollection<Carga> collection;

    public CargasRepositorio() {
        MongoDatabase database = MongoDBConnection.getInstance().getDatabase();
        this.collection = database.getCollection("cargas", Carga.class);

    }

    public void insertarCarga(Carga carga) {
        collection.insertOne(carga);
    }

    public List<Carga> obtenerTodasLasCargas() {
        List<Carga> cargas = new ArrayList<>();
        MongoCursor<Carga> cursor = collection.find().iterator();

        while (cursor.hasNext()) {
            cargas.add(cursor.next());
        }
        return cargas;
    }
}

