package com.example.demo.projection;

import com.example.demo.entity.Attachment;
import com.example.demo.entity.User;
import org.springframework.data.rest.core.config.Projection;


@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();

    String getName();

    String getSize();

    String getContentType();

}
