function validateForm() {
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;
    var phone = document.getElementById('phone').value;
    var password = document.getElementById('password').value;
    var age = document.getElementById('age').value;
    var gender = document.getElementById('gender').value;
    var date = document.getElementById('date').value;
    var color = document.getElementById('color').value;
  
    var nameError = document.getElementById('nameError');
    var emailError = document.getElementById('emailError');
    var phoneError = document.getElementById('phoneError');
    var passwordError = document.getElementById('passwordError');
    var ageError = document.getElementById('ageError');
    var genderError = document.getElementById('genderError');
    var dateError = document.getElementById('dateError');
    var colorError = document.getElementById('colorError');
  
    nameError.textContent = '';
    emailError.textContent = '';
    phoneError.textContent = '';
    passwordError.textContent = '';
    ageError.textContent = '';
    genderError.textContent = '';
}  