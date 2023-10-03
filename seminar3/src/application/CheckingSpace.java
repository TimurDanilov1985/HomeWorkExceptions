package seminar3.src.application;

public class CheckingSpace {
    public boolean check(String str) {
        for (char c: str.toCharArray()) {
            if (c == ' ' | c == '!' | c == '@' | c == '#' | c == '$' | c == '%' | c == '^' | c == '&'
            | c == '*' | c == '(' | c == ')' | c == '_' | c == '-' | c == '+' | c == '=' | c == '{'
            | c == '}' | c == '[' | c == ']' | c == ':' | c == ';' | c == '"' | c == '|' | c == '<' | c == '>'
            | c == '?' | c == '/' | c == '\'' | c == '\"' | c == '\\' | c == ',' | c == '.') {
                return true;
            }
        }
        return false;
    }
}
