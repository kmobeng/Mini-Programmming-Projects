#include <iostream>
#include <vector>

using namespace std;

int main()
{
    double value, totalyear=0;
    int years;
    double depreciatedValue;
    vector<double> depreciatedValueArray;
    vector<double> newValueArray;
    cout << "Enter the value: ";
    cin >> value;
    cout << "Enter the number of years: ";
    cin >> years;
    for (int i = 1; i <= years; i++)
    {
        totalyear += i;   
    }
    int newValue = value;
    for (int i = years; i > 0; i--)
    {
        depreciatedValue = (i / totalyear) * value;
        newValue = newValue - depreciatedValue;
        depreciatedValueArray.push_back(depreciatedValue);
        newValueArray.push_back(newValue);
    }
    
    for (int i = 0; i < years; i++)
    {
        cout << "year " << i+1 << "\t" << depreciatedValueArray[i] << "\t" << newValueArray[i] << endl;
    }
    
    return 0;
}