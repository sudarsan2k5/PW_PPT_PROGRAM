function validateForm(event) {
    event.preventDefault();
  
    const form = document.getElementById('myForm');
    const inputs = form.querySelectorAll('input, select');
  
    let isValid = true;
  
    inputs.forEach(input => {
      if (input.checkValidity()) {
        showSuccess(input);
      } else {
        showError(input, input.validationMessage);
        isValid = false;
      }
    });
  
    if (isValid) {
      form.reset();
      alert('Form submitted successfully!');
    }
  }
  
  function showError(input, message) {
    const formGroup = input.closest('.form-group');
    const error = formGroup.querySelector('.error-message');
  
    if (!error) {
      const errorElement = document.createElement('div');
      errorElement.classList.add('error-message');
      errorElement.innerText = message;
      formGroup.appendChild(errorElement);
    } else {
      error.innerText = message;
    }
  
    formGroup.classList.add('error');
  }
  
  function showSuccess(input) {
    const formGroup = input.closest('.form-group');
    const error = formGroup.querySelector('.error-message');
  
    if (error) {
      error.remove();
    }
  
    formGroup.classList.remove('error');
  }
  
  const form = document.getElementById('myForm');
  form.addEventListener('submit', validateForm);
  