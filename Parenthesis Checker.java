Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < x.length(); i++) {
            char currentChar = x.charAt(i);
            
            if (currentChar == '(' || 
            currentChar == '[' || 
            currentChar == '{') {
                 s.push(currentChar);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                
                char topChar = s.pop();
                 if ((currentChar == ')' && topChar != '(') ||
                    (currentChar == '}' && topChar != '{') ||
                    (currentChar == ']' && topChar != '[')) {
                    return false;
                }
            }
           
        }
          return s.isEmpty();