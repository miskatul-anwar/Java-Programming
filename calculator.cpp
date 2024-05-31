#include "bits/stdc++.h"
using namespace std;

int check_operations(string input);

int main() {
  string input;
  getline(cin, input);
  cout << check_operations(input);
  return 0;
}

int check_operations(string input) {
  size_t pos = 0;
  if ((pos = input.find("+")) != string::npos) {
    return stoi(input.substr(0, pos)) +
           stoi(input.substr(pos + 1, input.length()));
  }
  return 0;
}
