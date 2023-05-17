# Console calculator application
Simple console calculator application.
A string with an arithmetic expression between two numbers is given as input and outputs a string with the result of their execution.


Expression requirements:

    1. The calculator can perform addition, subtraction, multiplication and division operations with two numbers: a + b, a - b, a * b, a / b.
    2. The calculator can handle both Arabic (1,2,3,4,5...) and Roman (I,II,III,IV,V...) numbers.
    3. The calculator can accept numbers from 1 to 10 inclusive as input, no more. At the output the numbers are not limited in size and can be any.
    4. The calculator can only work with integers.
    5. The calculator can only work with Arabic or Roman numerals at the same time.
    6. If you enter Roman numbers, the answer will be printed in Roman numerals, respectively, if you enter Arabic numbers, the answer will be in Arabic.
    7. The result of the division operation is an integer, the remainder is discarded.
    8. The calculator with Arabic numbers can result in negative numbers and zero. The calculator with Roman numbers can only result in positive numbers.

Examples:

    Input: 7 / 2
    Output: 3

    Input: 5 % 2
    Output: Error

    Input: 2 + 8 + 4
    Output: Error

    Input: VI - IV
    Output: II

    Input: 15 * 7
    Output: Error

    Input: 5.2 - 7.8
    Output: Error

    Input: 6 - V
    Output: Error

    Input: III - V
    Output: Error
