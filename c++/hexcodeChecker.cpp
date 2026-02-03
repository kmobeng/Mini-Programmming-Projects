#include <iostream>

using namespace std;

int main()
{
    string word;
    cout << "Enter the word: ";
    cin >> word;
    
    if (word.length() == 7 && word[0] == '#')
    {
        bool valid = true;
        for (int i = 1; i < word.length(); i++)
        {
            if (!(word[i] >= '0' && word[i] <= '9') && !(word[i] >= 'A' && word[i] <= 'F') && !(word[i] >= 'a' && word[i] <= 'f'))
            {
                valid = false;
                break;
            }
        } 
        if (valid)
        {
            cout << "Valid";
        }
        else
        {
            cout << "Invalid";
        }
    }
    else
    {
        cout << "Invalid";
    }
    
    return 0;
}