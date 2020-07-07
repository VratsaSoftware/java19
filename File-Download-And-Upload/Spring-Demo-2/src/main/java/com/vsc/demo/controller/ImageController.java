package com.vsc.demo.controller;

import com.vsc.demo.dto.ImageUploadDTO;
import com.vsc.demo.service.implementation.ImageUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class ImageController  extends BaseController {

    private final ImageUploadService imageUploadService;

    @Autowired
    public ImageController(ImageUploadService imageUploadService) {
        this.imageUploadService = imageUploadService;
    }

    @GetMapping("/image/upload")
    public ModelAndView imageUpload() {
        return send("upload");
    }

    @PostMapping("/image/upload")
    public ModelAndView imageUpload(@ModelAttribute ImageUploadDTO imageUploadDTO) throws IOException {
        imageUploadService.uploadImage(imageUploadDTO.getImage());
        return redirect("/");
    }

    @GetMapping(value = "/download")
    public @ResponseBody BufferedImage downlaod(HttpServletResponse response) throws IOException {
//        response.setHeader("Content-Type", "image/png");
//        response.setHeader("Content-Length", "5632");
//        response.addHeader("Content-Disposition", "attachment; filename=\"favicon.png\"");
//        File body = new File("favicon.png");
//        System.out.println(body.exists());
        InputStream inputStream = this.getClass().getResourceAsStream("favicon.ico");
        return ImageIO.read(inputStream);
    }
}
