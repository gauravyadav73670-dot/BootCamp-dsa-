#include <iostream>
using namespace std;

int main() {
    int num, reverse = 0, rem;

    cout << "Enter a number: ";
    cin >> num;

    while (num != 0) {
        rem = num % 10;               // Get last digit
        reverse = reverse * 10 + rem; // Add digit to reversed number
        num = num / 10;               // Remove last digit
    }

    cout << "Reversed number = " << reverse;

    return 0;
}