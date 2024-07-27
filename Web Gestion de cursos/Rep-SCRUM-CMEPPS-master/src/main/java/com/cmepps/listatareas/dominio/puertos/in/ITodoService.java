package com.cmepps.listatareas.dominio.puertos.in;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cmepps.listatareas.dominio.model.Todo;


public interface ITodoService {

    List < Todo > getTodosByUser(String user);

    Optional < Todo > getTodoById(long id);

    void updateTodo(Todo todo);

    void addTodo(String name, String desc, Date targetDate, String prioridad,String duracion, String nombre, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(Todo todo);
}
