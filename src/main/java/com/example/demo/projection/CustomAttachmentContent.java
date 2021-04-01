package com.example.demo.projection;

import com.example.demo.entity.AttachmentContent;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();

    String getByte();
    @Value("#{target.attachment.id}")
    String getAttachmentId();

}
