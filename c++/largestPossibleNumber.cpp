#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int num,lastDigit;
    cout << "Enter the number: ";
    cin >> num;
    vector<int> numArray;
    while (num > 0)
    {
       lastDigit = num % 10;
       numArray.push_back(lastDigit);
       num /= 10; 
    }
    for (int i = 0; i < numArray.size(); i++)
    {
        for (int j = 0; j < numArray.size(); j++)
        {
            if (numArray[j] < numArray[i])
            {
                int temp = numArray[i];
                numArray[i] = numArray[j];
                numArray[j] = temp; 
            }  
        }
    }
    for (int i = 0; i < numArray.size(); i++)
    {
        cout << numArray[i];
    }
    
    return 0;
}