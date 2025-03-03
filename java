// script.js
const text = document.querySelector('.text p');
const scrollSpeed = 10; // pixels per second
const scrollDistance = 100; // pixels

function animate() {
    text.style.transform = `translate(-50%, -50%) translateX(${scrollDistance}px)`;
    requestAnimationFrame(animate);
}

animate();
