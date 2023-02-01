import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.stats.services.StatsServices;

public class StatsServicesTest {

    @Test
    public void getSalesSum() {
        StatsServices service = new StatsServices();

        long[] sales = {1500, 2000, 500, 350, 856, 4567, 970, 120, 620, 348, 400, 150};

        long expectedSum = 12381;
        long actualSum = service.getSalesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void getMiddleSalesSum() {
        StatsServices service = new StatsServices();

        long[] sales = {1500, 2000, 500, 350, 856, 4567, 970, 120, 620, 348, 400, 150};

        long expectedSum = 1031;
        long actualSum = service.getMiddleSalesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void getMaxSalesDay() {
        StatsServices service = new StatsServices();

        long[] sales = {1500, 2000, 500, 350, 856, 4567, 970, 120, 620, 348, 400, 150};

        int expectedDay = 6;
        int actualDay = service.maxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void getMinSalesDay() {
        StatsServices service = new StatsServices();

        long[] sales = {1500, 2000, 500, 350, 856, 4567, 970, 120, 620, 348, 400, 150};

        int expectedDay = 8;
        int actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void getUnderMiddleSalesDays() {
        StatsServices service = new StatsServices();

        long[] sales = {1500, 2000, 500, 350, 856, 4567, 970, 120, 620, 348, 400, 150};

        int expectedDay = 10;
        int actualDay = service.underMiddleSalesDays(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void getOverMiddleSalesDays() {
        StatsServices service = new StatsServices();

        long[] sales = {1500, 2000, 500, 350, 856, 4567, 970, 120, 620, 348, 400, 150};

        int expectedDay = 4;
        int actualDay = service.overMiddleSalesDays(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}

