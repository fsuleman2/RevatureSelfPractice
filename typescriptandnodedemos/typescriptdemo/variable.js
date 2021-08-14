// var regNo:number = 464;
// console.log("Hello World" + regNo);
let sName = 'Suleman';
console.log(sName);
//to compile this file 
//tsc filename.ts
//for running a file
//node filename.tstsc
function add(n1, n2) {
    return n1 + n2;
}
let total = add(2, 4);
console.log(total);
let names = ['rahul', 'rajesh'];
for (let index = 0; index < names.length; index++) {
    let element = names[index];
    console.log(element);
}
console.log("Iam for of\n");
//for of loop
for (const score of names) {
    console.log(score);
}
//for each loop
console.log("\nIam for each\n");
names.forEach(e => console.log(e));
//# sourceMappingURL=variable.js.map