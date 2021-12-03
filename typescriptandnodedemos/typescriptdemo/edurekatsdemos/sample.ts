//Basic DataTypes
/**
 * var [identifier] : [type-annotation] = value;
 * var [identifier] : [type-annotation];
 * var [identifier] = value;
 * var [identifer];
 * 1. Boolean
 * 2.Number
 * 3.Strings
 * 4.undefined
 * 5.null
 */
let b : boolean = false;
console.log(b);

let n : number = 2; //for octal 0o123;0b123,0x123;
console.log(n);
 
let fName : string = "Suleman";
console.log(fName);

let arr_1st_method : string[] = ["Ts","JS"]
let arr_2nd_method : Array<String> = ["TS","Js"];

//Tuples
let tup  : [number,string];

//constants
const const_var = 10;

//enum: enums in JS allows to define set of named constant
//1.numeric enum
enum fruit{
    apple = 1,
    banana, //2
    mango, //3
    orange //4
    //here banana mango and orange auto incremented
    //banana will be 2 mango will be 3 and orange wil be 3
}
let fruitName : string = fruit[4];
console.log(fruitName);

//any time when u do not know data type value to avoid compile time error
let any_var : any;
any_var = 10;
any_var = "Suleman";

//object type : Object type represents a non-primitive type in typeScript which means 
/**
 * it can be any time except
 * not a number
 * string
 * boolean
 * symbol
 * null
 * undefined
 */
//declare object var
let obj : object;

//diff b/w let and var
function myfun(){
    for(var i=1;i<=2;i++){
        console.log("Welcome: "+i);
    }
    console.log("Final value of i is:"+i);
}
myfun();

// function myfun1(){
//     for(let i=1;i<=2;i++){
//         console.log("Welcome: "+i);
//     }
//     console.log("Final value of i is:"+i);
// }
// myfun1();

//Type Assertion : will help you to specify type of the var even if you didn't specify declaring it.
//TS also allows us to declare a varibale without specifiying its type
// let myVar;
// let myVar2 : number = (myVar as string)

//functions in TS
//normal function
function product(x:number,y:number){ //default will be any for x and y
    return x+y;
}
console.log(product(2,3));

//annoymous function
let w = function(x:number,y:number){
    return x*y;
}
console.log(w(2,4));

//arrow function
let arrowFun = () => console.log("Hello");

//Classes in TS
class MyClass {
    j : number;
    constructor(k:number){
        this.j = k;
    }
    value(){
        return("The number is "+this.j);
    }
}
let myobj = new MyClass(7);
console.log(myobj.value());
//inheritance in TS 
/**child classes can inherit everything except private members
 * and constructors from the parent class
 * TS does not support multiple inheritance
 * it uses extends keywords
 * we can also use private,protected and public
 */
 class ParentClass {
    j : number;
    constructor(k:number){
        this.j = k;
    }
    value(){
        return("The number is "+this.j);
    }
}
class ChildClass extends ParentClass{
    l:number;
    constructor(m:number,k:number){
        super(k);
        this.l = m;
    }
    value(){
        return("The value from parent is "+this.j+" Value from child "+this.l);
    }
}
let childObj = new ChildClass(12,23);
console.log(childObj.value());
//Interface in TS : Interface contains only the declaration and methods
// there will be no defination of it. when one class implemnts the interface
//it must and should implments all the methods in the interface
interface MyIntegers{
    s:number;
    t:string;
    myFun():void;
}
class A implements MyIntegers{
    s: number;
    t: string;
    constructor(s:number,t:string){
        this.s = s;
        this.t = t;
    }
    myFun(): void {
       console.log("Implemented an interface "+this.s+" value of t "+this.t);
    }
}
let interfaceObj = new A(1,"hi");
console.log(interfaceObj.myFun());