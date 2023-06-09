/*how to bind a function to an event*/

document.getElementById("btnSum").addEventListener("click",fnSum);

function fnSum()
{
    var x=parseInt(document.getElementById("no1").value);
    var y=parseInt(document.getElementById("no2").value);
    var result=x+y;
    document.getElementById("divResult").innerHTML=result;
}