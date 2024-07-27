package com.cmepps.listatareas.aplicacion.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmepps.listatareas.dominio.model.Todo;
import com.cmepps.listatareas.dominio.puertos.in.ITodoService;
import com.cmepps.listatareas.infraestructura.repository.TodoRepository;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List < Todo > getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional < Todo > getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String name, String desc, Date targetDate, String prioridad,String duracion, String nombre, boolean isDone) {
        todoRepository.save(new Todo(name, desc, targetDate, prioridad, duracion, nombre, isDone));
    }

    @Override
    public void deleteTodo(long id) {
        Optional < Todo > todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }
}
