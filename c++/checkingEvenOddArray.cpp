#include <iostream>

using namespace std;
void numArray(int myArray[],int numElements);

int main()
{
    int numElements;
    cout << "How many numbers do you want to check? ";
    cin >> numElements;
    int myArray[numElements];
    for (int i = 0; i < numElements; i++) //This loops until each index in the array is filled
    {
        cout << "Enter number " << i+1 << " : ";
        cin >> myArray[i];
    }
    numArray(myArray, numElements); //Calling the function
    return 0;
}

void numArray(int myArray[],int numElements) //Takes an array and the number of elements in the array as parameters
{  
    for (int i = 0; i < numElements; i++) //This will check if there are even numbers in the numbers the user inputs. This is to prevent the cout line to print when there is no even numbers
    {
        if (myArray[i] % 2 == 0)
        {
            cout << "The even numbers are: ";
            break;
        }
    }

    for (int i = 0; i < numElements; i++) // Checks and print even numbers
    {   
        if (myArray[i] % 2 == 0)
        {
            cout << myArray[i] << ", ";
        }
    }
    cout << endl;
    
    for (int i = 0; i < numElements; i++) 
    {
        if (myArray[i] % 2 == 1)
        {
            cout << "The odd numbers are: ";
            break;
        }
    }

    for (int i = 0; i < numElements; i++) //Checks and print odd numbers
    {   
        if (myArray[i] % 2 == 1)
        {
            cout << myArray[i] << ", ";
        }
    }
}