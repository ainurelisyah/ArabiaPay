import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UsertransactionhistoryComponent } from './usertransactionhistory.component';

describe('UsertransactionhistoryComponent', () => {
  let component: UsertransactionhistoryComponent;
  let fixture: ComponentFixture<UsertransactionhistoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UsertransactionhistoryComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UsertransactionhistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
