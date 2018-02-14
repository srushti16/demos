
function add(one, two) {
  return one + two;
}

// ES6 arrow notation
// this is not a lambda becaues it is not anymous
// if we didn't assign it to a variable it would be
let multiply = (one, two) => {
  return one * two;
}


// callback function is a function that is passed in as a parameter
// to another function and invoked by that function
function apply2(fun) {
  return fun(2);
}

function add5(param) {
  return param + 5;
}

// add5 in this scenario is a callback function
console.log(apply2(add5)); // apply2 just invokes add5 with a parameter of 2

apply2((param) => {
  console.log(param + 1000);
});

// you can give default values if a param is not pased int 
function coolFunction(one = 'no param for one', two = 'no pram provided') {
  console.log(`one = ${one} and two = ${two}`);
}

