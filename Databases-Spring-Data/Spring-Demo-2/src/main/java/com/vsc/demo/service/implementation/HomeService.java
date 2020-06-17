package com.vsc.demo.service.implementation;

import com.vsc.demo.dto.DemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    private SecondsService secondsService;

    public DemoDTO getHomeQuery(String query) {
        String response = "asdas dasd asd asd as";
        if (query != null) {
            response += " " + query;
        }

        DemoDTO dto = new DemoDTO();
        dto.setSomething(response);
        if (query != null) {
            dto.setOther(query.length());
        }

        return dto;
    }
}
