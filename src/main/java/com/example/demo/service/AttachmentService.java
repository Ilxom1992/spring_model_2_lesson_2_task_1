package com.example.demo.service;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.AttachmentContent;
import com.example.demo.repositort.AttachmentContentRepository;
import com.example.demo.repositort.AttachmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {

    AttachmentRepository attachmentRepository;
    AttachmentContentRepository attachmentContentRepository;

    public AttachmentService(AttachmentRepository attachmentRepository, AttachmentContentRepository attachmentContentRepository) {
        this.attachmentRepository = attachmentRepository;
        this.attachmentContentRepository = attachmentContentRepository;
    }

    public String uploadFile(MultipartHttpServletRequest request) throws IOException {
        final Iterator<String> fileNames = request.getFileNames();
        final MultipartFile file = request.getFile(fileNames.next());
        if (file != null) {
            final String originalFilename = file.getOriginalFilename();
            final long size = file.getSize();
            final String contentType = file.getContentType();

            Attachment attachment = new Attachment();
            attachment.setContentType(contentType);
            attachment.setName(originalFilename);
            attachment.setSize(size);

            final Attachment save = attachmentRepository.save(attachment);

            AttachmentContent attachmentContent = new AttachmentContent();
            attachmentContent.setAttachment(save);
            attachmentContent.setBytes(file.getBytes());
            attachmentContentRepository.save(attachmentContent);
            return "File saved! File id: " + save.getId();

        }
        return "File not saved";
    }
    public void getFile(Integer id, HttpServletResponse response) throws IOException {
        final Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (optionalAttachment.isPresent()) {
            final Attachment attachment = optionalAttachment.get();
            final Optional<AttachmentContent> optionalAttachmentContent = attachmentContentRepository.findById(id);
            if (optionalAttachmentContent.isPresent()) {
                final AttachmentContent attachmentContent = optionalAttachmentContent.get();
                response.setHeader("Content-Disposition", "attachment; filename=\"" + attachment.getName() + "\"");
                response.setContentType(attachment.getContentType());
                FileCopyUtils.copy(attachmentContent.getBytes(), response.getOutputStream());
            }
        }
    }
}
