const dataList = document.getElementById('dataList');

// Show skeleton loader while data is being fetched
dataList.innerHTML = getLoaderHTML(5);

// Fetch data from JSON Placeholder API
fetch('https://jsonplaceholder.typicode.com/posts')
  .then(response => response.json())
  .then(data => {
    // Remove skeleton loader
    dataList.innerHTML = '';

    // Display fetched data
    data.forEach(item => {
      const li = document.createElement('li');
      li.textContent = item.title;
      dataList.appendChild(li);
    });
  })
  .catch(error => {
    console.log('Error:', error);
  });

// Function to generate HTML for skeleton loader
function getLoaderHTML(count) {
  let html = '';
  for (let i = 0; i < count; i++) {
    html += '<li class="skeleton"></li>';
  }
  return html;
}
