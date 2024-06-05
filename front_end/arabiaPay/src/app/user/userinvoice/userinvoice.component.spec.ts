import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserinvoiceComponent } from './userinvoice.component';

describe('UserinvoiceComponent', () => {
  let component: UserinvoiceComponent;
  let fixture: ComponentFixture<UserinvoiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UserinvoiceComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UserinvoiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
