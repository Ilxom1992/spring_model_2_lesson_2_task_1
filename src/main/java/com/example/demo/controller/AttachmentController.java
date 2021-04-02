package com.example.demo.controller;

import com.example.demo.service.AttachmentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("attachment")
public class AttachmentController {
    AttachmentService attachmentService;

    public AttachmentController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }

    @PostMapping
    public String uploadFile(MultipartHttpServletRequest request) throws IOException {
        return attachmentService.uploadFile(request);
    }

    @GetMapping("/{id}")
    public void getFile(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        attachmentService.getFile(id, response);
    }
}
