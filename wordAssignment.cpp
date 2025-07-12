#include <iostream>
#include <vector>

using namespace std;

int main()
{
    string sentence,wordWithMostVowels="",word="";
    int countword=0,longestlength=0,maxVowels=0;
    vector<string> wordArray;

    cout << "Enter the sentence: \n";
    getline(cin , sentence);
    for (int i = 0; i < sentence.length(); i++)
    {
        if (sentence[i] == ' ')
        {
            if (!word.empty())
            {
                wordArray.push_back(word);
                countword++;
                word="";
            }   
        }
        else
        {
            word+= sentence[i];
        }
    }
    
    if (!word.empty())
    {
        wordArray.push_back(word);
        countword++;
    }

    for (int i = 0; i < countword-1; i++)
    {
        int length = wordArray[i].length();
        int vowelCount = 0;
        for (int j = 0; j < wordArray[i].length(); j++)
        {
            if (wordArray[i][j] == 'a' || wordArray[i][j] == 'e' || wordArray[i][j] == 'i' || wordArray[i][j] == 'o' || wordArray[i][j] == 'u' || wordArray[i][j] == 'A' || wordArray[i][j] == 'E' || wordArray[i][j] == 'I' || wordArray[i][j] == 'O' || wordArray[i][j] == 'U')
            {
                vowelCount++;
            }
        }
        if (length > longestlength)
        {
            longestlength = length;
        }
        if (vowelCount > maxVowels)
        {
            maxVowels = vowelCount;
            wordWithMostVowels = word;
        }
    }
    
    cout << "Number of words: " << countword << endl;
    cout << "Length of longest word: " << longestlength << endl;
    cout << "Most vowels in a word: " << maxVowels << endl;
    cout << "Word with most vowels: " << wordWithMostVowels << endl;
    return 0;
}