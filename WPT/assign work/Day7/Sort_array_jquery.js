var arr=[{fname :'soham',age:23,marks:80},
    {fname:'shashank',age:25,marks:70},
    {fname:'Yuvraj',age:22,marks:60},
    {fname:'Tushar',age:26,marks:50},
]
arr.sort((s1,s2)=>{
    if(s1.age>s2.age)return 1;
    if(s1.age<s2.age)return -1;
    else return 0;
})
console.log("sorted array is",arr);