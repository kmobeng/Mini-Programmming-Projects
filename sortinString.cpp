#include <iostream>

using namespace std;

int main()
{
    string word;
    cout << "Enter the word: ";
    cin >> word;

    for (int i = 0; i < word.length(); i++)
    {
        int minIndex = i;
        for (int j = i + 1; j < word.length(); j++)
        {
            if (word[j] < word[minIndex])
            {
                minIndex = j;
            }
        }
        if (minIndex != i)
        {
            char temp = word[i];
            word[i] = word[minIndex];
            word[minIndex] = temp;
        }
    }

    cout << word;
    return 0;
}