let str = 'hello'; // single quotes will create a string
let str2 = "string 2"; // double quotes will also create a string

// in ES6 template liters were introduced as a thrid way of creating strings
// they use the back tick `
// they allow for multiline strings
// they also allow for expressions ${}
let str3 = 
`hello
world
str2 = ${str2}
5 + 10 = ${5 + 10}
`;

console.log(str3);
