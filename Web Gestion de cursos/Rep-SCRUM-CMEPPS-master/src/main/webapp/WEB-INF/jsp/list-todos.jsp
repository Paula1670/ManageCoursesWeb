<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/add-todo">Añadir tarea</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Lista de tareas</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                    <tr>
                       <th width="20%">Nombre</th>
                        <th width="30%">Descripción</th>
                        <th width="15%">Fecha Finalización</th>
                        <th width="15%">Duración</th>
                        <th width="15%">Prioridad</th>
                        <th width="20%"></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                        	<td>${todo.nombre}</td>
                            <td>${todo.description}</td>
                            <td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy" /></td>
                            <td>${todo.duracion}</td>
                            <td>${todo.prioridad}</td>  
                            <td>
                                <a type="button" class="btn btn-primary" href="/agregado-todo?id=${todo.id}">Asignar</a>
                               	<a type="button" class="btn btn-success" href="/finaliza-todo?id=${todo.id}">Finalizar</a>
                                <a type="button" class="btn btn-success" href="/update-todo?id=${todo.id}">Editar</a>
                                <a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Borrar</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</div>
<%@ include file="common/footer.jspf"%>