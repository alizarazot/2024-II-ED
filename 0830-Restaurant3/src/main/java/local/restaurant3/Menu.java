package local.restaurant3;

import javax.swing.JOptionPane;

public class Menu {

    static final String DAYS[] = new String[]{
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"};

    Plate plates[];
    int data[][];

    public void createMenu(int quantity) {
        plates = new Plate[quantity];

        for (int i = 0; i < quantity; i++) {
            Plate plate = new Plate();

            plate.setName(JOptionPane.showInputDialog("Insert a plate name:"));
            plate.setCostProduction(Integer.parseInt(
                    JOptionPane.showInputDialog(
                            String.format("Insert the cost of production of the plate %s:", plate.getName())
                    )
            ));
            plate.setSalesPrice(Integer.parseInt(
                    JOptionPane.showInputDialog(
                            String.format("Insert the sales price of the plate %s:", plate.getName())
                    )
            ));

            plates[i] = plate;
        }
    }

    public void queryMenu() {
        String platesInfo = "";
        for (int i = 0; i < this.plates.length; i++) {
            platesInfo += String.format("Plate %s: $%d\n", plates[i].getName(), plates[i].getSalesPrice());
        }
        JOptionPane.showMessageDialog(null, platesInfo);
    }

    public void insertData() {
        data = new int[Menu.DAYS.length][plates.length];

        for (int day = 0; day < Menu.DAYS.length; day++) {
            for (int plate = 0; plate < plates.length; plate++) {
                data[day][plate] = Integer.parseInt(JOptionPane.showInputDialog(String.format(
                        "Enter quantity of sales of plate %s for day %s:", plates[plate].getName(), Menu.DAYS[day])));
            }
        }
    }

    public void showInformationFrame() {
        AnalizeInformationWindow.main(this);
    }

    public int getTotalSalesMoney() {
        int total = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            for (int plateID = 0; plateID < plates.length; plateID++) {
                total += data[day][plateID] * plates[plateID].getSalesPrice();
            }
        }

        return total;
    }

    public int getTotalCostProduction() {
        int total = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            for (int plateID = 0; plateID < plates.length; plateID++) {
                total += data[day][plateID] * plates[plateID].getCostProduction();
            }
        }

        return total;
    }

    public int getTotalProfit() {
        return getTotalSalesMoney() - getTotalCostProduction();
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
            total += data[day][plate];
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

    public float getAverageSalesDay() {
        int total = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            total += getDaySales(day);
        }

        return total / Menu.DAYS.length;
    }

    public float getAverageSalesPlate() {
        int total = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            total += getDaySales(day);
        }

        return total / plates.length;
    }

    public int getTotalSales() {
        int total = 0;

        for (int day = 0; day < Menu.DAYS.length; day++) {
            total += getDaySales(day);
        }

        return total;
    }
}
