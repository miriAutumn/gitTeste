let math, n1, n2;

let calculus = (n1, n2, math) => {
    switch(math) {
        case 'A':
            return n1 + n2;
        break;
        case 'S':
            return n1 - n2;
        break;
        case 'M':
            return n1 * n2;
        break;
        case 'D':
            return n1 / n2;
        break;
        default:
            return "ERROR";
        break;
    }
};

console.log(calculus(6, 5, 'D'));