package Pawned_item;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.Date;




import jakarta.validation.constraints.*;
        import java.util.Date;

enum Rarity {
    COMMON,
    UNCOMMON,
    RARE,
    EPIC,
    LEGENDARY,
    PRICELESS,
}


public class schema {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Owner is required")
    private String OwnedBy;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than 0")
    private Float Price;

    @NotNull(message = "Rarity is required")
    private Rarity Type;

    @NotNull(message = "Start date required")
    private Date Start;

    @NotNull(message = "End date required")
    private Date End;

    // getters and setters
}

