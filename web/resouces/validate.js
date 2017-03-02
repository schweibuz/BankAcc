function checkForm(form){
    if (document.getElementById('user').value=="") {
        document.getElementById('err_fio').innerHTML='Введите имя';
        return false;
    };
    return true;
};





function validateForm() {
    var x = document.forms["myForm"]["password"].value;
    var y = document.forms["myForm"]["user"].value;
    var z = document.forms["myForm"]["email"].value;
    var h = document.forms["myForm"]["credit_card"].value;
    var w = document.forms["myForm"]["name"].value;
    var q = document.forms["myForm"]["last_name"].value;
    if (x == "") {
        alert("Password must be filled out");
        return false;
    }else if(y == "") {
        alert("Login must be filled out")
        return false;
    }else if (z =="") {
        alert("Email must be filled out")
        return false;
    }else if (h == "") {
        alert("Credit card must be filled out")
        return false;
    }else if (w == "") {
        alert("Name must be filled out")
        return false;
    }else if (q == "") {
        alert("Last_name must be filled out")
        return false;
    }
}





function validateURL(url) {
    var reurl = /^(http[s]?:\/\/){0,1}(www\.){0,1}[a-zA-Z0-9\.\-]+\.[a-zA-Z]{2,5}[\.]{0,1}/;
    return reurl.test(url);
}

function validate_Form()
{
    // Validate URL
var url = $("#frurl").val();
if (validateURL(url)) { } else {
    alert("Please enter a valid URL, remember including http://");
}

// Validate Title
var title = $("#frtitle").val();
if (title=="" || title==null) { } else {
    alert("Please enter only alphanumeric values for your advertisement title");
}

// Validate Email
var email = $("#fremail").val();
if ((/(.+)@(.+){2,}\.(.+){2,}/.test(email)) || email=="" || email==null) { } else {
    alert("Please enter a valid email");
}
return false;
}






function showError(container, errorMessage) {
    container.className = 'error';
    var msgElem = document.createElement('span');
    msgElem.className = "error-message";
    msgElem.innerHTML = errorMessage;
    container.appendChild(msgElem);
}

function resetError(container) {
    container.className = '';
    if (container.lastChild.className == "error-message") {
        container.removeChild(container.lastChild);
    }
}

function validate(form) {
    var elems = form.elements;

    resetError(elems.user.parentNode);
    if (!elems.user.value) {
        showError(elems.user.parentNode, ' Укажите от кого.');
    }

    resetError(elems.password.parentNode);
    if (!elems.password.value) {
        showError(elems.password.parentNode, ' Укажите пароль.');
    // } else if (elems.password.value != elems.password2.value) {
    //     showError(elems.password.parentNode, ' Пароли не совпадают.');
    }

    resetError(elems.name.parentNode);
    if (!elems.name.value) {
        showError(elems.name.parentNode, ' Укажите, куда.');
    }

    resetError(elems.last_name.parentNode);
    if (!elems.last_name.value) {
        showError(elems.last_name.parentNode, ' Отсутствует текст.');
    }

}