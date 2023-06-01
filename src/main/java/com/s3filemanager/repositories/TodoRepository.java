package com.s3filemanager.repositories;

import com.s3filemanager.domain.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    Todo findByTitle(String title);

}