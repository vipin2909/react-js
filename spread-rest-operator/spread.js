// used to split up array elements OR Object properties

const oldArray = [3, 4, 5];
const oldObject = { a: 3, b: 4, c: 5 };

const newArray = [...oldArray, 1, 2];
const newObject = { ...oldObject, newProp: 5 };
