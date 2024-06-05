import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorlisttransactionComponent } from './vendorlisttransaction.component';

describe('VendorlisttransactionComponent', () => {
  let component: VendorlisttransactionComponent;
  let fixture: ComponentFixture<VendorlisttransactionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [VendorlisttransactionComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(VendorlisttransactionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
