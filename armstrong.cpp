#include <iostream>
using namespace std;

int main() {
    int num=153;
    int temp = num, rem, sum = 0;

    while (temp != 0) {
        rem = temp % 10;                 
       sum = sum + (rem * rem * rem);    
        temp = temp / 10;                 
    }
    if (sum == num)
        cout << num << " is an Armstrong number.";
    else
        cout << num << " is not an Armstrong number.";

    return 0;
}