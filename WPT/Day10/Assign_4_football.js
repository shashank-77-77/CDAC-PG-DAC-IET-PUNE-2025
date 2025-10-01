function display()
{
    for(let i =0 ;i<100 ;i++)
    {
        if(i%5==0 && i%3==0)
        {
            console.log(i + "-football")

        }
        else if(i % 3 ==0)
        {
            console.log( i + "-foot");
        }
        else if( i % 5==0 ) 
        {
            console.log(i + "-Ball");
        }
    }
}
display();