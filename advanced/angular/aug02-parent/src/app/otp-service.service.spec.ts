import { TestBed } from '@angular/core/testing';

import { OtpServiceService } from './otp-service.service';

describe('OtpServiceService', () => {
  let service: OtpServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OtpServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
