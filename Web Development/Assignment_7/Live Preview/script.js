// Get form input elements
const nameInput = document.getElementById('nameInput');
const emailInput = document.getElementById('emailInput');
const messageInput = document.getElementById('messageInput');

// Get preview elements
const namePreview = document.getElementById('namePreview');
const emailPreview = document.getElementById('emailPreview');
const messagePreview = document.getElementById('messagePreview');

// Add event listeners to form inputs
nameInput.addEventListener('input', updatePreview);
emailInput.addEventListener('input', updatePreview);
messageInput.addEventListener('input', updatePreview);

// Function to update the preview section
function updatePreview() {
  namePreview.textContent = nameInput.value;
  emailPreview.textContent = emailInput.value;
  messagePreview.textContent = messageInput.value;
}
