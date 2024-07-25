package tech.medevs.customer.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer firstname is required")
        String firstname,
        @NotNull(message = "Customer firstname is required")
        String lastname,
        @Email(message = "Customer Email is not a valid email address")
        @NotNull(message = "Customer email is required")
        String email,
        Address address
) {
}
