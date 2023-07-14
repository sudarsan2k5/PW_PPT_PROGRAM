import React, { useState } from 'react';
import axios from 'axios';

const GithubUserFinder = () => {
  const [username, setUsername] = useState('');
  const [userData, setUserData] = useState(null);

  const handleChange = (e) => {
    setUsername(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios
      .get(`https://api.github.com/users/${username}`)
      .then((response) => {
        setUserData(response.data);
      })
      .catch((error) => {
        console.error(error);
      });
  };

  return (
    <div>
      <h1>Github User Finder</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Enter a GitHub username"
          value={username}
          onChange={handleChange}
        />
        <button type="submit">Search</button>
      </form>

      {userData && (
        <div>
          <img src={userData.avatar_url} alt="Avatar" />
          <h2>{userData.name}</h2>
        </div>
      )}
    </div>
  );
};

export default GithubUserFinder;
