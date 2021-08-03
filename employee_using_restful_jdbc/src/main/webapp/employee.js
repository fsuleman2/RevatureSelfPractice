b1.onclick = () => {
    let url = "http://localhost:8080/employee_using_restful_jdbc/employee";
    fetch(url)
        .then(response => response.json())
        .then(res => {
            let data = "<table class='table table-striped table-bordered'> <thead class='thead-dark'><tr><th>Name</th><th>Age</th><th>City</th></thead><tbody>"
            res.forEach(e => {
                data = data + "<td>" + e.empname + "</td>";
                data = data + "<td>" + e.empage + "</td>";
                data = data + "<td>" + e.empcity + "</td></tr>";
            });
            data = data + "</tbody></table>"
            document.getElementById("results").innerHTML = data;
        })

}
b2.onclick = () => {
    let url = "http://localhost:8080/employee_using_restful_jdbc/employee";
    fetch(url,{
        method : 'POST', body : JSON.stringify({
            empname : document.getElementById('name').value,
            empage : document.getElementById("age").value,
            empcity : document.getElementById('city').value
            
        }),
        headers: {
    'Content-type': 'application/json; charset=UTF-8',
  },
    })
    alert("Record Inserted Successfully")
}
b3.onclick =() => {
    let url = "http://localhost:8080/employee_using_restful_jdbc/test";
    fetch(url)
        .then(response => response.json())
        .then(res => {
            let data = "<p>res.name</p>"
             document.getElementById("p").innerText=data;
            })
}