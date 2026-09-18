package com.api.blog_api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record PostRequestDto(@NotBlank(message = "Obrigatório")
                             @Size(max = 70, message = "no máximo 70 caracteres")
                             String autor,

                             @NotBlank(message = "Obrigatório")
                             @Size(max = 100, message = "no máximo 100 caracteres")
                             String titulo,

                             @NotBlank(message = "obrigatório")
                             String texto) {
}
