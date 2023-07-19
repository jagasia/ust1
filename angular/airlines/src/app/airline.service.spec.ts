import { TestBed } from '@angular/core/testing';

import { AirlineService } from './airline.service';

describe('AirlineService', () => {
  let service: AirlineService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AirlineService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
