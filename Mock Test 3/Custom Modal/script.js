const openModalBtn = document.getElementById('openModalBtn');
const modalContainer = document.getElementById('modalContainer');
const closeModalBtn = document.getElementById('closeModalBtn');

openModalBtn.addEventListener('click', function() {
  modalContainer.style.display = 'flex';
  document.body.classList.add('modal-open');
});

closeModalBtn.addEventListener('click', function() {
  modalContainer.style.display = 'none';
  document.body.classList.remove('modal-open');
});

modalContainer.addEventListener('click', function(event) {
  if (event.target === modalContainer) {
    modalContainer.style.display = 'none';
    document.body.classList.remove('modal-open');
  }
});