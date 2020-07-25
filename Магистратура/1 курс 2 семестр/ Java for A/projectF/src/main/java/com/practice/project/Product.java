package com.practice.project;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id_product")
    public Long id;

    @Column (name = "name")
    public String name;

    @Column (name = "price")
    public String price;

    @Column (name = "size")
    public String size;

    public Product(String name, String price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }
}
