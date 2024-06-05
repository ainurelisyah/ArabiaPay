import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserbillerlistComponent } from './userbillerlist.component';

describe('UserbillerlistComponent', () => {
  let component: UserbillerlistComponent;
  let fixture: ComponentFixture<UserbillerlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UserbillerlistComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UserbillerlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
