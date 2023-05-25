import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'length'
})
export class LengthPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    var temp:string=<string>value;
    return temp.length;
  }

}
