package com.joshbquinn.webcv.controller;

import com.joshbquinn.webcv.data.ToDo;
import com.joshbquinn.webcv.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public List<ToDo> findAll(){
        return toDoService.findAll();
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable Long id){
        return toDoService.findToDoById(id);
    }

    @PostMapping
    public  ToDo create(@RequestBody ToDo toDo){
        return toDoService.saveToDo(toDo);
    }

    @PutMapping("/{id}")
    public ToDo update(@RequestBody ToDo toDo){
        return toDoService.saveToDo(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        toDoService.deleteToDoById(id);
    }
}
