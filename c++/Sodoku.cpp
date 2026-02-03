#include <iostream> 

using namespace std;

int main()
{
    int grid[9],value;
    bool isDuplicate = false;
    for (int i = 0; i < 9; i++)
    {
        cout << "Enter the number to fill the grid: ";
        cin >> grid[i];
    }

    for (int i = 0; i < 9; i++)
    {
        for (int j = 0; j < 9; j++)
        {
            if (i != j && grid[i] == grid[j])
            {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate)
        {
            cout << "Duplicate found! Invalid!";
            return 0;
        }
    }

    for (int i = 0; i < 9; i++)
    {
        if (grid[i] < 1 || grid[i] > 9)
        {
            cout << "Invalid number found!";
            return 0;
        }
    }

    cout << "The 3x3 grid " << endl;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << grid[i * 3 + j] << " ";
        }
        cout << endl;
    }
    
    return 0;
}