public static double add(double a, double b) {
    return a + b;
}

public static double subtract(double a, double b) {
    return a - b;
}

public static double multiply(double a, double b) {
    return a * b;
}

public static double divide(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("Division by zero");
    }
    return a / b;
}

public static double calculate(double a, char op, double b) {
    switch (op) {
        case '+':
            return add(a, b);
        case '-':
            return subtract(a, b);
        case '*':
            return multiply(a, b);
        case '/':
            return divide(a, b);
        default:
            throw new IllegalArgumentException("Unsupported operator: " + op);
    }
}

void main() {
    Scanner scanner = new Scanner(System.in);
    IO.println("Enter an expression like '2 + 3' (type 'exit' to quit):");
    while (true) {
        IO.print("> ");
        if (!scanner.hasNextLine()) {
            break;
        }
        String line = scanner.nextLine().trim();
        if (line.equalsIgnoreCase("exit")) {
            break;
        }
        if (line.isEmpty()) {
            continue;
        }
        String[] parts = line.split("\\s+");
        if (parts.length != 3 || parts[1].length() != 1) {
            IO.println("Error: expected format '<number> <operator> <number>'");
            continue;
        }
        try {
            double a = Double.parseDouble(parts[0]);
            double b = Double.parseDouble(parts[2]);
            IO.println(calculate(a, parts[1].charAt(0), b));
        } catch (NumberFormatException e) {
            IO.println("Error: invalid number");
        } catch (ArithmeticException | IllegalArgumentException e) {
            IO.println("Error: " + e.getMessage());
        }
    }
    scanner.close();
}
