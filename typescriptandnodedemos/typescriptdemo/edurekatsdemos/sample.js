var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
//Basic DataTypes
/**
 * var [identifier] : [type-annotation] = value;
 * var [identifier] : [type-annotation];
 * var [identifier] = value;
 * var [identifer];
 * 1. Boolean
 * 2.Number
 * 3.Strings
 */
var b = false;
console.log(b);
var n = 2; //for octal 0o123;0b123,0x123;
console.log(n);
var fName = "Suleman";
console.log(fName);
var arr_1st_method = ["Ts", "JS"];
var arr_2nd_method = ["TS", "Js"];
//Tuples
var tup;
//constants
var const_var = 10;
//enum: enums in JS allows to define set of named constant
//1.numeric enum
var fruit;
(function (fruit) {
    fruit[fruit["apple"] = 1] = "apple";
    fruit[fruit["banana"] = 2] = "banana";
    fruit[fruit["mango"] = 3] = "mango";
    fruit[fruit["orange"] = 4] = "orange"; //4
    //here banana mango and orange auto incremented
    //banana will be 2 mango will be 3 and orange wil be 3
})(fruit || (fruit = {}));
var fruitName = fruit[4];
console.log(fruitName);
//any time when u do not know data type value to avoid compile time error
var any_var;
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
var obj;
//diff b/w let and var
function myfun() {
    for (var i = 1; i <= 2; i++) {
        console.log("Welcome: " + i);
    }
    console.log("Final value of i is:" + i);
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
function product(x, y) {
    return x + y;
}
console.log(product(2, 3));
//annoymous function
var w = function (x, y) {
    return x * y;
};
console.log(w(2, 4));
//arrow function
var arrowFun = function () { return console.log("Hello"); };
//Classes in TS
var MyClass = /** @class */ (function () {
    function MyClass(k) {
        this.j = k;
    }
    MyClass.prototype.value = function () {
        return ("The number is " + this.j);
    };
    return MyClass;
}());
var myobj = new MyClass(7);
console.log(myobj.value());
//inheritance in TS 
/**child classes can inherit everything except private members
 * and constructors from the parent class
 * TS does not support multiple inheritance
 * it uses extends keywords
 * we can also use private,protected and public
 */
var ParentClass = /** @class */ (function () {
    function ParentClass(k) {
        this.j = k;
    }
    ParentClass.prototype.value = function () {
        return ("The number is " + this.j);
    };
    return ParentClass;
}());
var ChildClass = /** @class */ (function (_super) {
    __extends(ChildClass, _super);
    function ChildClass(m, k) {
        var _this = _super.call(this, k) || this;
        _this.l = m;
        return _this;
    }
    ChildClass.prototype.value = function () {
        return ("The value from parent is " + this.j + " Value from child " + this.l);
    };
    return ChildClass;
}(ParentClass));
var childObj = new ChildClass(12, 23);
console.log(childObj.value());
var A = /** @class */ (function () {
    function A(s, t) {
        this.s = s;
        this.t = t;
    }
    A.prototype.myFun = function () {
        console.log("Implemented an interface " + this.s + " value of t " + this.t);
    };
    return A;
}());
var interfaceObj = new A(1, "hi");
console.log(interfaceObj.myFun());
