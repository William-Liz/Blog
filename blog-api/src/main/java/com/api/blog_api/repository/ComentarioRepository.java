package com.api.blog_api.repository;

import com.api.blog_api.model.ComentarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ComentarioRepository extends JpaRepository<ComentarioModel, UUID> {
}
