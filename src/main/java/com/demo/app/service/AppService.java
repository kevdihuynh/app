package com.demo.app.service;

import com.demo.app.database.AddAppMessageRepository;
import com.demo.app.database.AppRepository;
import com.demo.app.database.document.AddAppMessage;
import com.demo.app.database.document.AppMesssages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    private AppRepository appRepository;

    @Autowired
    private AddAppMessageRepository addAppMessageRepository;

    public List<AppMesssages> findAllMessages() {
        return appRepository.findAll();
    }

    public void saveMessage(AddAppMessage addAppMessage) {
        addAppMessageRepository.save(addAppMessage);
    }
}
