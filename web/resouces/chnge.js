function change_color() {
    var select = document.getElementById('paint');
    document.body.style.background = select.options[select.selectedIndex].value;
    localStorage.setItem('Key', document.body.style.background);
}

function storage() {
    var localValue = localStorage.getItem('Key');
    document.body.style.background = localValue;
}

function displayTime() {
    var element = document.getElementById("clock"); // Найти элемент с id="clock"
    var now = new Date();	// Получить текущее время
    element.innerHTML = now.toLocaleTimeString(); // Отобразить его
    setTimeout(displayTime, 1000);	// Вызвать снова через 1 сек
}

function olha() {
    displayTime();
    storage();
}

function validate_form() {
    valid = true;
    if (document.contact_form.user.value == "") {
        alert("Не все поля заполнены.");
        valid = false;
    }
    return valid;
}
