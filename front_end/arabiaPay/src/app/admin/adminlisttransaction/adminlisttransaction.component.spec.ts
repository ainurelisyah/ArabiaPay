import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminlisttransactionComponent } from './adminlisttransaction.component';

describe('AdminlisttransactionComponent', () => {
  let component: AdminlisttransactionComponent;
  let fixture: ComponentFixture<AdminlisttransactionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdminlisttransactionComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminlisttransactionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
