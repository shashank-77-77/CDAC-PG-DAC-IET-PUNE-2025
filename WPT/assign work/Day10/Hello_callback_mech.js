function sayHello(callback)
{
    setInterval(callback,2000);
}
function display()
{
    console.log("Hello World");
}
sayHello(display)