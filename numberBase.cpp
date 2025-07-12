#include <iostream>

using namespace std;

int main()
{
    int num, base;
    cout << "Enter the number: ";
    cin >> num;
    cout << "Enter the base you want to change to: ";
    cin >> base;
    
    int multiplier = 1, newNum = 0;
    while (num > 0)
    {
        newNum += (num % base) * multiplier;
        num = num / base;
        multiplier*= 10;
    }
    cout << "Your new number is " << newNum;
    return 0;
}