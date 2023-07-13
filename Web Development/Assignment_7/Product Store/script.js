const productContainer = document.getElementById('product-container');
const cartItemsContainer = document.getElementById('cart-items');

// Fetch products from API
fetch('https://fakestoreapi.com/products')
  .then(response => response.json())
  .then(products => {
    // Display products in UI
    products.forEach(product => {
      const productCard = createProductCard(product);
      productContainer.appendChild(productCard);
    });
  })
  .catch(error => {
    console.error('Error fetching products:', error);
  });

// Create a product card element
function createProductCard(product) {
  const card = document.createElement('div');
  card.classList.add('product-card');

  const image = document.createElement('img');
  image.src = product.image;
  image.alt = product.title;
  image.style.width = '100px';
  card.appendChild(image);

  const title = document.createElement('h3');
  title.textContent = product.title;
  card.appendChild(title);

  const price = document.createElement('p');
  price.textContent = `$${product.price}`;
  card.appendChild(price);

  const addToCartButton = document.createElement('button');
  addToCartButton.textContent = 'Add to Cart';
  addToCartButton.addEventListener('click', () => {
    addToCart(product);
  });
  card.appendChild(addToCartButton);

  return card;
}

// Add a product to the cart
function addToCart(product) {
  const cartItem = createCartItem(product);
  cartItemsContainer.appendChild(cartItem);
}

// Create a cart item element
function createCartItem(product) {
  const cartItem = document.createElement('div');
  cartItem.classList.add('cart-item');

  const image = document.createElement('img');
  image.src = product.image;
  image.alt = product.title;
  image.style.width = '100px';
  cartItem.appendChild(image);

  const title = document.createElement('h3');
  title.textContent = product.title;
  cartItem.appendChild(title);

  const price = document.createElement('p');
  price.textContent = `$${product.price}`;
  cartItem.appendChild(price);

  return cartItem;
}
