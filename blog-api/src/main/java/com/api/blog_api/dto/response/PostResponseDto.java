package com.api.blog_api.dto.response;

import java.time.LocalDate;
import java.util.UUID;

public record PostResponseDto(
        UUID id,
        String autor,
        LocalDate date,
        String titulo,
        String texto
) {
}
