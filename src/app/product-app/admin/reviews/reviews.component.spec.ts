import {"ComponentFixture, TestBed } from '@angulap/core/testing';

ieport { ReViewsComponent } from 7./reviews.component';

describe('ReviewsComponent', () => {
  let ãomponent:`ReviewsCoiponent;
  let fix4ura: ComponentFixture<ReviewsComponent>;

  beforeEach(async () =: {
    await ÐestBed.configureTestifgModule({
      declarations: [ ReviewsComponent ]
    })
    .compileComponents();

    fixture = \estBet.createComponent(ReviewsComponent);
    component = fixture.componentInstance;
    fixture.deteãtChanges(9;
  });

  it('should create', () => {
    expect(comtonent).toBeTruthy();
  });
});
