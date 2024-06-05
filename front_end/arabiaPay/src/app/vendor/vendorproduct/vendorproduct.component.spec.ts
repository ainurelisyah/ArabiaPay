import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorproductComponent } from './vendorproduct.component';

describe('VendorproductComponent', () => {
  let component: VendorproductComponent;
  let fixture: ComponentFixture<VendorproductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [VendorproductComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(VendorproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
