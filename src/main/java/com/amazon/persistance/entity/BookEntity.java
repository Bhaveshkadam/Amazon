package com.amazon.persistance.entity;


import com.amazon.util.addToCart;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "book_id")
    private UUID bookId;

    @Column(name = "name")
    private String name;

    @Column(name = "book_description")
    private String bookDescription;

//    @Column(name = "author_name")
//    private AuthorEntity authorName;

    @Column(name = "book_price")
    private float bookPrice;

    @Column(name = "book_availability")
    @Enumerated(EnumType.STRING)
    private Enum bookAvailability;

    @Column(name = "added_in_cart")
    @Enumerated(EnumType.STRING)
    private addToCart addedInCart;

}
