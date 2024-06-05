import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ForgotpageComponent } from './forgotpage.component';

describe('ForgotpageComponent', () => {
  let component: ForgotpageComponent;
  let fixture: ComponentFixture<ForgotpageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ForgotpageComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ForgotpageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
