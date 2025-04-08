/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let currcount = n-1;
    return function() {
        currcount +=1;
        return currcount;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */