package local.restaurant;

import javax.swing.JOptionPane;

public class Menu {

    static final String DAYS[] = new String[]{
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"};

    String plates[];
    int data[][];

    public void createMenu(int quantity) {
        plates = new String[quantity];

        for (int i = 0; i < quantity; i++) {
            plates[i] = JOptionPane.showInputDialog(
                    String.format("Insert the name of plate [%d]:", i));
        }
    }

    public void queryMenu() {
        String platesInfo = "";
        for (int i = 0; i < this.plates.length; i++) {
            platesInfo += String.format("Plate [%d]: %s\n", i, plates[i]);
        }
        JOptionPane.showMessageDialog(null, platesInfo);
    }

    public void insertData() {
        data = new int[Menu.DAYS.length][plates.length];

        for (int day = 0; day < Menu.DAYS.length; day++) {
            for (int plate = 0; plate < plates.length; plate++) {
                data[day][plate] = Integer.parseInt(JOptionPane.showInputDialog(String.format(
                        "Enter quantity of sales of plate %s for day %s:", plates[plate], Menu.DAYS[day])));
            }
        }
    }

    public int getTotalSalesPlateWeek(int plate) {
        int total = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            total += data[day][plate];
        }

        return total;
    }

    public int getDayMoreSalesPlate(int plate) {
        int bestDay = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            if (data[day][plate] > data[bestDay][plate]) {
                bestDay = day;
            }
        }

        return bestDay;
    }

    public int getDayLessSalesPlate(int plate) {
        int worstDay = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            if (data[day][plate] < data[worstDay][plate]) {
                worstDay = day;
            }
        }

        return worstDay;
    }

    public int getDaySales(int day) {
        int total = 0;

        for (int plate = 0; plate < plates.length; plate++) {
            total += plates[day][plate];
        }

        return total;
    }

    public int getDayMostSales() {
        int bestDay = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            if (this.getDaySales(day) > this.getDaySales(bestDay)) {
                bestDay = day;
            }
        }

        return bestDay;
    }

    public int getDayLessSales() {
        int worstDay = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            if (this.getDaySales(day) < this.getDaySales(worstDay)) {
                worstDay = day;
            }
        }

        return worstDay;
    }

    public int getAverageSalesDay() {
        int total = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            total += getDaySales(day);
        }

        return total / Menu.DAYS.length;
    }
}
