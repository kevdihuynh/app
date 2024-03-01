package com.demo.app.database;

import com.demo.app.database.document.AddAppMessage;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddAppMessageRepository extends MongoRepository<AddAppMessage, ObjectId> {
}
