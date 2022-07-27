package org.startup.devletcatalog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category", schema = "catalog")
public class Category {

    @Id
    @Column(name = "id", nullable = false)
    private String id;


}
