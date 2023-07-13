function getUser() {
    const username = document.getElementById('username').value;
  
    fetch(`https://api.github.com/users/${username}`)
      .then(response => response.json())
      .then(data => {
        const result = document.getElementById('result');
        result.innerHTML = `
          <img src="${data.avatar_url}" alt="Profile Picture" width="100">
          <h2>${data.name}</h2>
          <p>${data.bio}</p>
          <a href="${data.html_url}" target="_blank">View Profile</a>
        `;
      })
      .catch(error => {
        const result = document.getElementById('result');
        result.innerHTML = `<p>Error: ${error.message}</p>`;
      });
  }
  