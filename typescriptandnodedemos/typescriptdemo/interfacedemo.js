var Employee = /** @class */ (function () {
    function Employee() {
        this.name = "Suleman";
    }
    // name="Suleman";
    Employee.prototype.greet = function () {
        console.log("Welcome");
        // throw new Error("Method not implemented.");
    };
    Employee.prototype.add = function (n1, n2) {
        return n1 + n2;
        // throw new Error("Method not implemented.");
    };
    Employee.prototype.multiply = function (n1, n2) {
        if (n1 > n2) {
            return true;
        }
        else {
            return false;
        }
        // throw new Error("Method not implemented.");
    };
    return Employee;
}());
var emp = new Employee();
console.log(emp.add(35, 34));
emp.greet();
var state = emp.multiply(4, 5);
console.log(state);
