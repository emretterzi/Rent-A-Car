package com.example.rentacar.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelsRequest {
    @NotNull // girdi doğrulama (input validation) işlemlerinde
    @NotBlank //veya veri modelinde geçerlilik kontrolü sağlamak için kullanılır.
    @Size(min = 3, max = 20) //@Valid sayesinde kontrol yapılır ve ğeer buna uyulmuyorsa  MethodArgumentNotValidException döndürür
    private String name;

    @NotNull // girdi doğrulama (input validation) işlemlerinde
    @NotBlank //veya veri modelinde geçerlilik kontrolü sağlamak için kullanılır.
    private int brandId;
}
