A Demo Of The Java Calculator

![Image](https://github.com/user-attachments/assets/2fb5d250-123a-4628-95af-48f6986d0497)

# Java Calculator Application

A simple Java-based calculator that performs basic arithmetic operations, including addition, subtraction, multiplication, division, exponentiation, and square root calculations.

## Features
- Addition
- Subtraction
- Multiplication
- Division (with zero handling)
- Power (Exponentiation: a^b)
- Square Root (with validation for negative numbers)

## Prerequisites
Ensure you have the following installed on your system:
- [Java Development Kit (JDK 8 or higher)](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [Git (for version control)](https://git-scm.com/)

## How to Run the Project

### Running in Eclipse
1. Clone the repository (if not already cloned):
   ```sh
   git clone https://github.com/yourusername/CalculatorApp.git
   ```
2. Open **Eclipse IDE**.
3. Click on **File > Open Projects from File System...**.
4. Select the cloned project directory and click **Finish**.
5. Right-click the `Main.java` file inside `com.example.calculator` package.
6. Select **Run As > Java Application**.

### Running from the Command Line
1. Navigate to the project directory:
   ```
   cd CalculatorApp/src
   ```
2. Compile the Java files:
   ```
   javac com/example/calculator/*.java
   ```
3. Run the application:
   ```
   java com.example.calculator.Main
   ```

## Usage
- Run the program and follow the on-screen instructions to choose an operation.
- Input the required numbers.
- View the formatted result.
- Choose whether to continue or exit.

## Error Handling
- Prevents division by zero with an appropriate error message.
- Ensures valid numerical input with error handling.
- Checks for invalid menu selections and provides guidance.

## Contributing
1. Fork the repository.
2. Create a new branch:
    ```
   git checkout -b feature-branch-name
   ```
3. Make your changes and commit:
 ```
   git commit -m "Your commit message"
   ```
4. Push to your fork:
   ```
   git push origin feature-branch-name
   ```
5. Submit a pull request.

## License
This project is licensed under the **MIT License** - see the `LICENSE` file for details.



