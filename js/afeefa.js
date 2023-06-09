class Car {
  constructor(name, year) {
    this.name = name;
    this.year = year;
  }
}
var bmw=new Car("BMW","2020");
bmw.name="Benz";
console.log(bmw);
console.log(JSON.stringify(bmw));