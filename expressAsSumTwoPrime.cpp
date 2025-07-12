#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int num;
    cout << "Enter the number: ";
    cin >> num;
    vector<int> primeArray;
    for (int i = 0; i <= num; i++)
    {
        if (i > 1)
        {
            int count = 0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    count ++;
                }
            }
            if (count == 2)
            {
                primeArray.push_back(i);
            }
        }
    }
    for (int i = 0; i < primeArray.size(); i++)
    {
        for (int j = i; j < primeArray.size(); j++)
        {
            if (primeArray[i] + primeArray[j] == num)
            {
                cout << "The number can be expressed as the sum of two prime numbers";
                return 0;
            }
        }
    }
    cout << "The number cannot be expressed as the sum of two prime numbers";
    return 0;
}