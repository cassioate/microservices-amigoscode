package com.tessaro.customer.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
}
