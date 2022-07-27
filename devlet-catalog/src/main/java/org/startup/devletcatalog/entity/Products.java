package org.startup.devletcatalog.entity;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "catalog")
public class Products {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "available")
    private boolean available;

    @Column(name = "best_seller")
    private boolean bestSeller;

    @Column(name = "url")
    private String url;


    @Column(name = "created_time")
    @CreatedDate
    private ZonedDateTime createdTime;

    @Column(name = "update_time")
    @UpdateTimestamp
    private Instant updateTime;

    public Products() {
    }

    public Products(String id, String name, String image, boolean available, boolean bestSeller, String url, ZonedDateTime createdTime, Instant updateTime) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.available = available;
        this.bestSeller = bestSeller;
        this.url = url;
        this.createdTime = createdTime;
        this.updateTime = updateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(boolean bestSeller) {
        this.bestSeller = bestSeller;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl() {
        this.url = "products/" + getId();
    }

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return id.equals(products.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
