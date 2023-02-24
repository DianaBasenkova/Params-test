public class CalculationService {

    public int calculate(int expenses, int income, int threshold) {
        int count = 0;
        int i = 0;//балланс начиная с начала цикла;
        for (int month = 0; month < 12; month++)
            if (i >= threshold) {
                count++;
                i = (i - expenses) / 3;
            } else {
                i = i + income - expenses;
            }
        return count;

    }

}
