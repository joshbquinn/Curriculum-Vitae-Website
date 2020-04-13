package com.joshbquinn.webcv.repository;

import com.joshbquinn.webcv.data.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
