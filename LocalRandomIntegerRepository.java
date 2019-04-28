package borisov.tutorial;

import java.util.Random;

/**
 * Created by michaelborisov on 28/04/2019.
 *
 */
class LocalRandomIntegerRepository implements RandomIntegerRepository {

    private Random r = new Random();

    @Override
    public int getRandomInteger() {
        int bound = 100;
        return r.nextInt(bound);
    }

}
