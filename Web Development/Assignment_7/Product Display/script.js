const productContainer = document.getElementById('product-container');

// Fetch products from the API
fetch('https://fakestoreapi.com/products')
  .then(response => response.json())
  .then(products => {
    // Loop through the products and create product cards
    products.forEach(product => {
      const card = document.createElement('div');
      card.classList.add('product-card');

      const image = document.createElement('img');
      image.src = product.image;
      card.appendChild(image);

      const title = document.createElement('h3');
      title.textContent = product.title;
      card.appendChild(title);

      const price = document.createElement('p');
      price.textContent = `$${product.price}`;
      card.appendChild(price);

      productContainer.appendChild(card);
    });
  })
  .catch(error => {
    console.error('Error:', error);
    const errorMessage = document.createElement('p');
    errorMessage.textContent = 'Failed to fetch products.';
    productContainer.appendChild(errorMessage);
  });
