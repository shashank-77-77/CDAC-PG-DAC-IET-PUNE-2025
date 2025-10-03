let obj = {
    fname: "AAA",
    show: function () {
        console.log("in show");
        console.log(this.fname)
    }
}
obj.show();   /// AAA

let f1 = obj.show///  function call 
console.log(f1)//
f1()// undefined 

let f2 = obj
f2.show()// AAA 

//bind()

// event handler 
// reading data from input  // event occur

f1 = f1.bind(obj)
// EXPLICITLY binding the "this" with obj 
f1;  ///AAA
