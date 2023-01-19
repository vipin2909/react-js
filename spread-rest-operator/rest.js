// Used to merge a list of function agruments into an array

function sortArgs(...args) {
  return args.filter((el) => el >= 2);
}

const result = sortArgs(2, 1, 4, 3, 5, 6);

console.log(result);
