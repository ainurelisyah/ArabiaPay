import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UsertransactionpageComponent } from './usertransactionpage.component';

describe('UsertransactionpageComponent', () => {
  let component: UsertransactionpageComponent;
  let fixture: ComponentFixture<UsertransactionpageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UsertransactionpageComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UsertransactionpageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
