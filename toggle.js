
window.onscroll = function() { scrollFunction(); };

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    document.getElementById('scrollBtn').style.display = 'block';
  } else {
    document.getElementById('scrollBtn').style.display = 'none';
  }
}


function topFunction() {
  document.body.scrollTop = 0; 
  document.documentElement.scrollTop = 0; 
}

document.getElementById('contactForm').addEventListener('submit', function(event) {
  event.preventDefault();

  var phone = document.getElementById('phone').value;
  var email = document.getElementById('email').value;
  var message = document.getElementById('message').value;

  fetch('', { 
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({ phone: phone, email: email, message: message }),
  })
  .then(response => response.json())
  .then(data => {
    console.log('Success:', data);
    
  })
  .catch((error) => {
    console.error('Error:', error);
    
  });
});

