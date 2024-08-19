class Calcular {

    public static double calculos(double num1, double num2, char math) {
        double result;
        switch(math) {
            case 'A' -> result = num1 + num2;
            case 'S' -> result = num1 - num2;
            case 'M' -> result = num1 * num2;
            case 'D' -> result = num1 / num2;
            default -> result = -1; 
        }
        return result;
    }

    public static String mathSymbol(char math) {
        String outputSymbol;
        switch(math) {
            case 'A' -> outputSymbol = "+";
            case 'S' -> outputSymbol = "-";
            case 'M' -> outputSymbol = "*";
            case 'D' -> outputSymbol = "/";
            default -> outputSymbol = "?";
        }

        return outputSymbol;
    }

}