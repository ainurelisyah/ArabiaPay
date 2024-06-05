import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserexpensetrackerComponent } from './userexpensetracker.component';

describe('UserexpensetrackerComponent', () => {
  let component: UserexpensetrackerComponent;
  let fixture: ComponentFixture<UserexpensetrackerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UserexpensetrackerComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UserexpensetrackerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
