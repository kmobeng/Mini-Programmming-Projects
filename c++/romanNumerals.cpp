#include <iostream>

using namespace std;

int main()
{
    int num;
    string result="";
    do
    {
        cout << "Enter the number(1-3999): ";
        cin >> num;
    } while (num < 1 && num > 3999);
    
    int arabNum[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    string romanNum[] = {"M", "CM","D","CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    for (int i = 0; i < 13; i++)
    {
        while (num >= arabNum[i])
        {
            num -= arabNum[i];
            result += romanNum[i];
        }
    }
    cout << result;
    return 0;
}