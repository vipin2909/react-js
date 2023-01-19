// Easily extract array elements or object properties
// and store them in variables

// Array Destructuring
[a, b] = ["Hello", "World"];
console.log(a);
console.log(b);

// Object Destructuring
const person = {
  name: "John",
  age: 20,
  hobbies: ["coding", "react", "js"],
};

const { name, age, hobbies } = person;
console.log(name);

console.log(age);
console.log(hobbies[0].substring(0, 3));

const arr = [1, 2, 3, 4, 5];
const newArray = arr;

newArray[0] = 10;
console.log(arr);
