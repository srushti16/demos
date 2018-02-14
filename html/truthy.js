
/*
  all numbers other than 0 are true
  all strings other than empty string is true
  null is false
  undefined is false
  NaN is false
  false is false
  other than that just about everything would be truthy
 */



function comparisons(one, two) {
  if(one == two) {
    console.log('== is true');
  } else {
    console.log('== is false');
  }

  if(one === two) {
    console.log('=== is true');
  } else {
    console.log('=== is false');
  }

}
