var taskArea = document.querySelector('#taskArea');



function createTask(){
    let task = {
        "name": $('#taskName').val(),
        "description": $('#taskDescription').val(),
        "time": $('#taskTime').val()
    }

    $.ajax({
        url: 'api/tasks',
        method: 'POST',
        data: task,
    });
}

function getAllTasks(){
    $.ajax({
        url: 'api/tasks',
        method: 'GET',
        data: task,
    }).done(({content}) => {content.forEach(
        function printTasks(currentContent){
            var messageElement = addTask(currentContent);
            taskArea.append(messageElement);
        }
    )});

 function addTask(task){
     var taskElement = document.createElement('li');
     var messageText = document.createTextNode(task.content);
     taskElement.appendChild(messageText);
     return taskElement;
 }
}