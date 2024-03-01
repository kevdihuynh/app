package com.demo.app.database.document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppMesssages {
    @Id
    private ObjectId id;
    private String msg;
    private String date;
}
