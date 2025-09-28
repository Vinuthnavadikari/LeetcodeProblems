class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(toDays(date1) - toDays(date2));
    }

    private int toDays(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int days = 0;

        
        for (int y = 1971; y < year; y++) {
            days += isLeap(y) ? 366 : 365;
        }

        
        for (int m = 1; m < month; m++) {
            days += daysInMonth[m - 1];
            if (m == 2 && isLeap(year)) days++;
        }

        days += day;

        return days;
    }

    private boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
