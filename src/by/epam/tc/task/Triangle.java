package by.epam.tc.task;

class Triangle {


    private double firstCathetus;
    private double secondCathetus;

    public double getFirstCathetus() {
        return firstCathetus;
    }

    public void setFirstCathetus(double value) {
        if (value > 0) {
            firstCathetus = value;
        } else {
            System.out.println("Значение катета не может быть отрицательным");

        }
    }

    public double getSecondCathetus() {
        return secondCathetus;
    }

    public void setSecondCathetus(double value) {
        if (value > 0) {
            secondCathetus = value;
        } else {
            System.out.println("Значение катета не может быть отрицательным");
        }
    }


}
