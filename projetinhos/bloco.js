var n1 = prompt("Jogador 1, digite um número: ");
n1 = parseFloat(n1);
var n2 = prompt("JOgador 2, digite outro número: ");
n2 = parseFloat(n2);
var num = Math.floor(Math.random);

if(n1 == num) {
    alert('O jogador 1 ganhou!');
} 
if(n2 == num) {
    alert('O jogador 2 ganhou!');
}


// Declaração de função simples
function sayHelloWorld() { 
    return "Hello, Wolrd!";
}


// Declaração de função como expressão
const sayHelloWorld = function() {
    return "Hello, World!";
}

// Declação de função como arrow function
const sayHelloWorld = () => "Hello, World";
