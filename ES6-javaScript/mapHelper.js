var numbers = [1, 2, 3];

doubleNumbers = numbers.map(function(number) {
    return number * 2;
})

console.log(numbers);
console.log(doubleNumbers);

var cars = [
    {
        model: 'Buick',
        price: 'CHEAP'
    }, {
        model: 'Camaro',
        price: 'EXPENCIVE'
    }
];

var prices = cars.map(function(car) {
    return car.price;
})

console.log(prices);
