#include <iostream>
#include <map>

using namespace std;

int main()
{
    string firstValue,secondValue,multiplier,tolerance,resistanceValue="";
    int value;
    map<string, int> multiplierMap={{"black", 1}, {"brown", 10}, {"red", 100}, {"orange", 1000}, {"yellow", 10000}, {"green", 100000}, {"blue", 1000000}, {"violet", 10000000}, {"grey", 100000000}, {"white", 1000000000}};
    map<string, int> digitMap={{"black", 0}, {"brown", 1}, {"red", 2}, {"orange", 3}, {"yellow", 4}, {"green", 5}, {"blue", 6}, {"violet", 7}, {"grey", 8}, {"white", 9}};
    cout << "enter first color: ";
    cin >> firstValue;
    cout << "enter second value: ";
    cin >> secondValue;
    cout << "enter the multiplier: ";
    cin >> multiplier;
    cout << "enter tolerance: ";
    cin >> tolerance;
    if (digitMap.count(firstValue))
    {
        value = digitMap[firstValue] * 10;
    }
    else
    {
        cout << "Invalid first color";
        return 0;
    }
    if (digitMap.count(secondValue))
    {
        value+= digitMap[secondValue];
    }
    else
    {
        cout << "Invalid second value";
        return 0;
    }
    if (multiplierMap.count(multiplier))
    {
        value *= multiplierMap[multiplier];
    }
    else
    {
        cout << "Invalid multiplier value";
        return 0;
    }
    if (tolerance == "gold")
    {
        cout << value << " ohms +-5";
    }
    else if (tolerance == "silver")
    {
        cout << value << " ohms +-10";
    }
    else
    {
        cout << "Invalid tolerance value";
        return 0;
    }
    return 0;
}