import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminlistvendorComponent } from './adminlistvendor.component';

describe('AdminlistvendorComponent', () => {
  let component: AdminlistvendorComponent;
  let fixture: ComponentFixture<AdminlistvendorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdminlistvendorComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminlistvendorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
