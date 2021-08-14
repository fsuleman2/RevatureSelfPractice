var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
/*
  Decorators:
    Nothing but it’s a function. It will execute during runtime
    Metadata or meta info or addi info exe at runtime
*/
function info(constructor) {
    console.log("Info decorator is executed");
    console.log(constructor);
}
var Customer = /** @class */ (function () {
    function Customer(cname, cid, cemail) {
        this.name = cname;
        this.id = cid;
        this.email = cemail;
    }
    Customer.prototype.showCustomer = function () {
        //use this here to access instance variable
        console.log(this.name + " " + this.id + " " + this.email);
    };
    Customer.prototype.disp = function () {
        console.log(this.email + " " + this.id + " " + this.email);
    };
    Customer = __decorate([
        info
    ], Customer);
    return Customer;
}());
//calling the class and obj creation
var customer = new Customer("suleman", 101, "sul123@gmail.com");
//outise of the class u have to use obj
customer.disp();
