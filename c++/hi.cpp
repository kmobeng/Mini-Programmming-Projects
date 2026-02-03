#include <iostream>

using namespace std;

int main()
{
    string num;
    cout << "enter : ";
    cin >> num;
    for (int i = 0; i < num.length(); i++)
    {
        int smallestnumindex = i;
        for (int j = i + 1; j < num.length(); j++)
        {
            if (num[j] < num[smallestnumindex])
            {
                smallestnumindex = j;
            }
        }
        if (smallestnumindex != i)
        {
            char temp = num[i];
            num[i] = num[smallestnumindex];
            num[smallestnumindex] = temp;
        }
    }
    cout << num;
    return 0;
}