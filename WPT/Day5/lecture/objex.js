//using JSON syntax 
obj={
fname:"ppp",
lname:"ggg",
city:"pune",
getCity:function()
{    
    return this.city
}
}
console.log(obj.city)
console.log(obj["city"])
obj.age=10
console.log(obj)

obj.showInfo = function ()
{
    console.log(this.fname,this.city)
}
console.log(obj)
obj.showInfo()
console.log(obj.getCity())

