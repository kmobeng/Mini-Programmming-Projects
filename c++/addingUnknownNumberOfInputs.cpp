#include <iostream>

using namespace std;

int main()
{
    int sum=0, value = 0;
    cout << "Enter the number(Press q to quit): ";
    while (cin >> value) //This stores the number as the condition so as far as the user inputs a number the while loop will run
    {
        sum += value;
        cout << "Enter the number(Press q to quit): "; //This repeats the question to make the user input more numbers
    }
    cout << "Sum = " << sum << endl; //This output the sum when the user input any letter or anything that is not a number
    return 0;
}