package com.example.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.demo.entity.template.AbsEntity;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Currency extends AbsEntity {

}
