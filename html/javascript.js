'use strict'; // can prevent some potentially hazerdous scenarios
var a = 5; // don't use var, it only has global and function scope
let b = 10; // use let or const they also introduce block scope
const c = 20;

console.log('a = ' + 5 + ' b = ' + b + ' c = ' + c); // ' or " are interchangeable

// create a function that will log the type of a given parameter
function logType(param) {
  console.log(typeof(param));
}

// logType(5); // number
// logType('hello'); // string
// logType(NaN); // number 
// logType(null); // object
// logType([1,2,3]); // object
// logType(undefined); // undefined
// logType(true); // boolean
// logType(logType); // function

function scopes() {
  console.log('b is available here because it was defined outside of this function its value is' + b);
  console.log('before n is even declared its value is' + n); // here n is undefined because n declaration gets hoisted
  // console.log('before m is declared its value is' + m); // this will break the code because let does not get hoisted
  var x = 5; // var declaration gets hoisted to the top of the function
  let y = 5;
  if(true) {
    console.log('inside inner if statement x = ' + x);
    console.log('inside inner if statement y = ' + y);
    var n = 5;
    let m = 5;
  }
  console.log('ouside if n = ' + n); // n is available becasuse var is function scoped
  console.log('outside if m = ' + m); // m is not because it is block scoped
}

function testGlobalDeclaration() {
  hello = 5; // without use strict no problems if hello has not been declared, 
  // with use strict prevents this
}

function semiColonInjection() {
  let a = 
    5 
    // semi colons are not required
  return // javascript will inject semi colons for us where it feels necessary 
    a;
}

