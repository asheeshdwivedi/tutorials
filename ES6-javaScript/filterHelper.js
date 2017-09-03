var products = [
    {
        name: 'cucumber',
        type: 'vegetable',
        quantity: 0,
        price: 1
    }, {
        name: 'banana',
        type: 'fruit',
        quantity: 10,
        price: 15
    }, {
        name: 'celery',
        type: 'vegetable',
        quantity: 30,
        price: 9
    }, {
        name: 'orange',
        type: 'fruit',
        quantity: 3,
        price: 5
    }
]

var filterProduct = products.filter(function(product) {
    return product.type === 'vegetable' && product.quantity > 0 && product.price < 10;
});

console.log(filterProduct);

//f ind helper

var users = [
    {
        name: 'Jill',
        //id: 1
    }, {
        name: 'Alex',
        //id: 2
    }, {
        name: 'Bill',
        //id: 3
    }, {
        name: 'Alex',
        //id: 4
    }
];

var test = users.find(function(user) {
    return user.name = 'Alex';
});
console.log(test);
