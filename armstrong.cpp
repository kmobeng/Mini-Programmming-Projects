#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int firstnumber, secondnumber;
    cout << "Enter first number: ";
    cin >> firstnumber;
    cout << "Enter second number: ";
    cin >> secondnumber;

    for (int i = firstnumber; i <= secondnumber; i++)
    {
        int num = i, sum = 0, digits = 0;
        int temp = num;
        while (temp > 0)
        {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp > 0)
        {
            int lastdigit = temp % 10;
            sum += pow(lastdigit, digits);
            temp /= 10;
        }
        if (sum == num)
        {
            cout << num << " ";
        }
    }
    return 0;
}