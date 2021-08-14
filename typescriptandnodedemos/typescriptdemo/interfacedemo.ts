interface IEmployee{
    name : string;
    greet() : void;
    add(n1:number,n2:number):number;
    multiply(n1:number,n2:number):boolean;
}
class Employee implements IEmployee{
    name: string="Suleman";
    // name="Suleman";
    greet(): void {
        console.log("Welcome");
        // throw new Error("Method not implemented.");
    }
    add(n1: number, n2: number): number {
        return n1+n2;
        // throw new Error("Method not implemented.");
    }
    multiply(n1: number, n2: number): boolean {
        if(n1>n2){
            return true;
        }
        else{
            return false;
        }
        // throw new Error("Method not implemented.");
    }

}
let emp:IEmployee = new Employee();
console.log(emp.add(35,34));
emp.greet();
let state:boolean = emp.multiply(4,5);
console.log(state);