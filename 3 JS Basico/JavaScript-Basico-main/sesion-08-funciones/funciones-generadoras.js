function* generaId() {
    let id = 0;
    while (true) {
        id++;
        if (id === 10) {
            return id;
        }
        yield id; // Esperando hasta que se vuelva a llamar
    }
}

const gen = generaId();

console.log(gen.next().value); // Retorna: 1
console.log(gen.next().value); // Retorna: 2
console.log(gen.next().value); // Retorna: 3
console.log(gen.next().value); // Retorna: 4
console.log(gen.next().value); // Retorna: 5
console.log(gen.next().value); // Retorna: 6
console.log(gen.next().value); // Retorna: 7
console.log(gen.next().value); // Retorna: 8
console.log(gen.next().value); // Retorna: 9
console.log(gen.next().value); // Retorna: 10