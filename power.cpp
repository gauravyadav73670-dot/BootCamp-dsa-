#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int num, temp, digits = 0;
    int rem;
    long long sum = 0;

    cout << "Enter a number: ";
    cin >> num;

    temp = num;

    // Count the number of digits
    while (temp != 0) {
        digits++;
        temp /= 10;
    }

    temp = num;

    // Calculate sum of digits raised to the power of number of digits
    while (temp != 0) {
        rem = temp % 10;
        sum += pow(rem, digits);
        temp /= 10;
    }

    // Check Armstrong number
    if (sum == num)
        cout << num << " is an Armstrong number.";
    else
        cout << num << " is not an Armstrong number.";

    return 0;
}