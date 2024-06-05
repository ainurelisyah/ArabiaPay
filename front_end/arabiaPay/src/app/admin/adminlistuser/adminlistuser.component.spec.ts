import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminlistuserComponent } from './adminlistuser.component';

describe('AdminlistuserComponent', () => {
  let component: AdminlistuserComponent;
  let fixture: ComponentFixture<AdminlistuserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AdminlistuserComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AdminlistuserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
