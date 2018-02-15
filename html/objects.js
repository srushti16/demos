// JSON, kind of but true JSON has quotes arount the keys
let obj = {
  id: 1,
  coolStuff: "corvette",
  quantity: 6
};


function CoolStuff(id, coolStuff, quantity) {
  this.getId = () => {
    return id;
  }

  this.setId = (newId) => {
    id = newId;
  }

  this.getCoolStuff = () => {
    return coolStuff;
  }

  this.setCoolStuff = (newCoolStuff) => {
    coolStuff = newCoolStuff;
  }

  this.getQuantity = () => {
    return quantity;
  }

  this.setQuantity = (newQuantity) => {
    quantity = newQuantity;
  }
}

let a = {};

function closure() {
  let b = 5;

  a.updateB = (updatedValue) => {
    b = updatedValue;
  }

  return function() {
    return b;
  }
}


