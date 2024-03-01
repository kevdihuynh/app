package com.demo.app.database;

import com.demo.app.database.document.AddAppMessage;
import com.demo.app.database.document.AppMesssages;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository  extends MongoRepository<AppMesssages, ObjectId> {

}

