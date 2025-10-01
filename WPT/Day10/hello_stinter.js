function sayHello()
{
    console.log("Hello World");
}
 setInterval(sayHello,2000);

 setInterval(()=>{
    console.log(
        "Hello World");
 },2000);