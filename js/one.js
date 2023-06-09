function isPrime(x)
{
    if(x==1)
        return false;
    if(x<=3)
        return true;
    for(var i=2;i<=Math.sqrt(x);i++)
    {
        if(x%i==0)
            return false;
    }
    return true;
}
var arr=[1,2,3,4,5,6,7,8,9,10,11];
// console.log(arr.length);
// arr=arr.filter((x)=>x>80)
arr=arr.filter((x)=>isPrime(x))
arr.forEach((x)=>console.log(x))