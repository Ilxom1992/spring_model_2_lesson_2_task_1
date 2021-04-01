package com.example.demo.repositort;


import com.example.demo.entity.Attachment;
import com.example.demo.projection.CustomAttachmentContent;
import com.example.demo.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment_content", collectionResourceRel = "list",excerptProjection = CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<Attachment, Integer> {



}
