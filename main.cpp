#include <iostream>
#include <vector>

using namespace std;
bool checkSum(int arr[], int n, int arrsize);

int main()
{
    int num,sum,targetNum;
    bool isSum=true;
    cout << "How many numbers do you want to enter: ";
    cin >> num;
    int numArray[num];
    for (int i = 0; i < num; i++)
    {
        cout << "Enter the number: ";
        cin >> numArray[i];
    }
    cout << "Enter target num: ";
    cin >> targetNum;
    if (checkSum(numArray, targetNum, num))
    {
        cout << "true";
    }
    else
    {
        cout << "false";
    }
    
    return 0;
}

bool checkSum(int arr[], int target, int arrsize)
{
    for (int i = 0; i < arrsize; i++)
    {
        for (int j = i+1; j < arrsize; j++)
        {
            if (arr[i] + arr[j] == target)
            {
                return true;
            }
        }
    }
    return false;
}
