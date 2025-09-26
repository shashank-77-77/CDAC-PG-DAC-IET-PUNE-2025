let arr= [[1,2,3],
         [4,5,6],
         [7,8,9]];
let arr1=[[0,0,0],
         [0,0,0],
         [0,0,0]]
for(let i=0;i<3;i++)
{
    for(let j=0;j<3;j++)
    {
        arr1[i][j]=arr[j][i];
        
    }
    //console.log("\n");
   
}
for (let i = 0; i < 3; i++) {
    console.log(arr1[i].join(" "));
}


//console.log(arr);
//console.log(arr1);