package com.demo.app.database.document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
public class AddAppMessage {

    private String msg;
    private String date;

    public AddAppMessage(String msg, String date) {
        super();
        this.msg = msg;
        this.date = date;
    }

}
