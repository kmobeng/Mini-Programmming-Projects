#include <iostream>

using namespace std;

int main()
{
    int number;
    cout << "Enter the number: ";
    cin >> number;
    if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0)
    {
        cout << number;
    }
    if (number % 3 == 0)
    {
        cout << "Pling";
    }
    if (number % 5 == 0)
    {
        cout << "Plang";
    }
    if (number % 7 == 0)
    {
        cout << "Plong";
    }
    return 0;
}