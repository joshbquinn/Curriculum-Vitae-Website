package com.joshbquinn.webcv.service;

import com.joshbquinn.webcv.data.ToDo;
import com.joshbquinn.webcv.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> findAll(){
        return toDoRepository.findAll();
    }

    public ToDo findToDoById(Long id){
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo saveToDo(ToDo toDo){
        return toDoRepository.save(toDo);
    }

    public void deleteToDoById(Long id){
        toDoRepository.deleteById(id);
    }
}
