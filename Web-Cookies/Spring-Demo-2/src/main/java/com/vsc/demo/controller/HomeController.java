package com.vsc.demo.controller;

import com.vsc.demo.dto.DemoDTO;
import com.vsc.demo.service.implementation.HomeService;
import com.vsc.demo.service.implementation.SecondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {

    private final HomeService homeService;
    private final SecondsService secondsService;

    @Autowired
    public HomeController(HomeService homeService, SecondsService secondsService) {
        this.homeService = homeService;
        this.secondsService = secondsService;
    }

    @GetMapping("/")
    public ModelAndView index(
            @RequestParam(value = "q", required = false) String query,
            ModelAndView modelAndView) {
        DemoDTO result = homeService.getHomeQuery(query);
        return send("index", "dto", result);
    }

    @PostMapping("/")
    public ResponseEntity<String> index(@RequestBody DemoDTO demoDTO) {
        String[] asd = new String[]{"asdasd", "asdasdad"};
        for (String s : asd) {

        }
        return ResponseEntity.ok("Request:{firstVar = " + demoDTO.getSomething() + ", secondVar = " + demoDTO.getOther() + "}");
    }

    @GetMapping("/demo")
    public ModelAndView demo() {
        return send("demo");
    }
}
