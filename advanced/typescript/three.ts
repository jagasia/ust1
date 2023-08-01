let a:number=20;
// a=<number><any>'200';
a=(('20' as unknown) as number);
console.log(typeof a)

let b:number=30;
let c=a+b;
console.log(c);

function fn1()
{
    
}