package com.example.demo.repositort;


import com.example.demo.entity.Attachment;
import com.example.demo.projection.CustomAttachment;
import com.example.demo.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "list",excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

}
