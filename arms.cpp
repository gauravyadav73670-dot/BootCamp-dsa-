#include <iostream>
using namespace std;

int main() {
    int num, temp, rem, sum = 0;

    cout << "Enter a number: ";
    cin >> num;

    temp = num; // Store original number

    while (temp != 0) {
        rem = temp % 10;                  // Extract last digit
        sum = sum + (rem * rem * rem);    // Add cube of the digit
        temp = temp / 10;                 // Remove last digit
    }

    if (sum == num)
        cout << num << " is an Armstrong number.";
    else
        cout << num << " is not an Armstrong number.";

    return 0;
}