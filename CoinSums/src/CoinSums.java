
public class CoinSums {

    /*
    In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

    1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
    It is possible to make £2 in the following way:

    1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
    How many different ways can £2 be made using any number of coins?
     */

    protected static int coinSums(final int[] coinSizes){
        final int biggestCoin = coinSizes[coinSizes.length - 1];
        // Array to hold ways we can give back to 1p, 2p, 3p, 4p, 5p 6p etc etc.
        int[] ways = new int[biggestCoin + 1];
        // Start condition
        ways[0] = 1;
        // For every coin there is
        for (final int coinSize : coinSizes) {
            // i = current coin .. to biggest coin
            for (int i = coinSize; i <= biggestCoin; i++){
                // First iteration ways is filled with ones.
                // The number of ways we can give change to i is 1 + number of ways we can give back to i - current coin.
                ways[i] = ways[i] + ways[i - coinSize];
            }
        }
        return ways[biggestCoin];
    }
}
