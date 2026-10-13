console.log("A");
setTimeout(() => console.log("C"), 0);
console.log("B");
Promise.resolve(5).then(valor => console.log(valor * 2));
