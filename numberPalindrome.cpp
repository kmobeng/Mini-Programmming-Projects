#include <iostream>

using namespace std;

int main()
{
    int num,lastDigit,newnum;

    cout << "Enter the number: ";
    cin >> num;
    newnum = num;

    while (num > 0)
    {
        lastDigit = num % 10;
        newnum = newnum * 10 + lastDigit;
        num = num / 10;
    }

    cout << "The palindrome is " << newnum;
    return 0;
}