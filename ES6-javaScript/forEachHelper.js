var colors = ['rad', 'blue', 'green'];

colors.forEach(function(color) {
    console.log(color);
});

//create a array of numbers
var numbers = [
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9
];
// create a veriable to hold the sun
var sum = 0;

function adder(number) {
    sum += number;
};
//loop over the array , increment the sum variable
numbers.forEach(adder);
//print the sum veribale
console.log(sum);
