#include <iostream>
using namespace std;

int main() {
    int n, count = 0;

    cout << "Enter a number: ";
    cin >> n;

    for (int i = 1; i <= n; i++) {
        if (i % 2 != 0) {
            count++;
        }
    }

    cout << "Number of odd numbers from 1 to " << n << " is: " << count;

    return 0;
}