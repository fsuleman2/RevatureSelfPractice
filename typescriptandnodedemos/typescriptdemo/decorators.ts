/*
  Decorators: 
    Nothing but it’s a function. It will execute during runtime
    Metadata or meta info or addi info exe at runtime
*/
function info(constructor : Function){
    console.log("Info decorator is executed");
    console.log(constructor);
}
function get(name:string){
    
}
//class level decorator
@info
class Customer{
    name : string;
    id : number;
    email : string;
    constructor(cname : string, cid : number,cemail : string){
        this.name = cname;
        this.id = cid;
        this.email = cemail;
    }
    showCustomer() : void {
        //use this here to access instance variable
        console.log(this.name+" "+this.id+" "+this.email);
    }
    disp() : void{
        console.log(this.email+" "+this.id+" "+this.email);
    }
}
//calling the class and obj creation
let customer: Customer = new Customer("suleman",101,"sul123@gmail.com");
//outise of the class u have to use obj
customer.disp();
// @get("suleman")
function hello(name:String){
    console.log("Hello"+name);
}