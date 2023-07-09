const textInput = document.getElementById('textInput');
const submitButton = document.getElementById('submitButton');
const textList = document.getElementById('textList');

submitButton.addEventListener('click', function() {
  const inputText = textInput.value;
  if (inputText.trim() !== '') {
    const li = document.createElement('li');
    li.textContent = inputText;
    textList.appendChild(li);
    textInput.value = '';
  }
});
