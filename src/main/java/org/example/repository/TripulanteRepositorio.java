package org.example.repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.example.database.MongoDBConnection;
import org.example.model.Tripulante;

import java.util.ArrayList;
import java.util.List;

public class TripulanteRepositorio {
    private MongoCollection<Tripulante> collection;

    public TripulanteRepositorio() {
        MongoDatabase database = MongoDBConnection.getInstance().getDatabase();
        this.collection = database.getCollection("tripulantes", Tripulante.class);

    }

    public void insertarTripulante(Tripulante tripulante) {collection.insertOne(tripulante);}

    public List<Tripulante> obtenerTodosLosTripulantes(){
        List<Tripulante> tripulantes = new ArrayList<>();
        MongoCursor<Tripulante> cursor = collection.find().iterator();

        while (cursor.hasNext()) {
            tripulantes.add(cursor.next());
        }
        return tripulantes;
    }

}
