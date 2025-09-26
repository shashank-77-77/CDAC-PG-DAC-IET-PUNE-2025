function Cal(...a)
{
    let sum=0;
    for(let i=0;i<a.length;i++)
    {
        if(i%2==0)
        {
        sum=sum+a[i];
        console.log("odd numbers is " ,a[i]);
        
        }

    }
    console.log("addition of odd numbers:" , sum);
     let sum1=0;
    for(let i=0;i<a.length;i++)
    {
       sum1=sum1+a[i];
    }
    console.log("addition of all numbers:" , sum1);
    
}
Cal(1,2,3,4,5,6,7,8,9,10);