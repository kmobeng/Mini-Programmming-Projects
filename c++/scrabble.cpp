#include <iostream>
#include <string>

using namespace std;

int main()
{
    string word;
    int score=0;
    cout << "Enter the word: ";
    cin >> word;

    int numberArray[]={1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
    char letterArray[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    for (int i = 0; i < word.length(); i++)
    {
        if (word[i] >= 'a' && word[i]<= 'z')
        {
            word[i] = word[i] - 32;
        }
        
        for (int j = 0; j < 26; j++)
        {
            if (word[i] == letterArray[j])
            {
                score += numberArray[j];
            }
        }
    }
    cout << score;
    return 0;
}