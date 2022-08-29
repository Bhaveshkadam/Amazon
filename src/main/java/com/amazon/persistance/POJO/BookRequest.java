package com.amazon.persistance.POJO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    @NotNull(message = "Name is mandatory")
    private String name;

    private String bookDescription;

    @NotNull(message = "authorName is mandatory")
    private String authorName;

    @NotNull(message = "bookPrice is mandatory")
    private Integer bookPrice;

    @NotNull(message = "bookAvailability is mandatory")
    private Enum bookAvailability;

}
