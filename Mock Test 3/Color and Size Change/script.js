const box = document.querySelector('.box');
let isYellow = false;

box.addEventListener('click', function() {
  if (!isYellow) {
    box.style.backgroundColor = 'yellow';
    box.style.width = '600px';
    box.style.height = '600px';

  }
});
