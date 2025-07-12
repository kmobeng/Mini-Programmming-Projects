#include <iostream>
#include <string>
using namespace std;

int main()
{
    string word, newWord = "";
    cout << "Enter the word: ";
    getline(cin, word); 

    for (int i = 0; i < word.length(); )
    {
        int count = 1;
        while (i + count < word.length() && word[i] == word[i + count])
        {
            count++;
        }
        if (count == 1)
        {
            newWord += word[i];
        }
        else
        {
            newWord += to_string(count) + word[i];
        }
        i += count;
    }

    cout << newWord;
    return 0;
}