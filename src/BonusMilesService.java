public class BonusMilesService {

    public int calculate(int cost) {
        int bonusMilePrice = 20;
        int miles = cost / bonusMilePrice;
        return miles;
    }
}
