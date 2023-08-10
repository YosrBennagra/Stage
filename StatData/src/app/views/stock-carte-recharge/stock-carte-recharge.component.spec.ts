import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StockCarteRechargeComponent } from './stock-carte-recharge.component';

describe('StockCarteRechargeComponent', () => {
  let component: StockCarteRechargeComponent;
  let fixture: ComponentFixture<StockCarteRechargeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StockCarteRechargeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StockCarteRechargeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
