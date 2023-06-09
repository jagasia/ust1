import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'blue'
})
export class BluePipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return "<font color='blue'>"+value+"</font>";
  }

}
